package com.xworkz.Override.external;

import com.xworkz.Override.internal.Fevikwik;
import com.xworkz.Override.internal.InstantFevikwik;

public class FevikwikUse {

    public FevikwikUse() {
        System.out.println("no argument constructor in FevikwikUse");
    }

    public void useFevikwik(Fevikwik fevi) {
        if (fevi != null) {
            fevi.open();
            if (fevi instanceof InstantFevikwik) {
                InstantFevikwik instant = (InstantFevikwik) fevi;
                instant.glue(fevi);
            } else {
                System.out.println("Fevikwik is not instant type");
            }
        } else {
            System.out.println("Fevikwik is null");
        }
    }
}
