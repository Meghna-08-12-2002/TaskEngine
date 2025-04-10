package com.xworkz.Override.internal;

public class LiquidEyeliner extends Eyeliner {
    public LiquidEyeliner() {
        System.out.println("No argument constructor in LiquidEyeliner");
    }

    @Override
    public void draw() {
        System.out.println("Drawing with liquid eyeliner");
    }

    public void waterproof(Eyeliner eyeliner) {
        if (eyeliner != null) {
            System.out.println("This eyeliner is waterproof");
        } else {
            System.out.println("Eyeliner object is null, can't check waterproof");
        }
    }
}
