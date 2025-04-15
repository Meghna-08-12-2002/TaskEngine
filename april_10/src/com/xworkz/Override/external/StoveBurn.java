package com.xworkz.Override.external;

import com.xworkz.Override.internal.Gasstove;
import com.xworkz.Override.internal.Stove;

public class StoveBurn {
    public StoveBurn() {
        System.out.println("No argument constructor in StoveService");
    }

    public void useStove(Stove stove) {
        if (stove != null) {
            stove.ignite();

            if (stove instanceof Gasstove) {
                Gasstove gasStove = (Gasstove) stove;
                gasStove.regulateFlame();
            } else {
                System.out.println("Basic stove, no flame regulation available.");
            }
        } else {
            System.out.println("Stove is null");
        }
    }

}
