package com.xworkz.Override.internal;

public class WirelessMouse extends Mouse {
    public WirelessMouse() {
        System.out.println("No argument constructor in WirelessMouse");
    }

    @Override
    public void click() {
        System.out.println("Clicking with a wireless mouse");
    }

    public void connect() {

            System.out.println("Wireless mouse connected successfully");

    }
}
