package com.xworks.god.internal;

public class Trust {
    public Trust() {
        System.out.println("Trust contructor called");
    }

    public static void showTempleFeatures() {
        Temple temple = new Temple();
        temple.openGate();
        temple.attendPooja();
    }
}
