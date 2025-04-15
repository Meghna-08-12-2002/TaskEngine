package com.xworkz.Override.external;

import com.xworkz.Override.internal.CoffeeMug;
import com.xworkz.Override.internal.Mug;

public class MugType {
 public MugType(){
     System.out.println("no argument constructor of mug");
 }
public void handleMug(Mug mug) {
    if (mug != null) {
        mug.hold(); // Calls the overridden method based on actual object type

        if (mug instanceof CoffeeMug) {
            CoffeeMug coffee = (CoffeeMug) mug; // Downcasting
            coffee.sip(); // Invoking subclass-specific method
        } else {
            System.err.println("Mug is not a CoffeeMug.");
        }
    } else {
        System.err.println("Mug is null.");
    }
}
}