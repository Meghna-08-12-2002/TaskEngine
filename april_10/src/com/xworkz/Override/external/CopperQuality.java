package com.xworkz.Override.external;

import com.xworkz.Override.internal.Copper;
import com.xworkz.Override.internal.PureCopper;

public class CopperQuality {
    public CopperQuality() {
    System.out.println("No argumnent constructor for CopperQuality");
    }
        public void checkQuality(Copper copper) {
            if (copper != null) {
                copper.conductivity();
                if (copper instanceof PureCopper) {
                    PureCopper pureCopper = (PureCopper) copper;
                    pureCopper.polish();
                } else {
                    System.out.println("Not Pure Copper");
                }
            } else {
                System.out.println("Copper is null");
            }

    }
}
