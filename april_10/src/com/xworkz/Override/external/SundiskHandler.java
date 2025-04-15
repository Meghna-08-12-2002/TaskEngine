package com.xworkz.Override.external;

import com.xworkz.Override.internal.FlashSundisk;
import com.xworkz.Override.internal.Sundisk;

public class SundiskHandler {
    public SundiskHandler() {
        System.out.println("No argument constructor in SundiskHandler");
    }

    public void manageDisk(Sundisk sundisk) {
        if (sundisk != null) {
            sundisk.storeData();
            if (sundisk instanceof FlashSundisk) {
                FlashSundisk flash = (FlashSundisk) sundisk;
                flash.fastReadWrite();
            } else {
                System.out.println("This is a regular Sundisk");
            }
        } else {
            System.out.println("Sundisk is null");
        }
    }
}
