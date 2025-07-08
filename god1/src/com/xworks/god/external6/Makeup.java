package com.xworks.god.external6;

import com.xworks.god.internal6.Powder;

public class Makeup {
    public Makeup() {
        System.out.println("Makeup constructor called");
    }

    public static void use() {
        Powder powder = new Powder();
        Powder.apply();
    }
}
