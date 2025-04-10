package com.xworkz.Override.internal;

public class WallClock extends Clock {
    public WallClock() {
        System.out.println("No argument constructor in WallClock");
    }

    @Override
    public void showTime() {
        System.out.println("WallClock showtime in analog format");
    }

    public void chime(Clock clock) {
        if (clock != null) {
            System.out.println("WallClock chimes every hour");
        } else {
            System.out.println("Clock is null, cannot chime");
        }
    }
}
