package com.xworkz.Override.internal;

public class USBAdopter extends Adopter {
    public USBAdopter() {
        System.out.println("No argument constructor in USBAdopter");
    }

    @Override
    public void connect() {
        System.out.println("Connecting device using USB adopter");
    }

    public void transfer() {

            System.out.println("Data transfer initiated through adopter");

    }
}
