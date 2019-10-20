package com.eddie.javabase.factory.abstractfactory;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-05-17 17:32:30
 * @version: V1.0
 **/
public class ConcreteFactory2 extends AbstractFactory {

    @Override
    AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB2();
    }
}
