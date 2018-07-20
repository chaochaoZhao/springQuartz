package com.zsc.springQuartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Author:ShaochaoZhao
 * @Description:
 * @Date:Create in 15:34 2018/7/18
 * @Modified By:
 **/
public class SimpleJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(System.currentTimeMillis()+"---SimpleJob.class");
    }
}
