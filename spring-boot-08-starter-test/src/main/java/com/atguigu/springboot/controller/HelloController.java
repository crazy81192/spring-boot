package com.atguigu.springboot.controller;

import com.atguigu.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ming
 * @create 2019-08-21 0:09
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        return helloService.sayHelloAtguigu("zhang");
    }
}
