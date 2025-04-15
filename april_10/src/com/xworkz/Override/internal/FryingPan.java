package com.xworkz.Override.internal;

public class FryingPan extends Pan {
    public FryingPan() {
        System.out.println("No argument constructor in FryingPan");
    }

    @Override
    public void cook() {
        System.out.println("Cooking with a frying pan");
    }

    public void fry() {

            System.out.println("Frying food in the frying pan");

    }
}
