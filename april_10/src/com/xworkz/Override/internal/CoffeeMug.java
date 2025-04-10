package com.xworkz.Override.internal;

public class CoffeeMug extends Mug {
    public CoffeeMug() {
        System.out.println("No argument constructor in CoffeeMug");
    }

    @Override
    public void hold() {
        System.out.println("Coffee mug is holding hot coffee");
    }

    public void sip(Mug mug) {
        if (mug != null) {
            System.out.println("Sipping coffee from the mug");
        } else {
            System.out.println("No mug to sip from");
        }
    }
}
