package com.eddie.javabase.factory;

/**
 * @program: AprilSky
 * @description: access department
 * @author: Eddie.tran
 * @create: 2019-05-17 11:29:52
 * @version: V1.0
 **/
public class AccessDeparment implements IDepartment {

    @Override
    public void insert() {
        System.out.println("insert into department");
    }

    @Override
    public void getById() {
        System.out.println("get department by id");
    }
}
