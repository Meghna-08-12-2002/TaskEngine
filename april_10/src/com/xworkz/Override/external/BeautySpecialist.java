package com.xworkz.Override.external;

import com.xworkz.Override.internal.Lipstick;
import com.xworkz.Override.internal.MatteLipstick;

public class BeautySpecialist {
    public BeautySpecialist() {
        System.out.println("No argument constructor in BeautySpecialist");
    }

    public void apply(Lipstick lipstick) {
        if (lipstick != null) {
            lipstick.apply();
            if (lipstick instanceof MatteLipstick) {
                MatteLipstick matte = (MatteLipstick) lipstick;
                matte.longLasting();
            } else {
                System.out.println("Basic lipstick applied, not matte");
            }
        } else {
            System.out.println("Lipstick is null");
        }
    }
}
