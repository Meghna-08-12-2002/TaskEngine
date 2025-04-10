package com.xworkz.Override.internal;

public class StainlessSteelWok extends Wok {
    public StainlessSteelWok() {
        System.out.println("No argument constructor in StainlessSteelWok");
    }

    @Override
    public void cook() {
        System.out.println("Cooking with the stainless steel wok");
    }

    public void stirFry(Wok wok) {
        if (wok != null) {
            System.out.println("Stir-frying with the stainless steel wok");
        } else {
            System.out.println("Wok is null, cannot stir-fry");
        }
    }
}
