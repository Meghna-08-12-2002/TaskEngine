package com.xworks.encapsulation.internal7;

public class Bike {

        public void bke() {
            Garage garage = new Garage();
            System.out.println("Owner: " + garage.getOwner());
            System.out.println("Capacity: " + garage.getCapacity());
            System.out.println("Has Lift: " + garage.isHasLift());
            System.out.println("Type: " + garage.getType());
            System.out.println("Area: " + garage.getArea());

            garage.setOwner("David");
            garage.setCapacity(6);
            garage.setHasLift(false);
            garage.setType("Open");
            garage.setArea(300.0);

            System.out.println("Updated Owner: " + garage.getOwner());
        }
    }


