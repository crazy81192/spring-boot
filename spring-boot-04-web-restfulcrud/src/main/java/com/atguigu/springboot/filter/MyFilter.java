package com.atguigu.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author ming
 * @create 2019-08-18 17:01
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MY FILTERPROCESS");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
