package com.eddie.javabase.factory;

/**
 * @program: AprilSky
 * @description: sql department
 * @author: Eddie.tran
 * @create: 2019-05-17 11:26:34
 * @version: V1.0
 **/
public class SqlDepartment implements IDepartment {

    @Override
    public void insert() {
        System.out.println("insert into sql department");
    }

    @Override
    public void getById() {
        System.out.println("get sql department by id");
    }
}
