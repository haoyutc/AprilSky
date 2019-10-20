package com.eddie.javabase.test;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @program: AprilSky
 * @description: 水果颜色注解
 * @author: Eddie.tran
 * @create: 2019-05-16 22:42:23
 * @version: V1.0
 **/
@Target(FIELD)
@Retention(RUNTIME)
@Documented
public @interface FruitColor {

    /**
     * @Description: 颜色枚举
     * @Param:
     * @return:
     * @Author: Eddie.tran
     * @Date: 2019-05-16 :22:50
     */
    public enum Color {Red, Blue, Green}

    ;

    /**
     * @Description: 颜色属性
     * @Param:
     * @return:
     * @Author: Eddie.tran
     * @Date: 2019-05-16 :22:50
     */
    Color fruitColor() default Color.Green;

}
