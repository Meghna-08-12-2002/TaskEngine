package com.xworkz.Override.external;

import com.xworkz.Override.internal.Adopter;
import com.xworkz.Override.internal.USBAdopter;

public class connectAdapter {
    public connectAdapter(){
        System.out.println("no argument constructor in BandagePlaster");
    }
    public void connect(Adopter adopter) {
        if (adopter != null) {
            adopter.connect(); // Calls the overridden method based on the actual object type

            if (adopter instanceof USBAdopter) {
                USBAdopter usbAdopter = (USBAdopter) adopter; // Downcasting to access subclass-specific methods
                usbAdopter.transfer(); // Invoking subclass-specific method
            } else {
                System.err.println("Adopter is not a USBAdopter.");
            }
        } else {
            System.err.println("Adopter is null.");
        }
    }

}
