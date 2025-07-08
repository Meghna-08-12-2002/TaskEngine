package com.xworkz.Override.external;

import com.xworkz.Override.internal.ChiliSpice;
import com.xworkz.Override.internal.Spice;

public class SpiceTaster {
    public SpiceTaster() {
        System.out.println("No argument constructor in SpiceTaster");
    }

    public void testFlavor(Spice spice) {
        if (spice != null) {
            spice.flavor();
            if (spice instanceof ChiliSpice) {
                ChiliSpice chili = (ChiliSpice) spice;
                chili.addHeat();
            } else {
                System.out.println("Not a chili spice");
            }
        } else {
            System.out.println("Spice is null");
        }
    }
}
