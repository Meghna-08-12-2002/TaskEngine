package com.xworkz.Override.internal;

public class GreenCardamom extends Cardamom {
    public GreenCardamom() {
        System.out.println("No argument constructor in GreenCardamom");
    }

    @Override
    public void aroma() {
        System.out.println("Adding aroma with green cardamom");
    }

    public void enhanceFlavor() {

            System.out.println("Enhancing flavor with green cardamom");

    }
}
