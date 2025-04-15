package com.xworkz.Override.external;

import com.xworkz.Override.internal.StainlessSteel;
import com.xworkz.Override.internal.Steel;

public class MetalQuality {
    public MetalQuality() {
        System.out.println("No argument constructor in MetalQuality");
    }

    public void checkQuality(Steel steel) {
        if (steel != null) {
            steel.strength();
            if (steel instanceof StainlessSteel) {
                StainlessSteel stainlessSteel = (StainlessSteel) steel;
                stainlessSteel.polish();
            } else {
                System.out.println("Not Stainless Steel");
            }
        } else {
            System.out.println("Steel is null");
        }
    }
}
