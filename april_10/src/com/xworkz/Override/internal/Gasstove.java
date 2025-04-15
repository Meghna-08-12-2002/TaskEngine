package com.xworkz.Override.internal;

public class Gasstove extends Stove {
    public Gasstove() {
        System.out.println("No argument constructor in GasStove");
    }

    @Override
    public void ignite() {
        System.out.println("Igniting a gas stove");
    }

    public void regulateFlame() {

            System.out.println("Regulating flame for stove");

    }
}
