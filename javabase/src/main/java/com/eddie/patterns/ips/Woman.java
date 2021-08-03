package com.example.demo.patterns.ips;

public class Woman implements IHuman,IForWoman{
    @Override
    public void comeDaYM() {
        System.out.println("多喝热水！");
    }

    @Override
    public void eat() {
        System.out.println("小龙虾");
    }

    @Override
    public void sleep() {
        System.out.println("月亮不睡我不睡");
    }

    @Override
    public void play() {
        System.out.println("下五洋捉鳖");
    }
}
