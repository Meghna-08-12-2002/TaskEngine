package com.xworks.encapsulation.external9;

import com.xworks.encapsulation.internal9.Apartment;

public class Visitors {

        public void viewApartmentDetails() {
            Apartment apartment = new Apartment();
            System.out.println("Building: " + apartment.getBuildingName());
            System.out.println("Flat No: " + apartment.getFlatNumber());
            System.out.println("Area: " + apartment.getArea());
            System.out.println("Balcony: " + apartment.isHasBalcony());
            System.out.println("City: " + apartment.getCity());
        }
    }


