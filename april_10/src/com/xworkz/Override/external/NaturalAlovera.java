package com.xworkz.Override.external;

import com.xworkz.Override.internal.Alovera;
import com.xworkz.Override.internal.Medical;

public class NaturalAlovera {
    public NaturalAlovera() {
        System.out.println("no argument constructor in NaturalAlovera");
    }

    public void treat(Alovera alovera) {
        if (alovera != null) {
            alovera.apply();
            if (alovera instanceof Medical) {
                Medical med = (Medical) alovera;
                med.heal();
            } else {
                System.out.println("Not a medical aloe vera");
            }
        } else {
            System.out.println("Alovera is null");
        }
    }
}
