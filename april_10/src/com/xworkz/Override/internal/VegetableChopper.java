package com.xworkz.Override.internal;

public class VegetableChopper extends Chopper {
    public VegetableChopper() {
        System.out.println("No argument constructor in VegetableChopper");
    }

    @Override
    public void chop() {
        System.out.println("Chopping vegetables with a vegetable chopper");
    }

    public void dice() {

            System.out.println("Dicing vegetables with the chopper");

    }
}
