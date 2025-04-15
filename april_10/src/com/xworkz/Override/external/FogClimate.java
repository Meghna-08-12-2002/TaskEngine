package com.xworkz.Override.external;

import com.xworkz.Override.internal.Fog;
import com.xworkz.Override.internal.MorningFog;

public class FogClimate {
    public FogClimate() {
        System.out.println("No argument constructor in FogHandler");
    }

    public void handle(Fog fog) {
        if (fog != null) {
            fog.appear();
            if (fog instanceof MorningFog) {
                MorningFog morningFog = (MorningFog) fog;
                morningFog.dissipate();
            } else {
                System.out.println("Not a morning fog");
            }
        } else {
            System.out.println("Fog is null");
        }
    }
}
