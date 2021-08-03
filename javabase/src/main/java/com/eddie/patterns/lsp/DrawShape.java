package com.example.demo.patterns.lsp;


public class DrawShape {
    public static void main(String[] args) {
    //使用Shape的子类Triangle 的实例来替换Shape的实例，程序工作正常
        drawShape(new Rectangle());
    }

    private static void drawShape(Shape shape) {
        System.out.println("start draw");
        shape.draw();
        System.out.println("finished draw");
    }
}
