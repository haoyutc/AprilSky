package com.eddie.dubbo.spi.java;

import com.eddie.dubbo.spi.dubbo.Robot;
import org.junit.Test;

import java.util.ServiceLoader;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-10-03 16:14:26
 * @version: V1.0
 **/
public class JavaSpiTest {

    @Test
    public void sayHelloTest(){
        ServiceLoader<com.eddie.dubbo.spi.dubbo.Robot> serviceLoader = ServiceLoader.load(com.eddie.dubbo.spi.dubbo.Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }

}
