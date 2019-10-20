package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: 注解使用
 * @author: Eddie.tran
 * @create: 2019-05-16 23:40:19
 * @version: V1.0
 **/
public class Apple {
    @FruitName("Apple")
    private String name;
    @FruitColor(fruitColor = FruitColor.Color.Red)
    private String color;
    @FruitProvider(id = 007, name = "洛川红富士", address = "陕西省富平县洛川")
    private String provider;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void displayName() {
        System.out.println("水果的名字：苹果");
    }
}
