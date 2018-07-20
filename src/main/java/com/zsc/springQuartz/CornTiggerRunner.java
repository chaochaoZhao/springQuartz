package com.zsc.springQuartz;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.text.ParseException;

/**
 * @Author:ShaochaoZhao
 * @Description:
 * @Date:Create in 15:58 2018/7/18
 * @Modified By:
 **/
@Service
public class CornTiggerRunner {
    private static final String JOB_NAME = "job_2";
    private static final String JOB_GROUP = "job_group_2";
    private static final String JOB_TIGGER = "job_tigger_2";

    @PostConstruct
    public void runner(){
        try {
            JobDetailImpl jobDetail =  new JobDetailImpl(JOB_NAME,JOB_GROUP,CornJob.class);
            CronTriggerImpl cronTrigger = new CronTriggerImpl(JOB_TIGGER,JOB_GROUP);
            cronTrigger.setCronExpression("0/2 * * * * ?");

            SchedulerFactory schedulerFactory = new StdSchedulerFactory();
            Scheduler scheduler = schedulerFactory.getScheduler();
            scheduler.scheduleJob(jobDetail,cronTrigger);
            scheduler.start();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
