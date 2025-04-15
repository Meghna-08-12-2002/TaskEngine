package com.xworkz.Override.internal;

public class CeramicFlagon extends Flagon {
    public CeramicFlagon() {
        System.out.println("No argument constructor in CeramicFlagon");
    }

    @Override
    public void hold() {
        System.out.println("Holding a ceramic flagon");
    }

    public void clean() {

            System.out.println("Cleaning the ceramic flagon");

    }
}
