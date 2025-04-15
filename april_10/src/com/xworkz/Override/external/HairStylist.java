package com.xworkz.Override.external;

import com.xworkz.Override.internal.CurlyHair;
import com.xworkz.Override.internal.Hair;

public class HairStylist {
    public HairStylist() {
        System.out.println("No argument constructor in HairStylist");
    }
    public void styleHair(Hair hair) {
        if (hair != null) {
            hair.style();
            if (hair instanceof CurlyHair) {
                CurlyHair curly = (CurlyHair) hair;
                curly.moisturize();
            } else {
                System.out.println("Styling generic hair");
            }
        } else {
            System.out.println("No hair to style");
        }
    }
}
