package com.xworkz.Override.internal;

public class GrilledSandSwitch extends SandSwitch {
    public GrilledSandSwitch() {
        System.out.println("No argument constructor in GrilledSandSwitch");
    }

    @Override
    public void serve() {
        System.out.println("Serving a grilled sandwich");
    }

    public void toast() {

        System.out.println("Toasting the sandwich");
    }
}
