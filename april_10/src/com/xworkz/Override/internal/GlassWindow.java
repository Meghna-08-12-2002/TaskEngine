package com.xworkz.Override.internal;

public class GlassWindow extends Window {
    public GlassWindow() {
        System.out.println("No argument constructor in GlassWindow");
    }

    @Override
    public void open() {
        System.out.println("Glass window is open");
    }

    public void clean(Window window) {
        if (window != null) {
            System.out.println("Cleaning the glass window");
        } else {
            System.out.println("Window is null, cannot clean");
        }
    }
}
