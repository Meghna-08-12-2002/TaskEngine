package com.xworkz.Override.internal;

public class IronCauldron extends Cauldron {
    public IronCauldron() {
        System.out.println("No argument constructor in IronCauldron");
    }

    @Override
    public void boil() {
        System.out.println("Boiling in an iron cauldron");
    }

    public void heat(Cauldron cauldron) {
        if (cauldron != null) {
            System.out.println("Heating the iron cauldron");
        } else {
            System.out.println("Cauldron is null, cannot heat");
        }
    }
}
