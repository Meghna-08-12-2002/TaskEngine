package com.xworkz.Override.internal;

public class ThemePark extends Park {
    public ThemePark() {
        System.out.println("No argument constructor in ThemePark");
    }

    @Override
    public void open() {
        System.out.println("Theme Park is now open with thrilling rides");
    }

    public void launchRide() {

            System.out.println("Launching roller coaster ride");

    }
}
