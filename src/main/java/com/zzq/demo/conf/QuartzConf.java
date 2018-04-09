package com.zzq.demo.conf;

import com.zzq.demo.quartz.MyScheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

@Configuration
public class QuartzConf implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    public MyScheduler myScheduler;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {
            myScheduler.scheduleJobs();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(){
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        return schedulerFactoryBean;
    }
}

