package com.xworkz.Override.internal;

public class HairStraightner extends Straightner {
    public HairStraightner() {
        System.out.println("No argument constructor in HairStraightner");
    }

    @Override
    public void heat() {
        System.out.println("Heating the hair straightner to optimal temperature");
    }

    public void straighten() {

            System.out.println("Straightening hair with the hair straightner");

    }
}
