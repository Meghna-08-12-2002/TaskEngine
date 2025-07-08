package com.xworkz.Override.internal;

public class SafetyPin extends Pin {
    public SafetyPin() {
        System.out.println("no argument constructor in SafetyPin");
    }

    @Override
    public void use() {
        System.out.println("Using a safety pin");
    }

    public void lock() {

            System.out.println("Locking the safety pin securely");

    }
}
