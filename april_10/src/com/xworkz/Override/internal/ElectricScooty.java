package com.xworkz.Override.internal;

public class ElectricScooty extends Scooty {
    public ElectricScooty() {
        System.out.println("No argument constructor in ElectricScooty");
    }

    @Override
    public void ride() {
        System.out.println("Riding an electric scooty");
    }

    public void charge(Scooty scooty) {
        if (scooty != null) {
            System.out.println("Charging the electric scooty");
        } else {
            System.out.println("Scooty reference is null, cannot charge");
        }
    }
}
