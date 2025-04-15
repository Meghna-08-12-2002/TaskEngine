package com.xworkz.Override.internal;

public class SmartElevator extends Elevator {
    public SmartElevator() {
        System.out.println("No argument constructor in SmartElevator");
    }

    @Override
    public void move() {
        System.out.println("Smart Elevator is moving with voice command");
    }

    public void autoClose() {

            System.out.println("Smart elevator doors will auto close in 5 seconds");

    }
}
