package com.xworkz.Override.internal;

public class FaceMoisturizer extends Moisturizer {
    public FaceMoisturizer() {
        System.out.println("No argument constructor in FaceMoisturizer");
    }

    @Override
    public void apply() {
        System.out.println("Applying moisturizer specifically for face");
    }

    public void hydrate() {

        System.out.println("Hydrating skin with face moisturizer");
    }
}
