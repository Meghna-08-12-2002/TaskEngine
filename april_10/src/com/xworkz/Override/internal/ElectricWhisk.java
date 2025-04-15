package com.xworkz.Override.internal;

public class ElectricWhisk extends Whisk {
    public ElectricWhisk() {
        System.out.println("No argument constructor in ElectricWhisk");
    }

    @Override
    public void mix() {
        System.out.println("Mixing ingredients with the electric whisk");
    }

    public void whiskWithSpeed() {
            System.out.println("Whisking ingredients at high speed with the electric whisk");

    }
}
