package com.atguigu.springboot02config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:applicationContext.xml"})	//导入Spring的配置文件
//SpringBoot推荐给容器中添加组件的方式(全注解的方式)		配置类====Spring配置文件

@SpringBootApplication
public class SpringBoot02ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot02ConfigApplication.class, args);
	}

}
