package com.jf.junit;

import com.jf.sms.SMService;
import org.junit.Test;

import javax.annotation.Resource;

public class MyTest extends BaseTest {

    @Resource
    private SMService smService;

    @Test
    public void test01() {
        smService.sendSms("123456", "17730215423", "17730215422");
    }

}
