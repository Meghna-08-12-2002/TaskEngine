package com.xworkz.Override.internal;

public class GarlicGinger extends Ginger {
    public GarlicGinger() {
        System.out.println("No argument constructor in GarlicGinger");
    }

    @Override
    public void flavor() {
        System.out.println("Adding flavor with garlic and ginger");
    }

    public void blend(Ginger ginger) {
        if (ginger != null) {
            System.out.println("Blending garlic and ginger");
        } else {
            System.out.println("Ginger is null, cannot blend");
        }
    }
}
