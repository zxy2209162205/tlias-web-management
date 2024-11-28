package com.hz.controller;

import com.hz.pojo.PageBean;
import com.hz.pojo.Result;
import com.hz.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName tlias-web-management
 * @Description TODO
 * @Author Zhao Xuyang
 * @Date 2024/11/27 16:56
 */
@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer pageSize) {
        log.info("分页查询，参数：{},{}",page,pageSize);
        PageBean pageBean = empService.page(page,pageSize);
        return Result.success(pageBean);
    }
}
