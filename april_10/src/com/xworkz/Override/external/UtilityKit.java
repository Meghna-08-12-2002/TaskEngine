package com.xworkz.Override.external;

import com.xworkz.Override.internal.CeramicFlagon;
import com.xworkz.Override.internal.Flagon;

public class UtilityKit {
    public UtilityKit() {
        System.out.println("No argument constructor in UtilityKit");
    }

    public void checkItem(Flagon flagon) {
        if (flagon != null) {
            flagon.hold();
            if (flagon instanceof CeramicFlagon) {
                CeramicFlagon ceramic = (CeramicFlagon) flagon;
                ceramic.clean();
            } else {
                System.out.println("Not a ceramic flagon");
            }
        } else {
            System.out.println("Flagon is null");
        }
    }
}
