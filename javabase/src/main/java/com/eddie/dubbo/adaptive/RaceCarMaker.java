package com.eddie.dubbo.adaptive;

import com.alibaba.dubbo.common.URL;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-10-03 23:29:56
 * @version: V1.0
 **/
public class RaceCarMaker implements CarMaker {

    WheelMaker wheelMaker;

    public void setWheelMaker(WheelMaker wheelMaker) {
        this.wheelMaker = wheelMaker;
    }

    @Override
    public Car makeCar(URL url) {
        Wheel wheel = wheelMaker.makeWheel(url);
        return new Car();
    }
}
