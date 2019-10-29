package com.atguigu.security.config;

import com.sun.org.apache.xpath.internal.operations.And;
import org.springframework.boot.autoconfigure.security.SpringBootWebSecurityConfiguration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.servlet.annotation.ServletSecurity;

/**
 * @author ming
 * @create 2019-08-24 21:22
 */
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        //定制请求的授权规则
        http.authorizeRequests().antMatchers("/").permitAll()
                                .antMatchers("/level1/**").hasRole("VIP1")
                                .antMatchers("/level2/**").hasRole("VIP2")
                                .antMatchers("/level3/**").hasRole("VIP3");
        //开启自动配置的登录功能；如果没有登录权限就来到登录页面
        http.formLogin().usernameParameter("user").passwordParameter("pwd").loginPage("/userlogin");
        //1. /login来到登录页
        //2. 重定向到/login?error表示登录失败
        //3.更多详细规则
        //4.默认post形式的/login代表处理登录
        //5.一旦定制loginPage,那么 loginPage的post请求就是登录

        //4.开启自动配置的注销
        http.logout().logoutSuccessUrl("/");
        //1.访问 /logout 表示用户注销，清空session
        //2.注销成功会返回 /login?logout页面

        //开启记住我功能
        http.rememberMe().rememberMeParameter("remember");
        //登录成功以后，将cookie发送给浏览器保存
        //点击注销删除cookie

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);
        auth.inMemoryAuthentication().withUser("zhangsan").password("123456").roles("VIP1","VIP2")
                                      .and()
                                      .withUser("lisi").password("123456").roles("VIP2","VIP3")
                                      .and()
                                      .withUser("wangwu").password("123456").roles("VIP1","VIP3");
    }
}
