package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ming
 * @create 2019-08-14 11:40
 */
//这个类的所有方法返回的数据直接写给浏览器(如果是对象转为json数据)
/*@ResponseBody
@Controller*/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick";
    }
}
