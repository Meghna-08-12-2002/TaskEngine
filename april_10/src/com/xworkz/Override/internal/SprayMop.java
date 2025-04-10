package com.xworkz.Override.internal;

public class SprayMop extends Mop {
    public SprayMop() {
        System.out.println("No argument constructor in SprayMop");
    }

    @Override
    public void clean() {
        System.out.println("Spray mop is cleaning the floor with liquid");
    }

    public void sprayLiquid(Mop mop) {
        if (mop != null) {
            System.out.println("Spraying liquid before mopping");
        } else {
            System.out.println("Mop is null, can't spray liquid");
        }
    }
}
