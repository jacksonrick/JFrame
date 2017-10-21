package com.jf.sms;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 短信服务类
 * <p>短信和邮箱线程池可使用该方式，涉及到service调用，请直接写在service层中。</p>
 * <p>调用方式：在service使用@Resource注入，调用sendSms方法</p>
 *
 * @author rick
 * @version 1.1
 */
public class SMService {

    @Resource
    private SMSUtil util;

    private ThreadPoolTaskExecutor taskExecutor;

    public void setTaskExecutor(ThreadPoolTaskExecutor taskExecutor) {
        this.taskExecutor = taskExecutor;
    }

    /**
     * 短信验证码
     *
     * @param code
     * @param phones
     */
    public void sendSms(final String code, final String... phones) {
        taskExecutor.execute(new Runnable() {
            @Override
            public void run() {
                Map<String, String> root = new HashMap<String, String>();
                root.put("code", code);
                util.sendSms(root, "sms_code", phones);
            }
        });
    }

    /**
     * 群发
     *
     * @param content
     * @param phones
     */
    public void sendSmsGroup(final String content, final String... phones) {
        taskExecutor.execute(new Runnable() {
            @Override
            public void run() {
                util.send(content, phones);
            }
        });
    }

}
