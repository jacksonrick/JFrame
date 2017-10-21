package com.jpush;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by xujunfei on 2017/3/30.
 */
public class JPushService {

    @Resource
    private JPush jPush;

    private ThreadPoolTaskExecutor taskExecutor;

    public void setTaskExecutor(ThreadPoolTaskExecutor taskExecutor) {
        this.taskExecutor = taskExecutor;
    }

    /**
     * TAG ID推送
     *
     * @param devive
     * @param alert
     * @param extras
     * @param id     String...
     */
    public void sendPush(final int devive, final String alert, final Map<String, String> extras, final String... id) {
        taskExecutor.execute(new Runnable() {
            @Override
            public void run() {
                jPush.androidPush(devive, alert, extras, id);
                jPush.iosPush(devive, alert, extras, id);
            }
        });
    }

}
