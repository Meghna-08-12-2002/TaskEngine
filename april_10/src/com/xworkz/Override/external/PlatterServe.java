package com.xworkz.Override.external;

import com.xworkz.Override.internal.DinnerPlatter;
import com.xworkz.Override.internal.Platter;

public class PlatterServe {
    public PlatterServe() {
        System.out.println("No argument constructor in PlatterServe");
    }

    public void serveFood(Platter platter) {
        if (platter != null) {
            platter.serve();
            if (platter instanceof DinnerPlatter) {
                DinnerPlatter dinner = (DinnerPlatter) platter;
                dinner.arrange();
            } else {
                System.out.println("Not a dinner platter");
            }
        } else {
            System.out.println("Platter is null");
        }
    }
}
