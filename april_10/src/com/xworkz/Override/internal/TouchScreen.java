package com.xworkz.Override.internal;

public class TouchScreen extends Screen {
    public TouchScreen() {
        System.out.println("No argument constructor in TouchScreen");
    }

    @Override
    public void display() {
        System.out.println("Displaying content on the touch screen");
    }

    public void touch() {
        System.out.println("Touching the screen to interact");
    }
}
