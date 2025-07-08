package com.xworkz.Override.internal;

public class GarlicGinger extends Ginger {
    public GarlicGinger() {
        System.out.println("No argument constructor in GarlicGinger");
    }

    @Override
    public void flavor() {
        System.out.println("Adding flavor with garlic and ginger");
    }

    public void blend() {

        System.out.println("Blending garlic and ginger");
    }
}
