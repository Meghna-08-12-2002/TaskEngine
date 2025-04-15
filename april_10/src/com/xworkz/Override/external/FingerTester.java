package com.xworkz.Override.external;

import com.xworkz.Override.internal.Finger;
import com.xworkz.Override.internal.RingFinger;

public class FingerTester {
    public void testFlex(Finger finger) {
        if (finger != null) {
            finger.flex();
            if (finger instanceof RingFinger) {
                RingFinger ring = (RingFinger) finger;
                ring.wearRing();
            } else {
                System.out.println("This is not a RingFinger");
            }
        } else {
            System.out.println("Finger is null");
        }
    }
}
