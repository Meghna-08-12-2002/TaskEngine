package com.xworkz.Override.internal;

public class SpiceMixture extends Mixture {
    public SpiceMixture() {
        System.out.println("No argument constructor in SpiceMixture");
    }

    @Override
    public void mix() {
        System.out.println("Mixing spices in a spice mixture");
    }

    public void grind() {

            System.out.println("Grinding the spice mixture");

    }
}
