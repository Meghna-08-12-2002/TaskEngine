package com.xworks.god.internal3;

public class Shine {
    public Shine() {
        System.out.println("Shine constructor called");
    }

    public static void display() {
        Coin coin = new Coin();
        Coin.flip();
        coin.spin();
    }
}
