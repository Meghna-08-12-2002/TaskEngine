package com.xworkz.Override.internal;

public class PlasticContainer extends Container {
    public PlasticContainer() {
        System.out.println("No argument constructor in PlasticContainer");
    }

    @Override
    public void store() {
        System.out.println("Storing food in a plastic container");
    }

    public void seal(Container container) {
        if (container != null) {
            System.out.println("Sealing the plastic container");
        } else {
            System.out.println("Container is null, cannot seal");
        }
    }
}
