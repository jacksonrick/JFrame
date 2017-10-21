package com.jf.junit;

import com.jf.json.JSONUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class BaseTest {

    public void showErr(Object obj) {
        System.err.println(obj);
    }

    public void showOut(Object obj) {
        System.out.println(obj);
    }

    public void printJson(Object obj){
        System.err.println(JSONUtils.toJSONString(obj));
    }

    @Test
    public void test() {

    }
}
