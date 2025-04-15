package com.xworkz.Override.internal;

public class SteelFork extends Fork {
    public SteelFork() {
        System.out.println("No argument constructor in SteelFork");
    }

    @Override
    public void pick() {
        System.out.println("Picking food with a durable steel fork");
    }

    public void polish() {

            System.out.println("Polishing the steel fork");

    }
}
