package com.xworkz.Override.external;

import com.xworkz.Override.internal.DrySkin;
import com.xworkz.Override.internal.Skin;

public class SkinCare {
    public SkinCare(){
        System.out.println("no argument of SkinCare ");
    }
    public void handleSkin(Skin skin) {
        if (skin != null) {
            skin.protect(); // Calls the overridden method based on actual object type

            if (skin instanceof DrySkin) {
                DrySkin dry = (DrySkin) skin; // Downcasting
                dry.moisturize(); // Invoking subclass-specific method
            } else {
                System.err.println("Skin is not a DrySkin.");
            }
        } else {
            System.err.println("Skin is null.");
        }
    }
}
