package com.ylzbrt.dstb.common;

import java.lang.annotation.*;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.util
 * @Author: lzh
 * @CreateTime: 2020-01-09 18:44
 * @Description: ${Description}
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ClassAnnotation {
    String value();
}
