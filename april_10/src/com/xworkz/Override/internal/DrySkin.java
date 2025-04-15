package com.xworkz.Override.internal;

public class DrySkin extends Skin {
    public DrySkin() {
        System.out.println("No argument constructor in DrySkin");
    }

    @Override
    public void protect() {
        System.out.println("Dry skin needs extra care for protection");
    }

    public void moisturize() {

            System.out.println("Moisturizing the skin");

    }
}
