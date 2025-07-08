package com.xworkz.Override.external;

import com.xworkz.Override.internal.Pin;
import com.xworkz.Override.internal.SafetyPin;

public class SteelPin {
    public SteelPin() {
        System.out.println("no argument constructor in SteelPin");
    }

    public void secure(Pin pin) {
        if (pin != null) {
            pin.use();
            if (pin instanceof SafetyPin) {
                SafetyPin safety = (SafetyPin) pin;
                safety.lock();
            } else {
                System.out.println("Not a safety pin");
            }
        } else {
            System.out.println("Pin is null");
        }
    }
}
