package com.xworkz.Override.external;

import com.xworkz.Override.internal.Blush;
import com.xworkz.Override.internal.CreamBlush;

public class MakeupArtist {
    public MakeupArtist() {
        System.out.println("No argument constructor in MakeupArtist");
    }

    public void style(Blush blush) {
        if (blush != null) {
            blush.apply();
            if (blush instanceof CreamBlush) {
                CreamBlush cream = (CreamBlush) blush;
                cream.blend();
            } else {
                System.out.println("Not a cream blush, no blending needed");
            }
        } else {
            System.out.println("Blush is null");
        }
    }
}
