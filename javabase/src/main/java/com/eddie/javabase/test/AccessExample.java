package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: 访问限制
 * @author: Eddie.tran
 * @create: 2019-05-16 11:12:00
 * @version: V1.0
 **/
public class AccessExample {
    private int id;

    public String getId() {
        return id + "";
    }

    public void setId(String id) {
        this.id = Integer.valueOf(id);
    }

}
