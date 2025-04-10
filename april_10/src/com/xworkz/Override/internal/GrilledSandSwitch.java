package com.xworkz.Override.internal;

public class GrilledSandSwitch extends SandSwitch {
    public GrilledSandSwitch() {
        System.out.println("No argument constructor in GrilledSandSwitch");
    }

    @Override
    public void serve() {
        System.out.println("Serving a grilled sandwich");
    }

    public void toast(SandSwitch sandwich) {
        if (sandwich != null) {
            System.out.println("Toasting the sandwich");
        } else {
            System.out.println("Cannot toast, sandwich is null");
        }
    }
}
