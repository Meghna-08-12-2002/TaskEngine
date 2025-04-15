package com.xworkz.Override.external;

import com.xworkz.Override.internal.Eyeliner;
import com.xworkz.Override.internal.LiquidEyeliner;

public class BeautyExpert {
    public BeautyExpert() {
        System.out.println("No argument constructor in BeautyExpert");
    }

    public void apply(Eyeliner eyeliner) {
        if (eyeliner != null) {
            eyeliner.draw();
            if (eyeliner instanceof LiquidEyeliner) {
                LiquidEyeliner liquid = (LiquidEyeliner) eyeliner;
                liquid.waterproof();
            } else {
                System.out.println("Basic eyeliner applied, not liquid");
            }
        } else {
            System.out.println("Eyeliner is null");
        }
    }
}
