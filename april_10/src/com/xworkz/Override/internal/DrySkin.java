package com.xworkz.Override.internal;

public class DrySkin extends Skin {
    public DrySkin() {
        System.out.println("No argument constructor in DrySkin");
    }

    @Override
    public void protect() {
        System.out.println("Dry skin needs extra care for protection");
    }

    public void moisturize(Skin skin) {
        if (skin != null) {
            System.out.println("Moisturizing the skin");
        } else {
            System.out.println("Skin object is null, cannot moisturize");
        }
    }
}
