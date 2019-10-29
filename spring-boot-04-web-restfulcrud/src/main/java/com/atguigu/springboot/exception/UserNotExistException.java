package com.atguigu.springboot.exception;

/**
 * @author ming
 * @create 2019-08-18 11:22
 */
public class UserNotExistException extends RuntimeException {
    public UserNotExistException(){
        super("用户不存在");
    }
}
