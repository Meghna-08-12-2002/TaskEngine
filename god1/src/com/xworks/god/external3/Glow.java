package com.xworks.god.external3;

import com.xworks.god.internal3.Coin;

public class Glow {
    public Glow() {
        System.out.println("Glow constructor called");
    }

    public static void use() {
        Coin coin = new Coin();
        Coin.flip();
    }
}
