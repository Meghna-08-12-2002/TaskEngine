package com.xworks.encapsulation.external7;

import com.xworks.encapsulation.internal7.Garage;

public class Car {
    public void car() {
        Garage garage = new Garage();
        System.out.println("Owner: " + garage.getOwner());
        System.out.println("Capacity: " + garage.getCapacity());
        System.out.println("Has Lift: " + garage.isHasLift());
        System.out.println("Type: " + garage.getType());
        System.out.println("Area: " + garage.getArea());
    }
}
