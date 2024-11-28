package com.hz.mapper;

import com.hz.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ProjectName tlias-web-management
 * @Description TODO
 * @Author Zhao Xuyang
 * @Date 2024/11/27 16:50
 */
@Mapper
public interface EmpMapper {
//    /**
//     * 获取总记录数
//     * @return 总记录数
//     */
//    @Select("select count(*) from emp")
//    Long count();
//
//    /**
//     * 获取当前页的结果列表
//     * @param start 起始索引
//     * @param pageSize 每页记录数
//     * @return 当前页的结果列表
//     */
//    @Select("select * from emp limit #{start},#{pageSize}")
//    List<Emp> list(Integer start, Integer pageSize);

    //获取当前页的结果列表
    @Select("select * from emp")
    public List<Emp> page(Integer start, Integer pageSize);
}
