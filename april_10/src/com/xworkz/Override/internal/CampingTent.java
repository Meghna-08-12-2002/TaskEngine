package com.xworkz.Override.internal;

public class CampingTent extends Tent {
    public CampingTent() {
        System.out.println("No argument constructor in CampingTent");
    }

    @Override
    public void setUp() {
        System.out.println("Setting up a camping tent with ropes and poles");
    }

    public void pack(Tent tent) {
        if (tent != null) {
            System.out.println("Packing the camping tent");
        } else {
            System.out.println("Tent is null, cannot pack");
        }
    }
}
