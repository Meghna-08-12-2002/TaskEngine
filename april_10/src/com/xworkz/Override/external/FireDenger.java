package com.xworkz.Override.external;

import com.xworkz.Override.internal.Campfire;
import com.xworkz.Override.internal.Fire;

public class FireDenger {
    public FireDenger() {
        System.out.println("No argument constructor in FireCare");
    }

    public void handleFire(Fire fire) {
        if (fire != null) {
            fire.ignite(); // Calls overridden ignite method if it's a Campfire
            if (fire instanceof Campfire) {
                Campfire campfire = (Campfire) fire; // Downcasting
                campfire.warmUp(); // Invoking subclass-specific method
            } else {
                System.err.println("Fire is not a Campfire.");
            }
        } else {
            System.err.println("Fire is null.");
        }
    }
}
