package com.atguigu.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author ming
 * @create 2019-10-18 18:34
 */
@SuppressWarnings("serial")
@AllArgsConstructor    //全参
@NoArgsConstructor    //空参
@Data    //getter setter
@Accessors(chain=true)
public class Dept implements Serializable {
    private Long deptno;	//主键
    private String dname;	//部门名称
    private String db_source;	//来自哪个数据库，因为微服务框架一个服务可以对应一个数据库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}
