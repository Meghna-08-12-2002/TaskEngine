package com.xworks.god.internal4;

public class Flight {
    public Flight() {
        System.out.println("Flight constructor called");
    }

    public static void move() {
        Drone drone = new Drone();
        Drone.launch();
        drone.navigate();
    }
}
