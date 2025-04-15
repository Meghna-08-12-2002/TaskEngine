package com.xworkz.Override.internal;

public class TubeLed extends Led  {
    public TubeLed() {
        System.out.println("No argument constructor in TubeLed");
    }

    @Override
    public void glow() {
        System.out.println("Glowing the tube led");
    }

    public void adjustBrightness() {

            System.out.println("Adjusting brightness of the led");

    }
}
