package com.xworkz.Override.external;

import com.xworkz.Override.internal.MedicalPlaster;
import com.xworkz.Override.internal.Plaster;

public class BandagePlaster {
    public BandagePlaster() {
        System.out.println("no argument constructor in BandagePlaster");
    }

    public void fix(Plaster plaster) {
        if (plaster != null) {
            plaster.apply();
            if (plaster instanceof MedicalPlaster) {
                MedicalPlaster medical = (MedicalPlaster) plaster;
                medical.adhere();
            } else {
                System.out.println("Not a medical plaster");
            }
        } else {
            System.out.println("Plaster is null");
        }
    }
}
