package com.xworkz.Override.internal;

public class SprayMop extends Mop {
    public SprayMop() {
        System.out.println("No argument constructor in SprayMop");
    }

    @Override
    public void clean() {
        System.out.println("Spray mop is cleaning the floor with liquid");
    }

    public void sprayLiquid() {

            System.out.println("Spraying liquid before mopping");

    }
}
