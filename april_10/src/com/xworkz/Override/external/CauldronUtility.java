package com.xworkz.Override.external;

import com.xworkz.Override.internal.Cauldron;
import com.xworkz.Override.internal.IronCauldron;

public class CauldronUtility {
    public CauldronUtility(){
        System.out.println("No argument constructor in CauldronCare");
    }

    public void handleCauldron(Cauldron cauldron) {
        if (cauldron != null) {
            cauldron.boil(); // Calls overridden boil method if it's an IronCauldron
            if (cauldron instanceof IronCauldron) {
                IronCauldron iron = (IronCauldron) cauldron; // Downcasting
                iron.heat(); // Invoking subclass-specific method
            } else {
                System.err.println("Cauldron is not an IronCauldron.");
            }
        } else {
            System.err.println("Cauldron is null.");
        }
    }
}
