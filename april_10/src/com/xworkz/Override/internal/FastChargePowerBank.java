package com.xworkz.Override.internal;

public class FastChargePowerBank extends PowerBank {
    public FastChargePowerBank() {
        System.out.println("No argument constructor in FastChargePowerBank");
    }

    @Override
    public void charge() {
        System.out.println("Charging device with fast-charge power bank");
    }

    public void boost(PowerBank powerBank) {
        if (powerBank != null) {
            System.out.println("Boost mode activated for power bank");
        } else {
            System.out.println("PowerBank is null, cannot activate boost mode");
        }
    }
}
