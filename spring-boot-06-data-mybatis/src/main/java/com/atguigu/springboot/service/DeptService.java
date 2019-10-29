package com.atguigu.springboot.service;

import com.atguigu.springboot.bean.Dept;

import java.util.List;

/**
 * @author ming
 * @create 2019-10-18 18:37
 */
public interface DeptService {
    public boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
