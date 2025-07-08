package com.xworkz.Override.external;

import com.xworkz.Override.internal.RollerPin;
import com.xworkz.Override.internal.WoodenRollerPin;

public class RollerService {
    public RollerService() {
        System.out.println("No argument constructor in RollerService");
    }

    public void useRoller(RollerPin rollerPin) {
        if (rollerPin != null) {
            rollerPin.roll();
            if (rollerPin instanceof WoodenRollerPin) {
                WoodenRollerPin wooden = (WoodenRollerPin) rollerPin;
                wooden.smoothen();
            } else {
                System.out.println("Not a wooden roller pin");
            }
        } else {
            System.out.println("Roller pin is null");
        }
    }
}
