package com.xworkz.Override.internal;

public class CreamBlush extends Blush {
    public CreamBlush() {
        System.out.println("No argument constructor in CreamBlush");
    }

    @Override
    public void apply() {
        System.out.println("Applying cream blush");
    }

    public void blend() {

            System.out.println("Blending the blush smoothly");

    }
}
