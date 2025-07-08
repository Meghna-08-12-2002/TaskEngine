package com.xworkz.Override.internal;

public class SafariZoo extends Zoo {
    public SafariZoo() {
        System.out.println("No argument constructor in SafariZoo");
    }

    @Override
    public void exhibitAnimals() {
        System.out.println("Exhibiting animals in a safari zoo");
    }

    public void safariRide() {
        System.out.println("Offering a safari ride in the zoo");
    }
}