package com.xworkz.Override.external;

import com.xworkz.Override.internal.GarlicGinger;
import com.xworkz.Override.internal.Ginger;

public class GingerMixer {
    public GingerMixer() {
        System.out.println("No argument constructor in GingerMixer");
    }

    public void mix(Ginger ginger) {
        if (ginger != null) {
            ginger.flavor();
            if (ginger instanceof GarlicGinger) {
                GarlicGinger garlic = (GarlicGinger) ginger;
                garlic.blend();
            } else {
                System.out.println("Not a garlic ginger mix");
            }
        } else {
            System.out.println("Ginger is null");
        }
    }
}
