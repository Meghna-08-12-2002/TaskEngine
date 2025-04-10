package com.xworkz.Override.internal;

public class ThemePark extends Park {
    public ThemePark() {
        System.out.println("No argument constructor in ThemePark");
    }

    @Override
    public void open() {
        System.out.println("Theme Park is now open with thrilling rides");
    }

    public void launchRide(Park park) {
        if (park != null) {
            System.out.println("Launching roller coaster ride");
        } else {
            System.out.println("Park is null, cannot launch ride");
        }
    }
}
