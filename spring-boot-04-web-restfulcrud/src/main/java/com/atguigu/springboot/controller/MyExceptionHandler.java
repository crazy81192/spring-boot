package com.atguigu.springboot.controller;

import com.atguigu.springboot.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ming
 * @create 2019-08-18 11:31
 */
@ControllerAdvice
public class MyExceptionHandler {

    //1.浏览器服务器返回的都是json
    /*@ResponseBody
    @ExceptionHandler(UserNotExistException.class)
    public Map<String, Object> handlerException(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("code","user.notexist");
        map.put("message",e.getMessage());
        return map;
    }*/

    @ExceptionHandler(UserNotExistException.class)
    public String handlerException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();

        //传入我们自己的错误状态码
        request.setAttribute("javax.servlet.error.status_code",500);

        map.put("code","user.notexist");
        map.put("message",e.getMessage());

        request.setAttribute("ext",map);

        //转发到/error
        return "forward:/error";
    }
}
