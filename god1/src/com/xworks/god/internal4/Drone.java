package com.xworks.god.internal4;

public class Drone {
    public Drone() {
        System.out.println("Drone constructor called");
    }

    public static void launch() {
        System.out.println("Drone: public launch method");
    }

    void navigate() {
        System.out.println("Drone: package-default navigate method");
    }

    private void selfDestruct() {
        System.out.println("Drone: private selfDestruct method");
    }
}
