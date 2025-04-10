package com.xworkz.Override.internal;

public class SandiskPendrive extends Pendrive {
    public SandiskPendrive() {
        System.out.println("No argument constructor in SandiskPendrive");
    }

    @Override
    public void store() {
        System.out.println("Storing data in a Sandisk pendrive");
    }

    public void transfer(Pendrive pendrive) {
        if (pendrive != null) {
            System.out.println("Transferring data using Sandisk pendrive");
        } else {
            System.out.println("Pendrive is null, cannot transfer");
        }
    }
}
