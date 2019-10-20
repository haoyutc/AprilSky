package com.eddie.javabase.factory;

/**
 * @program: AprilSky
 * @description: sql server factory
 * @author: Eddie.tran
 * @create: 2019-05-17 11:32:33
 * @version: V1.0
 **/
public class SqlServerFactory implements IFactory {


    @Override
    public IUser createUser() {
        return new SqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlDepartment();
    }
}
