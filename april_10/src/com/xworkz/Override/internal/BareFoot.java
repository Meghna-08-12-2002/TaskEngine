package com.xworkz.Override.internal;

public class BareFoot extends Foot {
    public BareFoot() {
        System.out.println("No argument constructor in BareFoot");
    }

    @Override
    public void move() {
        System.out.println("Moving barefoot");
    }

    public void feel(Foot foot) {
        if (foot != null) {
            System.out.println("Feeling the ground with foot");
        } else {
            System.out.println("Foot is null, can't feel the ground");
        }
    }
}
