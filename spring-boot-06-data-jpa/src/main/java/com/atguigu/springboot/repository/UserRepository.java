package com.atguigu.springboot.repository;

import com.atguigu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ming
 * @create 2019-08-20 20:20
 */
//继承 JpaRepository 来完成对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer> {


}
