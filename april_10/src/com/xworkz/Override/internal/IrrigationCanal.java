package com.xworkz.Override.internal;

public class IrrigationCanal extends WaterCanal {
    public IrrigationCanal() {
        System.out.println("No argument constructor in IrrigationCanal");
    }

    @Override
    public void flow() {
        System.out.println("Water is flowing through the irrigation canal");
    }

    public void clean(WaterCanal canal) {
        if (canal != null) {
            System.out.println("Cleaning the irrigation canal");
        } else {
            System.out.println("Canal is null, cannot clean");
        }
    }
}
