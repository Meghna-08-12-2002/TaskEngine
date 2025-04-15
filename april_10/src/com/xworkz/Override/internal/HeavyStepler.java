package com.xworkz.Override.internal;

public class HeavyStepler extends Stepler {
    public HeavyStepler() {
        System.out.println("No argument constructor in HeavyStepler");
    }

    @Override
    public void bind() {
        System.out.println("Binding thick documents using heavy stepler");
    }

    public void reload() {

            System.out.println("Reloading heavy stepler");

    }
}
