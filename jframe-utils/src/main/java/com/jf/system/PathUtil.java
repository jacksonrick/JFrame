package com.jf.system;

import org.springframework.web.context.ContextLoader;

/**
 * Created by xujunfei on 2017/2/15.
 */
public class PathUtil {

    public static String BASEPATH = ContextLoader.getCurrentWebApplicationContext().getServletContext().getRealPath("/") + "/";

    static {
        if (BASEPATH.endsWith("//")) {
            BASEPATH = BASEPATH.substring(0, BASEPATH.length() - 1);
        }
    }
}
