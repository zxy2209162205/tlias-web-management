package com.hz.mapper;

import com.hz.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ProjectName tlias-web-management
 * @Description TODO
 * @Author Zhao Xuyang
 * @Date 2024/11/27 16:49
 */
@Mapper
public interface DeptMapper {
    @Select("select id,name,create_time,update_time from dept")
    List<Dept> list();

    /**
     * 根据id删除部门信息
     * @param id 部门id
     */
    @Delete("delete from dept where id = #{id}")
    void delete(Integer id);


    /**
     * 新增部门
     * @param dept 部门对象
     */
    @Insert("insert into dept(name,create_time,update_time) values (#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);
    @Update("update dept set name = #{name},create_time = #{createTime},update_time = #{updateTime} where id = #{id}")
    void edit(Dept dept);
}
