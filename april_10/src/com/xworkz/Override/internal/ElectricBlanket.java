package com.xworkz.Override.internal;

public class ElectricBlanket extends Blanket {
    public ElectricBlanket() {
        System.out.println("No argument constructor in ElectricBlanket");
    }

    @Override
    public void cover() {
        System.out.println("Covering with an electric blanket");
    }

    public void heatUp(Blanket blanket) {
        if (blanket != null) {
            System.out.println("Heating the electric blanket");
        } else {
            System.out.println("Blanket is null, cannot heat");
        }
    }
}
