package com.workz.java;

public abstract class Device {
    abstract void powerOn();
    abstract void operate();
    void info() {
        System.out.println("Device information");
    }
    void status() {
        System.out.println("Device is online");
    }

}
