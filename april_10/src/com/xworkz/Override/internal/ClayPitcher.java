package com.xworkz.Override.internal;

public class ClayPitcher extends Pitcher {
    public ClayPitcher() {
        System.out.println("No argument constructor in ClayPitcher");
    }

    @Override
    public void pour() {
        System.out.println("Pouring water from a clay pitcher");
    }

    public void clean() {

            System.out.println("Cleaning the clay pitcher");

    }
}
