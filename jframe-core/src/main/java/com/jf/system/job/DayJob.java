package com.jf.system.job;

import com.jf.service.job.JobService;
import com.jf.service.system.AdminService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import javax.annotation.Resource;

/**
 * 日任务
 *
 * @author rick
 * @date
 */
public class DayJob extends QuartzJobBean {

    @Resource
    private JobService jobService;
    @Resource
    private AdminService adminService;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        long start = System.currentTimeMillis();
        try {
            SchedulerContext skedCtx = context.getScheduler().getContext();

            jobService = (JobService) skedCtx.get("jobService");
            jobService.test();

            adminService.addMsg(new Long(10000), "任务计划已执行完毕【日任务】，用时 : " + (System.currentTimeMillis() - start) + "毫秒");
        } catch (Exception e) {
            adminService.addMsg(new Long(10000), "任务计划【日任务】执行异常");
            e.printStackTrace();
        }
    }

    public JobService getJobService() {
        return jobService;
    }

    public void setJobService(JobService jobService) {
        this.jobService = jobService;
    }

    public AdminService getAdminService() {
        return adminService;
    }

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }
}
