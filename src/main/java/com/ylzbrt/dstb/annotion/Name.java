package com.ylzbrt.dstb.annotion;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Name {
    // 这是注解的一个属性字段，也就是我们使用注解时填写在括号里的参数
    String value();
}
