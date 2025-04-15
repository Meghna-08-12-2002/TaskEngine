package com.xworkz.Override.external;

import com.xworkz.Override.internal.Rug;
import com.xworkz.Override.internal.SilkRug;

public class InteriorDecorator {
    public InteriorDecorator() {
        System.out.println("No argument constructor in InteriorDecorator");
    }

    public void arrangeRug(Rug rug) {
        if (rug != null) {
            rug.spread();
            if (rug instanceof SilkRug) {
                SilkRug silk = (SilkRug) rug;
                silk.fold();
            } else {
                System.out.println("Not a silk rug");
            }
        } else {
            System.out.println("Rug is null");
        }
    }
}
