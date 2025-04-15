package com.xworkz.Override.external;

import com.xworkz.Override.internal.StainlessSteelWok;
import com.xworkz.Override.internal.Wok;

public class WokUtil {
    public WokUtil() {
        System.out.println("No argument constructor in WokUtil");
    }

    public void handleWok(Wok wok) {
        if (wok != null) {
            wok.cook();
            if (wok instanceof StainlessSteelWok) {
                StainlessSteelWok steelWok = (StainlessSteelWok) wok;
                steelWok.stirFry();
            } else {
                System.out.println("Not a stainless steel wok");
            }
        } else {
            System.out.println("Wok is null");
        }
    }
}
