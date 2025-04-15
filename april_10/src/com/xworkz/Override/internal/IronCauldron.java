package com.xworkz.Override.internal;

public class IronCauldron extends Cauldron {
    public IronCauldron() {
        System.out.println("No argument constructor in IronCauldron");
    }

    @Override
    public void boil() {
        System.out.println("Boiling in an iron cauldron");
    }

    public void heat() {

            System.out.println("Heating the iron cauldron");

    }
}
