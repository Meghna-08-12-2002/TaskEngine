package com.xworkz.Override.internal;

public class FirstAidKit extends Kit {
    public FirstAidKit() {
        System.out.println("No argument constructor in FirstAidKit");
    }

    @Override
    public void open() {
        System.out.println("Opening the first aid kit with medical supplies");
    }

    public void sanitize(Kit kit) {
        if (kit != null) {
            System.out.println("Sanitizing the first aid kit");
        } else {
            System.out.println("Kit is null, cannot sanitize");
        }
    }
}
