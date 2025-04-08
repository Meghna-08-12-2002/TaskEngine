package com.xworks.god.internal7;

public class Aroma {
    public Aroma() {
        System.out.println("Aroma constructor called");
    }

    public static void scent() {
        Perfume perfume = new Perfume();
        Perfume.spray();
        perfume.refresh();
    }
}
