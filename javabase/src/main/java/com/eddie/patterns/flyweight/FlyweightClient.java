package com.example.demo.patterns.flyweight;

import java.awt.*;

public class FlyweightClient {
    public static void playChess() {
        // 下黑子
        Chess blackChess1 = ChessFactory.getChess(Color.BLACK);
        blackChess1.draw(2, 5);
        // 下白子
        Chess whiteChess = ChessFactory.getChess(Color.WHITE);
        blackChess1.draw(3, 5);
        // 下黑子
        Chess blackChess2 = ChessFactory.getChess(Color.BLACK);
        blackChess1.draw(2, 6);
        System.out.println(String.format("blackChess1:%d|blackChess2:%d|whiteChess:%d",
                blackChess1.hashCode(), blackChess2.hashCode(), whiteChess.hashCode()));
    }

    public static void main(String[] args) {
        playChess();
    }
}
