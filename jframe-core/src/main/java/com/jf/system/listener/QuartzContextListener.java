package com.jf.system.listener;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 系统停止后应当关闭Quartz定时器
 *
 * @author rick
 */
public class QuartzContextListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        SchedulerFactory gSchedulerFactory = new StdSchedulerFactory();
        try {
            Scheduler sche = gSchedulerFactory.getScheduler();
            sche.shutdown();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

		/*WebApplicationContext webApplicationContext = (WebApplicationContext) event.getServletContext()
                .getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		if (webApplicationContext.getBean("startQuartz") != null) {
            StdScheduler startQuertz = (StdScheduler) webApplicationContext.getBean("startQuartz");
            if (startQuertz != null) {
                startQuertz.shutdown();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    }

    @Override
    public void contextInitialized(ServletContextEvent event) {
    }

}
