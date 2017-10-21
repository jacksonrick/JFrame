package com.jf.junit;

import com.github.pagehelper.PageInfo;
import com.jf.model.User;
import com.jf.service.user.UserService;
import org.junit.Test;

import javax.annotation.Resource;

public class UserTest extends BaseTest {

    @Resource
    private UserService userService;

    @Test
    public void test01() {
        User user = new User();
        user.setPageNo(2);
        PageInfo page = userService.findUserByPage(user);
        printJson(page);
    }

}
