package com.xworkz.Override.internal;

public class FlowerGarden extends Garden {
    public FlowerGarden() {
        System.out.println("No argument constructor in FlowerGarden");
    }

    @Override
    public void Water() {
        System.out.println("Watering flowers in the flower garden");
    }

    public void arrangeFlowers() {
        System.out.println("Arranging flowers in decorative patterns");
    }
}
