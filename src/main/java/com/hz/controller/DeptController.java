package com.hz.controller;

import com.hz.pojo.Dept;
import com.hz.pojo.Result;
import com.hz.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ProjectName tlias-web-management
 * @Description TODO
 * @Author Zhao Xuyang
 * @Date 2024/11/27 16:56
 */
@Slf4j
@RestController
@RequestMapping("depts")
public class DeptController {
    @Autowired
    private DeptService deptService;


    @GetMapping
    public Result list(){
        log.info("查询所有部门信息");
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门");
        deptService.delete(id);
        return Result.success();
    }

    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("新增部门");
        deptService.add(dept);
        return Result.success();
    }
    @PutMapping
    public Result edit(@RequestBody Dept dept){
        deptService.edit(dept);
        return Result.success();
    }

}
