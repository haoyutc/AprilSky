package com.eddie.javabase.factory.abstractfactory;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-05-17 17:31:01
 * @version: V1.0
 **/
public class ConcreteFactory1 extends AbstractFactory {

    @Override
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1();
    }
}
