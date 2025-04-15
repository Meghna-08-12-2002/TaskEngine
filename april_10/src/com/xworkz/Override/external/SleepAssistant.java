package com.xworkz.Override.external;

import com.xworkz.Override.internal.Blanket;
import com.xworkz.Override.internal.ElectricBlanket;

public class SleepAssistant {
    public SleepAssistant() {
        System.out.println("No argument constructor in SleepAssistant");
    }

    public void prepareSleep(Blanket blanket) {
        if (blanket != null) {
            blanket.cover();
            if (blanket instanceof ElectricBlanket) {
                ElectricBlanket electric = (ElectricBlanket) blanket;
                electric.heatUp();
            } else {
                System.out.println("Regular blanket. No heating feature.");
            }
        } else {
            System.out.println("No blanket provided.");
        }
    }
}
