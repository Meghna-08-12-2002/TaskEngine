package com.xworkz.Override.external;

import com.xworkz.Override.internal.Chandelier;
import com.xworkz.Override.internal.CrystalChandelier;

public class DecorUtility {
    public DecorUtility() {
        System.out.println("No argument constructor in DecorUtility");
    }

    public void apply(Chandelier chandelier) {
        if (chandelier != null) {
            chandelier.illuminate();
            if (chandelier instanceof CrystalChandelier) {
                CrystalChandelier crystal = (CrystalChandelier) chandelier;
                crystal.polish();
            } else {
                System.out.println("Standard chandelier in use");
            }
        } else {
            System.out.println("Chandelier is null");
        }
    }
}
