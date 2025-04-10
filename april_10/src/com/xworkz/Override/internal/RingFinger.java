package com.xworkz.Override.internal;

public class RingFinger extends Finger{
    public RingFinger() {
        System.out.println("No argument constructor in RingFinger");
    }

    @Override
    public void flex() {
        System.out.println("Flexing the ring finger");
    }

    public void wearRing(Finger finger) {
        if (finger != null) {
            System.out.println("Wearing a ring on the finger");
        } else {
            System.out.println("No finger available to wear a ring");
        }
    }
}
