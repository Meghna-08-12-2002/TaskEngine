package com.xworkz.Override.internal;

public class CrystalChandelier extends Chandelier {
    public CrystalChandelier() {
        System.out.println("No argument constructor in CrystalChandelier");
    }

    @Override
    public void illuminate() {
        System.out.println("Illuminating with a crystal chandelier");
    }

    public void polish(Chandelier chandelier) {
        if (chandelier != null) {
            System.out.println("Polishing the crystal chandelier");
        } else {
            System.out.println("Chandelier is null, cannot polish");
        }
    }
}
