package com.xworks.encapsulation.internal9;

public class Resident {

        public void showApartmentInfo() {
            Apartment apartment = new Apartment();
            System.out.println("Building: " + apartment.getBuildingName());
            System.out.println("Flat No: " + apartment.getFlatNumber());
            System.out.println("Area: " + apartment.getArea());
            System.out.println("Balcony: " + apartment.isHasBalcony());
            System.out.println("City: " + apartment.getCity());

            apartment.setBuildingName("Sky View");
            apartment.setFlatNumber(305);
            apartment.setArea(1050.75);
            apartment.setHasBalcony(false);
            apartment.setCity("Pune");

            System.out.println("Updated Building: " + apartment.getBuildingName());
        }
    }

