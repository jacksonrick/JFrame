package com.jf.system.authority;

import com.jf.system.Constant;

import java.lang.annotation.*;

/**
 * Created by xujunfei on 2017/8/1.
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Token {

    boolean need() default true;

    String name() default Constant.TOKEN;

    String type() default Constant.TOKEN_HEADER;

}
