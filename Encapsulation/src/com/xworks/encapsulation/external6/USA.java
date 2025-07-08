package com.xworks.encapsulation.external6;

import com.xworks.encapsulation.internal6.Jet;

public class USA {
    public void usa() {
        Jet jet = new Jet();
        System.out.println("Model: " + jet.getModel());
        System.out.println("Speed: " + jet.getSpeed());
        System.out.println("Manufacturer: " + jet.getManufacturer());
        System.out.println("Stealth: " + jet.isStealth());
        System.out.println("Weight: " + jet.getWeight());
    }
}
