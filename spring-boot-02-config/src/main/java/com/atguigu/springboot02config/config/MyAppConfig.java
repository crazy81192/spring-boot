package com.atguigu.springboot02config.config;

import com.atguigu.springboot02config.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ming
 * @create 2019-08-15 7:43
 */

/**
 * @Configuration 指明当前类是一个配置类,就是来替代Spring的配置文件
 *
 * 在配置文件中使用<bean></bean>标签添加组件
 */
@Configuration
public class MyAppConfig {

    @Bean   //将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加组件了");
        return  new HelloService();
    }
}
