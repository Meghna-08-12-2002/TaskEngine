package com.xworks.god.internal3;

public class Coin {

    public Coin() {
        System.out.println("Coin constructor called");
    }

    public static void flip() {
        System.out.println("Coin: public flip method");
    }

    void spin() {
        System.out.println("Coin: package-default spin method");
    }

    private void vanish() {
        System.out.println("Coin: private vanish method");
    }
}
