package com.example.demo.patterns.ips;

public class Man implements IHuman{
    @Override
    public void eat() {
        System.out.println("啤酒龙虾羊肉串");
    }

    @Override
    public void sleep() {
        System.out.println("星星你是我的眼");
    }

    @Override
    public void play() {
        System.out.println("撸铁");
    }
}
