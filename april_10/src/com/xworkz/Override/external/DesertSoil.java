package com.xworkz.Override.external;

import com.xworkz.Override.internal.Desert;
import com.xworkz.Override.internal.SandyDesert;

public class DesertSoil {
    public DesertSoil() {
        System.out.println("No argument constructor in DesertHandler");
    }

    public void Soil(Desert desert) {
        if (desert != null) {
            desert.climate();
            if (desert instanceof SandyDesert) {
                SandyDesert sandyDesert = (SandyDesert) desert;
                sandyDesert.sandStorm();
            } else {
                System.out.println("Not a sandy desert");
            }
        } else {
            System.out.println("Desert is null");
        }
    }
}
