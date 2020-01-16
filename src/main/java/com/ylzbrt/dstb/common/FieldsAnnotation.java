package com.ylzbrt.dstb.util;

import java.lang.annotation.*;

/**
 * @BelongsProject: dstb
 * @BelongsPackage: com.ylzbrt.dstb.util
 * @Author: lzh
 * @CreateTime: 2020-01-09 18:45
 * @Description: ${Description}
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FieldsAnnotation {
    String value();
}
