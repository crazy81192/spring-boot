package com.atguigu.springboot.entity;

import javax.persistence.*;

/**
 * @author ming
 * @create 2019-08-20 20:10
 */

//使用JPA注解配置映射关系
 @Entity //告诉JPA这是一个实体类(和数据表映射的类)
 @Table(name = "tbl_user") //@Table 来指定和哪个数据表对应，如果省略默认表名是user
public class User {

     @Id //这是一个主键
     @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;

     @Column(name = "last_name",length = 50)
    private String lastName;
     @Column //省略默认属性名就是列名
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
