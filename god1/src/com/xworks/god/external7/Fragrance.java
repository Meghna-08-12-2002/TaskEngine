package com.xworks.god.external7;

import com.xworks.god.internal7.Perfume;

public class Fragrance {
    public Fragrance() {
        System.out.println("Fragrance constructor called");
    }

    public static void spread() {
        Perfume perfume = new Perfume();
        Perfume.spray();
    }
}
