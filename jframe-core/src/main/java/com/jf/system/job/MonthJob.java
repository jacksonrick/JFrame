package com.jf.system.job;

import com.jf.service.job.JobService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import javax.annotation.Resource;

/**
 * 月任务
 *
 * @author rick
 */
public class MonthJob extends QuartzJobBean {

    @Resource
    private JobService jobService;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        long start = System.currentTimeMillis();
        try {
            SchedulerContext skedCtx = context.getScheduler().getContext();

            jobService = (JobService) skedCtx.get("jobService");
            jobService.test();

            System.out.printf("任务计划已执行完毕【MonthJob】，用时 : " + (System.currentTimeMillis() - start) + "毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public JobService getJobService() {
        return jobService;
    }

    public void setJobService(JobService jobService) {
        this.jobService = jobService;
    }
}
