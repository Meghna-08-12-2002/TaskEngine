package com.xworkz.Override.external;

import com.xworkz.Override.internal.FastChargePowerBank;
import com.xworkz.Override.internal.PowerBank;

public class ChargingStation {
    public ChargingStation() {
        System.out.println("No argument constructor in ChargingStation");
    }

    public void chargeDevice(PowerBank bank) {
        if (bank != null) {
            bank.charge();
            if (bank instanceof FastChargePowerBank) {
                FastChargePowerBank fast = (FastChargePowerBank) bank;
                fast.boost();
            } else {
                System.out.println("Not a fast-charge power bank");
            }
        } else {
            System.out.println("Power bank is null");
        }
    }
}
