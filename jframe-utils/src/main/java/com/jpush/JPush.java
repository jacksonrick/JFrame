package com.jpush;

import cn.jiguang.common.ClientConfig;
import cn.jiguang.common.ServiceHelper;
import cn.jiguang.common.connection.NettyHttpClient;
import cn.jiguang.common.resp.ResponseWrapper;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;
import io.netty.handler.codec.http.HttpMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/**
 * 极光推送API
 * Created by xujunfei on 2017/3/30.
 */
public class JPush {

    public static void main(String[] args) {
        //JPush jPush = new JPush();
        //jPush.iosPush("测试", "10036", 1);
    }

    protected Logger log = LoggerFactory.getLogger("syslog");
    private String APP_KEY = "";
    private String MASTER_SECRET = "";
    private Boolean iosProduct = false; // 开发环境false
    private String alert = "JFRAME";

    /**
     * 安卓推送
     *
     * @param device
     * @param content
     * @param extras
     * @param id
     */
    public void androidPush(int device, String content, Map<String, String> extras, String... id) {
        changeKey(device);
        ClientConfig clientConfig = ClientConfig.getInstance();
        String host = (String) clientConfig.get(ClientConfig.PUSH_HOST_NAME);
        final NettyHttpClient client = new NettyHttpClient(ServiceHelper.getBasicAuthorization(APP_KEY, MASTER_SECRET), null, clientConfig);
        try {
            URI uri = new URI(host + clientConfig.get(ClientConfig.PUSH_PATH));
            PushPayload payload = PushPayload.newBuilder()
                    .setPlatform(Platform.android())
                    .setAudience(Audience.tag(id))
                    //.setAudience(Audience.registrationId(id))
                    .setNotification(Notification.android(alert, content, extras)).build();
            client.sendRequest(HttpMethod.POST, payload.toString(), uri, new NettyHttpClient.BaseCallback() {
                @Override
                public void onSucceed(ResponseWrapper responseWrapper) {
                    log.info(responseWrapper.toString());
                }
            });
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    /**
     * IOS推送
     *
     * @param device
     * @param content
     * @param extras
     * @param id
     */
    public void iosPush(int device, String content, Map<String, String> extras, String... id) {
        changeKey(device);
        ClientConfig clientConfig = ClientConfig.getInstance();
        String host = (String) clientConfig.get(ClientConfig.PUSH_HOST_NAME);
        final NettyHttpClient client = new NettyHttpClient(ServiceHelper.getBasicAuthorization(APP_KEY, MASTER_SECRET), null, clientConfig);
        try {
            URI uri = new URI(host + clientConfig.get(ClientConfig.PUSH_PATH));
            PushPayload payload2 = PushPayload.newBuilder()
                    .setPlatform(Platform.ios())
                    .setAudience(Audience.tag(id))
                    //.setAudience(Audience.registrationId(id))
                    .setNotification(Notification.newBuilder().addPlatformNotification(IosNotification.newBuilder().setAlert(alert).addExtras(extras).build()).build())
                    .setMessage(Message.newBuilder().setMsgContent(content).build())
                    .setOptions(Options.newBuilder().setApnsProduction(iosProduct).build()).build();
            client.sendRequest(HttpMethod.POST, payload2.toString(), uri, new NettyHttpClient.BaseCallback() {
                @Override
                public void onSucceed(ResponseWrapper responseWrapper) {
                    log.info(responseWrapper.toString());
                }
            });
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param device 推送设备
     */
    private void changeKey(int device) {
        if (device == 1) {
            APP_KEY = "";
            MASTER_SECRET = "";
        } else if (device == 2) {
            APP_KEY = "";
            MASTER_SECRET = "";
        } else {
            APP_KEY = "";
            MASTER_SECRET = "";
        }
    }
}
