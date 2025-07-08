package com.xworkz.Override.internal;

public class FastChargePowerBank extends PowerBank {
    public FastChargePowerBank() {
        System.out.println("No argument constructor in FastChargePowerBank");
    }

    @Override
    public void charge() {
        System.out.println("Charging device with fast-charge power bank");
    }

    public void boost() {

            System.out.println("Boost mode activated for power bank");

    }
}
