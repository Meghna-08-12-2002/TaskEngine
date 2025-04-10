package com.xworkz.Override.internal;

public class BlackPepper extends Pepper {
    public BlackPepper() {
        System.out.println("No argument constructor in BlackPepper");
    }

    @Override
    public void spice() {
        System.out.println("Adding spice with black pepper");
    }

    public void enhanceTaste(Pepper pepper) {
        if (pepper != null) {
            System.out.println("Enhancing taste with black pepper");
        } else {
            System.out.println("Pepper is null, cannot enhance taste");
        }
    }
}
