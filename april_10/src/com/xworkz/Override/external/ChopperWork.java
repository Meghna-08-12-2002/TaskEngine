package com.xworkz.Override.external;

import com.xworkz.Override.internal.Chopper;
import com.xworkz.Override.internal.VegetableChopper;

public class ChopperWork {
    public ChopperWork() {
        System.out.println("No argument constructor in ChopperHandler");
    }

    public void processChop(Chopper chopper) {
        if (chopper != null) {
            chopper.chop();
            if (chopper instanceof VegetableChopper) {
                VegetableChopper vc = (VegetableChopper) chopper;
                vc.dice();
            } else {
                System.out.println("Not a vegetable chopper");
            }
        } else {
            System.out.println("Chopper is null");
        }
    }
}
