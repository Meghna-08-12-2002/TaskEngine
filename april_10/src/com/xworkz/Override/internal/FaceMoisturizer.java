package com.xworkz.Override.internal;

public class FaceMoisturizer extends Moisturizer {
    public FaceMoisturizer() {
        System.out.println("No argument constructor in FaceMoisturizer");
    }

    @Override
    public void apply() {
        System.out.println("Applying moisturizer specifically for face");
    }

    public void hydrate(Moisturizer moisturizer) {
        if (moisturizer != null) {
            System.out.println("Hydrating skin with face moisturizer");
        } else {
            System.out.println("Moisturizer is null, cannot hydrate");
        }
    }
}
