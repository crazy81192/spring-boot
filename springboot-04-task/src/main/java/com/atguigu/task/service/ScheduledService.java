package com.atguigu.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author ming
 * @create 2019-08-24 17:40
 */
@Service
public class ScheduledService {

    /**
     * second,minute,hour,day of month,month,day of week
     */
    //@Scheduled(cron = "0 * * * * MON-SAT")
    //@Scheduled(cron = "0,1,2,3,4 * * * * MON-SAT")
    //@Scheduled(cron = "0-4 * * * * MON-SAT")
    @Scheduled(cron = "0/4 * * * * MON-SAT")//每隔4秒执行一次
    public void hello(){
        System.out.println("helloworld...");
    }
}
