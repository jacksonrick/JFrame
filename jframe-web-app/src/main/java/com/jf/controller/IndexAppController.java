package com.jf.controller;

import com.jf.convert.Convert;
import com.jf.entity.ResMsg;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Properties;

/**
 * Created by xujunfei on 2017/4/7.
 */
@Controller
@RequestMapping("/app")
public class IndexAppController extends BaseController {

    @Value("#{cfg}")
    private Properties config;

    @RequestMapping("/home")
    @ResponseBody
    public ResMsg home() {
        return new ResMsg(0, SUCCESS);
    }

    @RequestMapping("/online")
    @ResponseBody
    public ResMsg online() {
        String val = config.getProperty("online");
        return new ResMsg(0, "SUCCESS", Convert.stringToBoolean(val));
    }

}
