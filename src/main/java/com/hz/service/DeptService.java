package com.hz.service;

import com.hz.pojo.Dept;

import java.util.List;

/**
 * @ProjectName tlias-web-management
 * @Description TODO
 * @Author Zhao Xuyang
 * @Date 2024/11/27 16:51
 */
public interface DeptService {
    /**
     * 查询所有部门的数据
     * @return 存储Dept对象的集合
     */
    List<Dept> list();

    /**
     * 根据id删除部门
     * @param id 部门id
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param dept 部门对象
     */
    void add(Dept dept);

    /**
     * 修改部门
     * @param dept 部门对象
     */
    void edit(Dept dept);
}
