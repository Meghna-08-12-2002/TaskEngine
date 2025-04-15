package com.xworkz.Override.external;

import com.xworkz.Override.internal.Park;
import com.xworkz.Override.internal.ThemePark;

public class Visitor {
    public Visitor() {
        System.out.println("No argument constructor in Visitor");
    }

    public void explore(Park park) {
        if (park != null) {
            park.open();
            if (park instanceof ThemePark) {
                ThemePark theme = (ThemePark) park;
                theme.launchRide();
            } else {
                System.out.println("Just enjoying nature in the park");
            }
        } else {
            System.out.println("No park to explore");
        }
    }
}
