package com.jf.controller;

import com.jf.entity.ResMsg;
import com.jf.sms.SMService;
import com.jf.system.Constant;
import com.jf.system.LogManager;
import com.jf.system.authority.Token;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by xujunfei on 2017/7/31.
 */
@RestController
public class TestController extends BaseController {

    @Resource
    private SMService smService;

    @GetMapping("/test")
    public ResMsg test() {
        LogManager.info("test");
        return new ResMsg(0, SUCCESS);
    }

    @GetMapping("/app/get")
    public ResMsg get() {
        Long userId = 10001l;
        String token = putUser(userId);
        return new ResMsg(0, SUCCESS, token);
    }

    @PostMapping("/app/token")
    public ResMsg token(String param, @Token(type = Constant.TOKEN_HEADER) Long userId) {
        System.out.println("/app/token param:" + param);
        System.out.println("/app/token userId:" + userId);
        return new ResMsg(0, SUCCESS);
    }

    @GetMapping("/testSms")
    public ResMsg testSms() {
        smService.sendSms("123456", "17730215423", "17730215422");
        return new ResMsg(0, SUCCESS);
    }

    @GetMapping("/testSetSession")
    public ResMsg testSetSession(HttpSession session) {
        session.setAttribute("name", "xujunfei");
        return new ResMsg(0, SUCCESS);
    }

    @GetMapping("/testGetSession")
    public ResMsg testGetSession(HttpSession session) {
        return new ResMsg(0, SUCCESS, session.getAttribute("name"));
    }

}
