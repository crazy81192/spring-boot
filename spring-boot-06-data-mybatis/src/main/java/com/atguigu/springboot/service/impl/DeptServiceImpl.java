package com.atguigu.springboot.service.impl;

import com.atguigu.springboot.bean.Dept;
import com.atguigu.springboot.mapper.DeptDao;
import com.atguigu.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ming
 * @create 2019-10-18 18:38
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;

    @Override
    public boolean addDept(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return dao.findAll();
    }
}
