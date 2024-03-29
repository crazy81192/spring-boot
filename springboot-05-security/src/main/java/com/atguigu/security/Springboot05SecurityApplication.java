package com.atguigu.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.引入SpringSecurity
 * 2.编写引入SpringSecurity的配置类
 * 		@EnableWebSecurity
 * 3.控制请求的访问权限
 */
@SpringBootApplication
public class Springboot05SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot05SecurityApplication.class, args);
	}

}
