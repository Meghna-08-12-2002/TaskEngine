package com.xworkz.Override.external;

import com.xworkz.Override.internal.Mouse;
import com.xworkz.Override.internal.WirelessMouse;

public class GadgetUser {
    public GadgetUser() {
        System.out.println("No argument constructor in GadgetUser");
    }

    public void operate(Mouse mouse) {
        if (mouse != null) {
            mouse.click();
            if (mouse instanceof WirelessMouse) {
                WirelessMouse wirelessMouse = (WirelessMouse) mouse;
                wirelessMouse.connect();
            } else {
                System.out.println("This is a wired mouse");
            }
        } else {
            System.out.println("Mouse is null");
        }
    }
}
