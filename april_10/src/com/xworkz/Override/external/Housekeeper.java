package com.xworkz.Override.external;

import com.xworkz.Override.internal.Mop;
import com.xworkz.Override.internal.SprayMop;

public class Housekeeper {
    public Housekeeper() {
        System.out.println("No argument constructor in Housekeeper");
    }

    public void startCleaning(Mop mop) {
        if (mop != null) {
            mop.clean();
            if (mop instanceof SprayMop) {
                SprayMop spray = (SprayMop) mop;
                spray.sprayLiquid();
            } else {
                System.out.println("Using a traditional mop");
            }
        } else {
            System.out.println("No mop provided for cleaning");
        }
    }
}
