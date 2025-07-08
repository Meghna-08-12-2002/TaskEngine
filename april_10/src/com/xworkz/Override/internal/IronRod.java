package com.xworkz.Override.internal;

public class IronRod extends Rod {
    public IronRod() {
        System.out.println("No argument constructor in IronRod");
    }

    @Override
    public void support() {
        System.out.println("Iron rod provides strong structural support");
    }

    public void weld() {

            System.out.println("Welding the iron rod");

    }
}
