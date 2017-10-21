package com.jf.sms;

import com.jf.sms.eucp.SingletonClient;
import freemarker.template.Template;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Map;

/**
 * 短信平台
 *
 * @author rick
 * @version 1.1
 */
public class SMSUtil {

    private static Log log = LogFactory.getLog(SMSUtil.class);

    private FreeMarkerConfigurer freeMarkerConfigurer = null;

    public void setFreeMarkerConfigurer(FreeMarkerConfigurer freeMarkerConfigurer) {
        this.freeMarkerConfigurer = freeMarkerConfigurer;
    }

    private String getText(Map<String, String> root, String templateName) {
        String text = "";
        try {
            // 通过指定模板名获取FreeMarker模板实例
            Template tpl = freeMarkerConfigurer.getConfiguration().getTemplate(templateName + ".ftl");
            text = FreeMarkerTemplateUtils.processTemplateIntoString(tpl, root);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }

    /**
     * 通过模板发送
     *
     * @param root         数据
     * @param templateName 模板名称
     * @param phones       手机号码
     */
    public void sendSms(Map<String, String> root, String templateName, String... phones) {
        String content = getText(root, templateName);
        if (!"".equals(content)) {
            try {
                //int i = SingletonClient.getClient().sendSMS(phones, content, "", 5);
                int i = 0;
                if (i == 0) {
                    log.info(Arrays.toString(phones) + ":" + content);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 发送短信
     *
     * @param content
     * @param phones  String...
     */
    public void send(String content, String... phones) {
        try {
            int i = SingletonClient.getClient().sendSMS(phones, content, "", 5);
            if (i == 0) {
                log.info(Arrays.toString(phones) + ":" + content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
