package com.xworkz.Override.external;

import com.xworkz.Override.internal.Doll;
import com.xworkz.Override.internal.FashionDoll;

public class BarbieDoll {
    public BarbieDoll() {
        System.out.println("no argument constructor in BarbieDoll");
    }

    public void decorate(Doll doll) {
        if (doll != null) {
            doll.show();
            if (doll instanceof FashionDoll) {
                FashionDoll fashionDoll = (FashionDoll) doll;
                fashionDoll.accessorize();
            } else {
                System.out.println("Doll is not fashion type");
            }
        } else {
            System.out.println("Doll is null");
        }
    }
}
