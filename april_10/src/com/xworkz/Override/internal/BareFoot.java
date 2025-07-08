package com.xworkz.Override.internal;

public class BareFoot extends Foot {
    public BareFoot() {
        System.out.println("No argument constructor in BareFoot");
    }

    @Override
    public void move() {
        System.out.println("Moving barefoot");
    }
    public void feel() {
            System.out.println("Feeling the ground with foot");

    }
}
