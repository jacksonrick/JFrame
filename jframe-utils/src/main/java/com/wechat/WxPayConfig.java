package com.wechat;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class WxPayConfig {

    public static String APP_ID = "";
    public static String mch_id = "";
    public static String PARTNER_KEY = "";
    public static String notify_url = "";

    static {
        Properties properties = new Properties();
        try {
            properties.load(new InputStreamReader(WxPayConfig.class.getResourceAsStream("/config.properties"),
                    "UTF-8"));

            APP_ID = properties.getProperty("wpay_appid");
            mch_id = properties.getProperty("wpay_partner");
            PARTNER_KEY = properties.getProperty("wpay_partnerkey");
            notify_url = properties.getProperty("wpay_notify_url");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
