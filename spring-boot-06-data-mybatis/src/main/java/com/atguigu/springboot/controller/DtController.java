package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.Dept;
import com.atguigu.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ming
 * @create 2019-10-18 18:52
 */
@RestController
public class DtController {
    @Autowired
    private DeptService service;

    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return service.addDept(dept);
    }
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id) {
        return service.findById(id);
    }
    @GetMapping("/dept/list")
    public List<Dept> list(){
        return service.findAll();
    }
}
