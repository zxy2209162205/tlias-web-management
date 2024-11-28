package com.hz.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hz.mapper.EmpMapper;
import com.hz.pojo.Emp;
import com.hz.pojo.PageBean;
import com.hz.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName tlias-web-management
 * @Description TODO
 * @Author Zhao Xuyang
 * @Date 2024/11/27 16:54
 */
@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

//    @Override
//    public PageBean page(Integer page, Integer pageSize) {
//        //获取总记录数
//        Long count = empMapper.count();
//        //获取分页查询结果列表
//        Integer start = (page - 1) * pageSize;//计算起始索引
//        List empList = empMapper.list(start,pageSize);
//
//        //封装PageBean对象
//        PageBean pageBean = new PageBean(count,empList);
//        return pageBean;
//    }


    @Override
    public PageBean page(Integer page, Integer pageSize) {
        // 设置分页参数
        PageHelper.startPage(page, pageSize);
        // 执行分页查询
        List<Emp> empList = empMapper.page();
        // 获取分页结果
        Page<Emp> p = (Page<Emp>) empList;
        //封装PageBean
        PageBean pageBean = new PageBean(p.getTotal(), p.getResult());
        return pageBean;
    }

}
