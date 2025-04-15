package com.xworkz.Override.internal;

public class WallClock extends Clock {
    public WallClock() {
        System.out.println("No argument constructor in WallClock");
    }

    @Override
    public void showTime() {
        System.out.println("WallClock showtime in analog format");
    }

    public void chime() {

            System.out.println("WallClock chimes every hour");

    }
}
