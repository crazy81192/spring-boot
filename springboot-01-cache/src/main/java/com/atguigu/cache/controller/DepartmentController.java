package com.atguigu.cache.controller;

import com.atguigu.cache.bean.Department;
import com.atguigu.cache.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ming
 * @create 2019-08-22 23:23
 */
@RestController
public class DepartmentController {

    @Autowired
    DeptService deptService;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id){
        Department dept = deptService.getDeptById(id);
        return dept;
    }
}
