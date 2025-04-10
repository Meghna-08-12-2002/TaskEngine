package com.xworkz.Override.internal;

public class MetalSpitton extends Spitton {
    public MetalSpitton() {
        System.out.println("No argument constructor in MetalSpitton");
    }

    @Override
    public void use() {
        System.out.println("Using a metal spitton");
    }

    public void clean(Spitton spitton) {
        if (spitton != null) {
            System.out.println("Cleaning the metal spitton");
        } else {
            System.out.println("Spitton is null, cannot clean");
        }
    }
}
