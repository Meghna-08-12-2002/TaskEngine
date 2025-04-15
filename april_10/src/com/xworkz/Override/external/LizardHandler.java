package com.xworkz.Override.external;

import com.xworkz.Override.internal.Gecko;
import com.xworkz.Override.internal.Lizard;

public class LizardHandler {
    public LizardHandler() {
        System.out.println("No argument constructor in LizardHandler");
    }

    public void handleLizard(Lizard lizard) {
        if (lizard != null) {
            lizard.makeSound();
            if (lizard instanceof Gecko) {
                Gecko gecko = (Gecko) lizard;
                gecko.changeColor();
            } else {
                System.out.println("This is a regular lizard");
            }
        } else {
            System.out.println("Lizard is null");
        }
    }
}
