package com.xworkz.Override.internal;

public class ChiliSpice extends Spice {
    public ChiliSpice() {
        System.out.println("No argument constructor in ChiliSpice");
    }

    @Override
    public void flavor() {
        System.out.println("Adding flavor with chili spice");
    }

    public void addHeat(Spice spice) {
        if (spice != null) {
            System.out.println("Adding heat with chili spice");
        } else {
            System.out.println("Spice is null, cannot add heat");
        }
    }
}
