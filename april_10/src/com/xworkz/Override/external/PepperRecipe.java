package com.xworkz.Override.external;

import com.xworkz.Override.internal.BlackPepper;
import com.xworkz.Override.internal.Pepper;

public class PepperRecipe {
    public PepperRecipe() {
        System.out.println("No argument constructor in PepperHandler");
    }

    public void handle(Pepper pepper) {
        if (pepper != null) {
            pepper.spice();
            if (pepper instanceof BlackPepper) {
                BlackPepper mbp = (BlackPepper) pepper;
                mbp.enhanceTaste();
            } else {
                System.out.println("Not medicinal black pepper");
            }
        } else {
            System.out.println("Pepper is null");
        }
    }
}
