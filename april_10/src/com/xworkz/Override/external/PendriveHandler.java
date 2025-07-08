package com.xworkz.Override.external;

import com.xworkz.Override.internal.Pendrive;
import com.xworkz.Override.internal.SandiskPendrive;

public class PendriveHandler {
    public void handle(Pendrive pendrive) {
        if (pendrive != null) {
            pendrive.store();
            if (pendrive instanceof SandiskPendrive) {
                SandiskPendrive sandisk = (SandiskPendrive) pendrive;
                sandisk.transfer();
            } else {
                System.out.println("Storing using regular pendrive");
            }
        } else {
            System.out.println("No pendrive provided");
        }
    }
}
