package com.xworkz.Override.external;

import com.xworkz.Override.internal.Lid;
import com.xworkz.Override.internal.PlasticLid;

public class LidThing {
    public LidThing() {
        System.out.println("No argument constructor in LidCare");
    }

    public void handleLid(Lid lid) {
        if (lid != null) {
            lid.cover(); // Calls overridden cover method if it's a PlasticLid
            if (lid instanceof PlasticLid) {
                PlasticLid plastic = (PlasticLid) lid; // Downcasting
                plastic.checkFit(); // Invoking subclass-specific method
            } else {
                System.err.println("Lid is not a PlasticLid.");
            }
        } else {
            System.err.println("Lid is null.");
        }
    }
}
