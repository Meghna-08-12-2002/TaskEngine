package com.xworks.god.external4;

import com.xworks.god.internal4.Drone;

public class Sky {
    public Sky() {
        System.out.println("Sky constructor called");
    }

    public static void fly() {
        Drone drone = new Drone();
        Drone.launch();
    }
}
