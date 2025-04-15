package com.xworkz.Override.external;

import com.xworkz.Override.internal.MicrowaveOven;
import com.xworkz.Override.internal.Oven;

public class OvenHandler {
    public OvenHandler() {
        System.out.println("No argument constructor in OvenHandler");
    }

    public void handle(Oven oven) {
        if (oven != null) {
            oven.heat();
            if (oven instanceof MicrowaveOven) {
                MicrowaveOven microwaveOven = (MicrowaveOven) oven;
                microwaveOven.defrost();
            } else {
                System.out.println("Heating with a regular oven");
            }
        } else {
            System.out.println("No oven to handle");
        }
    }
}
