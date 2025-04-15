package com.xworkz.Override.internal;

public class ElectricCenser extends Censer {
    public ElectricCenser() {
        System.out.println("No argument constructor in ElectricCenser");
    }

    @Override
    public void releaseFragrance() {
        System.out.println("Releasing fragrance from electric censer");
    }

    public void powerOn() {

            System.out.println("Powering on the electric censer");

    }
}
