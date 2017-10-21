package com.jf.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Log4j2
 */
public class LogManager {

    protected static Logger log = LoggerFactory.getLogger("syslog");

    public static void info(String msg) {
        log.info(msg);
    }

    public static void error(String msg) {
        log.error(msg);
    }

    public static void error(String msg, Exception e) {
        log.error(msg, e);
    }

    public static void visit(String type, String ip, String action, String params) {
        /*log.info("########## " + type + " Interceptor ##########\r\n" +
                "\tTarget IP\t" + ip + "\r\n\tAction\t\t" + action + "\r\n\tParams\t\t" + params);*/
        log.info("【" + type + "】" + "【Target IP：" + ip + "】【Action：" + action + "】【Params：" + params + "】");
    }

}
