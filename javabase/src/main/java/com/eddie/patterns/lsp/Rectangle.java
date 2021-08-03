package com.example.demo.patterns.lsp;

// 子类矩形
public class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
