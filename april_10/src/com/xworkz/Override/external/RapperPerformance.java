package com.xworkz.Override.external;

import com.xworkz.Override.internal.HipHopRapper;
import com.xworkz.Override.internal.Rapper;

public class RapperPerformance {
    public RapperPerformance() {
        System.out.println("No argument constructor in RapperPerformance");
    }

    public void handlePerformance(Rapper rapper) {
        if (rapper != null) {
            rapper.perform();
            if (rapper instanceof HipHopRapper) {
                HipHopRapper hipHopRapper = (HipHopRapper) rapper;
                hipHopRapper.freestyle();
            } else {
                System.out.println("Not a HipHop Rapper");
            }
        } else {
            System.out.println("Rapper is null");
        }
    }
}
