package com.xworkz.Override.external;

import com.xworkz.Override.internal.Masher;
import com.xworkz.Override.internal.PotatoMasher;

public class PotatoMasherCurry {
    public PotatoMasherCurry() {
        System.out.println("No argument constructor in PotatoMasherHandler");
    }

    public void handle(Masher masher) {
        if (masher != null) {
            masher.mash();
            if (masher instanceof PotatoMasher) {
                PotatoMasher pm = (PotatoMasher) masher;
                pm.mashWithStyle();
            } else {
                System.out.println("Not a potato masher");
            }
        } else {
            System.out.println("Masher is null");
        }
    }
}
