package com.eddie.spring;

import org.springframework.beans.factory.InitializingBean;

/**
 * @program: AprilSky
 * @description: spring 的生命周期
 * @author: Eddie.tran
 * @create: 2019-06-06 20:32:43
 * @version: V1.0
 **/
public class SpringBeanLifeCycleTest implements InitializingBean {

    private String message;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Step 3 in after properties set message:" + getMessage());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
