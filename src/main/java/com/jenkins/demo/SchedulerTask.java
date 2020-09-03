package com.jenkins.demo;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class SchedulerTask {
    private int count=1;
    /**
     * 表示每隔6秒发送一次邮件
     */
    @Scheduled(cron = "*/3 * * * * ?")
    private void proces(){
        String content="springboot整合定时器实现定时邮件发送，这是第"+(count++)+"封邮件";

        System.out.println("发送定时邮件成功");
    }
}
