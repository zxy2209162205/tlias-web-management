package com.hz.service;

import com.hz.pojo.PageBean;

/**
 * @ProjectName tlias-web-management
 * @Description TODO
 * @Author Zhao Xuyang
 * @Date 2024/11/27 16:54
 */
public interface EmpService {
    /**
     * 条件分页查询
     * @param page 页码
     * @param pageSize 每页展示记录数
     * @return pagebean
     */
    PageBean page(Integer page, Integer pageSize);
}
