package com.atguigu.cache.service;

import com.atguigu.cache.bean.Department;
import com.atguigu.cache.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.stereotype.Service;

/**
 * @author ming
 * @create 2019-08-22 23:18
 */
@Service
public class DeptService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    RedisCacheManager redisCacheManager;

//    @Cacheable(cacheNames = "dept")
//    public Department getDeptById(Integer id){
//        System.out.println("查询部门" + id);
//        Department department = departmentMapper.getDeptById(id);
//        return department;
//    }

    //使用缓存管理器得到缓存，进行api调用
    public Department getDeptById(Integer id){
        System.out.println("查询部门" + id);
        Department department = departmentMapper.getDeptById(id);
        //获取某个缓存
        Cache dept = redisCacheManager.getCache("dept");
        dept.put("dept:1",department);
        return department;
    }
}
