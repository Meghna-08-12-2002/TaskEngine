package com.xworkz.Override.internal;

public class ConcertStage  extends Stage {
    public ConcertStage() {
        System.out.println("No argument constructor in ConcertStage");
    }

    @Override
    public void setupStage() {
        System.out.println("Setting up a concert stage with sound and lighting");
    }

    @Override
    public void showPerformance() {
        System.out.println("Showing a live concert performance");
    }

    public void arrangeSeating() {
        System.out.println("Arranging seating for concert audience");
    }
}
