package com.eddie.javabase.factory.abstractfactory;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-05-17 17:33:36
 * @version: V1.0
 **/
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();
        //TODO with productA and productB

        System.out.println((char) (90));
    }

}
