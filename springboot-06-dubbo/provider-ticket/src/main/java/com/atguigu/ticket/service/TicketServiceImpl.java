package com.atguigu.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author ming
 * @create 2019-08-24 23:27
 */
@Component
@Service    //将服务发送出去
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        return "《牛逼了，我的国》";
    }
}
