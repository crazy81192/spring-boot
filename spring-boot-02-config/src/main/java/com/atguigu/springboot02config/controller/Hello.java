package com.atguigu.springboot02config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ming
 * @create 2019-08-14 22:29
 */
@RestController
public class Hello {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello Ok " + name;
    }
}
