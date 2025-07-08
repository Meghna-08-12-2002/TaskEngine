package com.xworks.encapsulation.internal1;

public class SpiderKey {
        public void spidy() {
            KeyChain key = new KeyChain();
            System.out.println("Material: " + key.getMaterial());
            System.out.println("Length: " + key.getLength());
            System.out.println("Shape: " + key.getShape());
            System.out.println("Custom: " + key.isCustom());
            System.out.println("Brand: " + key.getBrand());

            key.setMaterial("Wood");
            key.setLength(12);
            key.setShape("Oval");
            key.setCustom(false);
            key.setBrand("NatureKey");

            System.out.println("Updated Material: " + key.getMaterial());
        }
    }


