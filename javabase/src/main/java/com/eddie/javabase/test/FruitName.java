package com.eddie.javabase.test;

import java.lang.annotation.*;

/**
 * @Description: 水果名注解
 * @Param:
 * @return:
 * @Author: Eddie.tran
 * @Date: 2019-05-16 :20:17
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
