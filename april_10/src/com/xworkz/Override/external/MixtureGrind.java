package com.xworkz.Override.external;

import com.xworkz.Override.internal.Mixture;
import com.xworkz.Override.internal.SpiceMixture;

public class MixtureGrind {
    public MixtureGrind() {
        System.out.println("No argument constructor in MixtureCare");
    }

    public void handleMixture(Mixture mixture) {
        if (mixture != null) {
            mixture.mix(); // Calls the overridden mix method if it's a SpiceMixture
            if (mixture instanceof SpiceMixture) {
                SpiceMixture spice = (SpiceMixture) mixture; // Downcasting
                spice.grind(); // Invoking subclass-specific method
            } else {
                System.err.println("Mixture is not a SpiceMixture.");
            }
        } else {
            System.err.println("Mixture is null.");
        }
    }
}
