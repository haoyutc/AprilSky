package com.eddie.javabase.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: AprilSky
 * @description: test main
 * @author: Eddie.tran
 * @create: 2019-05-04 15:19:47
 * @version: V1.0
 **/
public class Music {
    public static void main(String[] args) {
        List<Instrument> instruments = new ArrayList<>();
        instruments.add(new Wind());
        instruments.add(new Percussion());
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

}
