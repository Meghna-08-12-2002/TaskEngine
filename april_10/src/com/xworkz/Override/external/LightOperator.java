package com.xworkz.Override.external;

import com.xworkz.Override.internal.Led;
import com.xworkz.Override.internal.TubeLed;

public class LightOperator {
    public LightOperator() {
        System.out.println("No argument constructor in LightOperator");
    }

    public void operate(Led led) {
        if (led != null) {
            System.out.println("Operating on LED...");
            led.glow();
            if (led instanceof TubeLed) {
                TubeLed tube = (TubeLed) led;
                tube.adjustBrightness();
            } else {
                System.out.println("Not a TubeLed, basic LED operation only");
            }
        } else {
            System.out.println("LED is null");
        }
    }
}
