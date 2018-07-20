package com.zsc.springQuartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

/**
 * @Author:ShaochaoZhao
 * @Description:
 * @Date:Create in 15:39 2018/7/18
 * @Modified By:
 **/
public class SimpleStateJob implements StatefulJob {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

    }
}
