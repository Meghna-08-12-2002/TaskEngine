package com.xworkz.Override.external;

import com.xworkz.Override.internal.CurcuminTurmeric;
import com.xworkz.Override.internal.Turmeric;

public class TurmericTester {
    public TurmericTester() {
        System.out.println("No argument constructor in TurmericTester");
    }

    public void testFlavor(Turmeric turmeric) {
        if (turmeric != null) {
            turmeric.flavor();
            if (turmeric instanceof CurcuminTurmeric) {
                CurcuminTurmeric curcumin = (CurcuminTurmeric) turmeric;
                curcumin.boostHealth();
            } else {
                System.out.println("Not curcumin turmeric");
            }
        } else {
            System.out.println("Turmeric is null");
        }
    }
}
