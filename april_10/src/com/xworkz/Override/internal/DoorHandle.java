package com.xworkz.Override.internal;

public class DoorHandle extends Handle {
    public DoorHandle() {
        System.out.println("No argument constructor in DoorHandle");
    }

    @Override
    public void turn() {
        System.out.println("Turning the door handle to open the door");
    }

    public void install(Handle handle) {
        if (handle != null) {
            System.out.println("Installing the door handle");
        } else {
            System.out.println("Handle is null, cannot install");
        }
    }
}
