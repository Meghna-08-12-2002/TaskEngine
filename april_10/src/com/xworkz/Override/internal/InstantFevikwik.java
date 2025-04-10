package com.xworkz.Override.internal;

public class InstantFevikwik extends Fevikwik {
    public InstantFevikwik() {
        System.out.println("No argument constructor in InstantFevikwik");
    }

    @Override
    public void open() {
        System.out.println("Opening the Instant Fevikwik with care");
    }

    public void glue(Fevikwik fevi) {
        if (fevi != null) {
            System.out.println("Applying glue properly");
        } else {
            System.out.println("Fevikwik is missing, can't apply glue");
        }
    }

}
