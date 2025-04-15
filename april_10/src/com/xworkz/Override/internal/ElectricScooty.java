package com.xworkz.Override.internal;

public class ElectricScooty extends Scooty {
    public ElectricScooty() {
        System.out.println("No argument constructor in ElectricScooty");
    }

    @Override
    public void ride() {
        System.out.println("Riding an electric scooty");
    }

    public void charge() {

            System.out.println("Charging the electric scooty");

    }
}
