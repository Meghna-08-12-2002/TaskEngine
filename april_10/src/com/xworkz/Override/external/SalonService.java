package com.xworkz.Override.external;

import com.xworkz.Override.internal.HairStraightner;
import com.xworkz.Override.internal.Straightner;

public class SalonService {
    public SalonService() {
        System.out.println("No argument constructor in SalonService");
    }

    public void use(Straightner tool) {
        if (tool != null) {
            tool.heat();
            if (tool instanceof HairStraightner) {
                HairStraightner hs = (HairStraightner) tool;
                hs.straighten();
            } else {
                System.out.println("Using a basic straightner");
            }
        } else {
            System.out.println("No tool available");
        }
    }
}
