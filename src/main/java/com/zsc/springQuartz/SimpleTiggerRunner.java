package com.zsc.springQuartz;

import org.quartz.*;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.SimpleTriggerImpl;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * @Author:ShaochaoZhao
 * @Description:
 * @Date:Create in 15:41 2018/7/18
 * @Modified By:
 **/
public class SimpleTiggerRunner {
    private static final String JOB_NAME = "job_1";
    private static final String JOB_GROUP = "job_group_1";
    private static final String JOB_TIGGER = "job_tigger_1";

    @PostConstruct
    public void runner(){
        try {
            JobDetailImpl jobDetail = new JobDetailImpl(JOB_NAME,JOB_GROUP,SimpleJob.class);
            SimpleTriggerImpl simpleTrigger = new SimpleTriggerImpl(JOB_TIGGER,JOB_GROUP);
            simpleTrigger.setStartTime(new Date());
            simpleTrigger.setRepeatInterval(2000);
            simpleTrigger.setRepeatCount(10);
            SchedulerFactory schedulerFactory = new StdSchedulerFactory();
            Scheduler scheduler = schedulerFactory.getScheduler();
            scheduler.scheduleJob(jobDetail,simpleTrigger);
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}

