package com.xworkz.Override.internal;

public class MedicalPlaster extends Plaster {
    public MedicalPlaster() {
        System.out.println("no argument constructor in MedicalPlaster");
    }

    @Override
    public void apply() {
        System.out.println("Applying a medical plaster");
    }

    public void adhere(Plaster plaster) {
        if (plaster != null) {
            System.out.println("Medical plaster adheres properly to the surface");
        } else {
            System.out.println("No plaster available to adhere");
        }
    }
}
