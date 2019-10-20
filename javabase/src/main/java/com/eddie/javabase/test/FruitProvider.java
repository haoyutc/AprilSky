package com.eddie.javabase.test;

import java.lang.annotation.*;

/**
 * @Description: 水果供应者注解
 * @Param:
 * @return:
 * @Author: Eddie.tran
 * @Date: 2019-05-16 :23:06
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {

    /**
     * @Description: 供应商编号
     * @Param:
     * @return:
     * @Author: Eddie.tran
     * @Date: 2019-05-16 :23:08
     */
    public int id() default -1;

    /**
     * @Description: 供应商名称
     * @Param:
     * @return:
     * @Author: Eddie.tran
     * @Date: 2019-05-16 :23:08
     */
    public String name() default "";

    /**
     * @Description: 供应商地址
     * @Param:
     * @return:
     * @Author: Eddie.tran
     * @Date: 2019-05-16 :23:08
     */
    public String address() default "";
}
