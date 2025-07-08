package com.xworkz.Override.external;

import com.xworkz.Override.internal.Charger;
import com.xworkz.Override.internal.WirelessCharger;

public class ChargerHandler {
public ChargerHandler(){
    System.out.println("no arugumnet of ChargerHandler");
}
    public void handleCharger(Charger charger) {
        if (charger != null) {
            charger.supply(); // Calls the overridden method based on actual object type

            if (charger instanceof WirelessCharger) {
                WirelessCharger wireless = (WirelessCharger) charger; // Downcasting
                wireless.detect(); // Invoking subclass-specific method
            } else {
                System.err.println("Charger is not a WirelessCharger.");
            }
        } else {
            System.err.println("Charger is null.");
        }
    }


}
