package com.xworkz.Override.internal;

public class WirelessCharger extends Charger {
    public WirelessCharger() {
        System.out.println("No argument constructor in WirelessCharger");
    }

    @Override
    public void supply() {
        System.out.println("Supplying power through wireless charger");
    }

    public void detect(Charger charger) {
        if (charger != null) {
            System.out.println("Device detected on wireless charger");
        } else {
            System.out.println("No device detected");
        }
    }
}
