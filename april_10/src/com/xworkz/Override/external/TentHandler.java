package com.xworkz.Override.external;

import com.xworkz.Override.internal.CampingTent;
import com.xworkz.Override.internal.Tent;

public class TentHandler {
    public void handle(Tent tent) {
        if (tent != null) {
            tent.setUp();
            if (tent instanceof CampingTent) {
                CampingTent camp = (CampingTent) tent;
                camp.pack();
            } else {
                System.out.println("Using a regular tent");
            }
        } else {
            System.out.println("No tent provided");
        }
    }

}
