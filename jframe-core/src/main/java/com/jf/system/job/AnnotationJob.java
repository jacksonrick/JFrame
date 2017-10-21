package com.jf.system.job;

import com.jf.system.LogManager;

/**
 * Created by xujunfei on 2017/3/4.
 */
/*@Component
@Lazy(value = false)*/
public class AnnotationJob {

    //@Scheduled(cron = "0 0/5 9,10,11,12,13,14,15,16 * * ?")
    public void read() {
        long start = System.currentTimeMillis();

        LogManager.info("用时 : " + (System.currentTimeMillis() - start) + "毫秒");
    }

}
