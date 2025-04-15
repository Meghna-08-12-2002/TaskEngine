package com.xworkz.Override.external;

import com.xworkz.Override.internal.MetalSpitton;
import com.xworkz.Override.internal.Spitton;

public class SpittonUse {
    public SpittonUse() {
        System.out.println("No argument constructor in SpittonHandler");
    }

    public void use(Spitton spitton) {
        if (spitton != null) {
            spitton.use();
            if (spitton instanceof MetalSpitton) {
                MetalSpitton metal = (MetalSpitton) spitton;
                metal.clean();
            } else {
                System.out.println("Not a metal spitton");
            }
        } else {
            System.out.println("Spitton is null");
        }
    }
}
