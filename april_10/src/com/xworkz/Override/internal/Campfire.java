package com.xworkz.Override.internal;

public class Campfire extends Fire {
    public Campfire() {
        System.out.println("No argument constructor in Campfire");
    }

    @Override
    public void ignite() {
        System.out.println("Igniting a campfire");
    }

    public void warmUp() {

            System.out.println("Warming up by the campfire");

    }
}
