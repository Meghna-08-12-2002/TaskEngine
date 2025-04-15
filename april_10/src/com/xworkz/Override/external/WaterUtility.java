package com.xworkz.Override.external;

import com.xworkz.Override.internal.ClayPitcher;
import com.xworkz.Override.internal.Pitcher;

public class WaterUtility {
    public WaterUtility() {
        System.out.println("No argument constructor in WaterUtility");
    }

    public void serveWater(Pitcher pitcher) {
        if (pitcher != null) {
            pitcher.pour();
            if (pitcher instanceof ClayPitcher) {
                ClayPitcher clay = (ClayPitcher) pitcher;
                clay.clean();
            } else {
                System.out.println("Not a clay pitcher");
            }
        } else {
            System.out.println("Pitcher is null");
        }
    }
}
