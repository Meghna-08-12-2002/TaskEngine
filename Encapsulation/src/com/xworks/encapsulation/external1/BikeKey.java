package com.xworks.encapsulation.external1;

import com.xworks.encapsulation.internal1.KeyChain;

public class BikeKey {
    public void Bike() {
        KeyChain key = new KeyChain();
        System.out.println("Material: " + key.getMaterial());
        System.out.println("Length: " + key.getLength());
        System.out.println("Shape: " + key.getShape());
        System.out.println("Custom: " + key.isCustom());
        System.out.println("Brand: " + key.getBrand());
    }
}
