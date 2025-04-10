package com.xworkz.Override.internal;

public class MorningFog extends Fog {
    public MorningFog() {
        System.out.println("No argument constructor in MorningFog");
    }

    @Override
    public void appear() {
        System.out.println("Morning fog is appearing");
    }

    public void dissipate(Fog fog) {
        if (fog != null) {
            System.out.println("Morning fog is dissipating");
        } else {
            System.out.println("Fog is null, cannot dissipate");
        }
    }
}
