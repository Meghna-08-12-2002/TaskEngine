package com.xworkz.Override.external;

import com.xworkz.Override.internal.Clock;
import com.xworkz.Override.internal.WallClock;

public class Timekeeper {
    public Timekeeper() {
        System.out.println("No argument constructor in Timekeeper");
    }

    public void displayTime(Clock clock) {
        if (clock != null) {
            clock.showTime();
            if (clock instanceof WallClock) {
                WallClock wallClock = (WallClock) clock;
                wallClock.chime();
            } else {
                System.out.println("This is not a WallClock, just a regular clock.");
            }
        } else {
            System.out.println("No clock to display time.");
        }
    }
}
