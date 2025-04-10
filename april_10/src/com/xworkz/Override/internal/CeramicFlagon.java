package com.xworkz.Override.internal;

public class CeramicFlagon extends Flagon {
    public CeramicFlagon() {
        System.out.println("No argument constructor in CeramicFlagon");
    }

    @Override
    public void hold() {
        System.out.println("Holding a ceramic flagon");
    }

    public void clean(Flagon flagon) {
        if (flagon != null) {
            System.out.println("Cleaning the ceramic flagon");
        } else {
            System.out.println("Flagon is null, cannot clean");
        }
    }
}
