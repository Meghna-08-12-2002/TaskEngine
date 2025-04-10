package com.xworkz.Override.internal;

public class ElectricCenser extends Censer {
    public ElectricCenser() {
        System.out.println("No argument constructor in ElectricCenser");
    }

    @Override
    public void releaseFragrance() {
        System.out.println("Releasing fragrance from electric censer");
    }

    public void powerOn(Censer censer) {
        if (censer != null) {
            System.out.println("Powering on the electric censer");
        } else {
            System.out.println("Censer is null, cannot power on");
        }
    }
}
