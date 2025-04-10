package com.xworkz.Override.internal;

public class LedMonitor extends Monitor {
    public LedMonitor() {
        System.out.println("No argument constructor in LedMonitor");
    }

    @Override
    public void display() {
        System.out.println("Displaying content on LED monitor");
    }

    public void adjustBrightness(Monitor monitor) {
        if (monitor != null) {
            System.out.println("Adjusting brightness on the monitor");
        } else {
            System.out.println("Monitor reference is null, cannot adjust brightness");
        }
    }
}
