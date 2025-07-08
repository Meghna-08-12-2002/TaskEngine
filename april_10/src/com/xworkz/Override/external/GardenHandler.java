package com.xworkz.Override.external;

import com.xworkz.Override.internal.FlowerGarden;
import com.xworkz.Override.internal.Garden;

public class GardenHandler {
    public GardenHandler() {
        System.out.println("No argument constructor in GardenHandler");
    }

    public void handleGarden(Garden garden) {
        if (garden != null) {
            garden.Water();
            if (garden instanceof FlowerGarden) {
                FlowerGarden flower = (FlowerGarden) garden;
                flower.arrangeFlowers();
            } else {
                System.out.println("This is a general garden");
            }
        } else {
            System.out.println("Garden is null");
        }
    }
}
