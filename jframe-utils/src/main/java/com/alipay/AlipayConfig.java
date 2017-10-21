package com.alipay;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径

 *提示：如何获取安全校验码和合作身份者ID
 *1.用您的签约支付宝账号登录支付宝网站(www.alipay.com)
 *2.点击“商家服务”(https://b.alipay.com/order/myOrder.htm)
 *3.点击“查询合作者身份(PID)”、“查询安全校验码(Key)”
 */
public class AlipayConfig {

    // 合作身份者ID，以2088开头由16位纯数字组成的字符串
    public static String partner = "";
    public static String appid = "";
    // 支付宝账号
    public static String seller = "";
    // 接收通知的接口
    public static String notify_url = "";
    // 私钥
    public static String rsa_private_key = "";
    // 支付宝的公钥
    public static String alipay_public_key = "";
    // 公钥
    public static String public_key = "";

    static {
        Properties properties = new Properties();
        try {
            properties.load(new InputStreamReader(AlipayConfig.class.getResourceAsStream("/config.properties"), "UTF-8"));
            partner = properties.getProperty("alipay_partner");
            appid = properties.getProperty("alipay_app_id");
            seller = properties.getProperty("alipay_seller");
            notify_url = properties.getProperty("alipay_notify_url");
            rsa_private_key = properties.getProperty("rsa_private_key");
            alipay_public_key = properties.getProperty("alipay_public_key");
            public_key = properties.getProperty("public_key");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
