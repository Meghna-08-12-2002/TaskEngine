package com.xworkz.Override.internal;

public class FryingPan extends Pan {
    public FryingPan() {
        System.out.println("No argument constructor in FryingPan");
    }

    @Override
    public void cook() {
        System.out.println("Cooking with a frying pan");
    }

    public void fry(Pan pan) {
        if (pan != null) {
            System.out.println("Frying food in the frying pan");
        } else {
            System.out.println("Pan is null, cannot fry");
        }
    }
}
