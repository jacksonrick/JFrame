package com.jf.email;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 邮件发送服务类
 * <p>线程池</p>
 * <p>调用方式：在service使用@Resource注入，调用send方法</p>
 *
 * @author rick
 * @date
 */
public class EmailService {

    @Resource
    private EmailUtil util;

    private ThreadPoolTaskExecutor taskExecutor;

    public void setTaskExecutor(ThreadPoolTaskExecutor taskExecutor) {
        this.taskExecutor = taskExecutor;
    }

    public void send(final Map<String, Object> root, final String toEmail, final String subject) {
        taskExecutor.execute(new Runnable() {
            @Override
            public void run() {
                util.sendTemplateMail(root, toEmail, subject, "email_register");
            }
        });
    }

}
