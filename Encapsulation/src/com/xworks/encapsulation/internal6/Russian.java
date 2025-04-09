package com.xworks.encapsulation.internal6;

public class Russian {
    public void rsn() {
        Jet jet = new Jet();
        System.out.println("Model: " + jet.getModel());
        System.out.println("Speed: " + jet.getSpeed());
        System.out.println("Manufacturer: " + jet.getManufacturer());
        System.out.println("Stealth: " + jet.isStealth());
        System.out.println("Weight: " + jet.getWeight());

        jet.setModel("Su-57");
        jet.setSpeed(2600);
        jet.setManufacturer("Sukhoi");
        jet.setStealth(false);
        jet.setWeight(18000.0);

        System.out.println("Updated Model: " + jet.getModel());
    }
}
