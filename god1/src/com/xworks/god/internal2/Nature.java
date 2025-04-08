package com.xworks.god.internal2;

public class Nature {
    public Nature() {
        System.out.println("Nature contructor called");
    }

    public static void show() {
        Beach beach = new Beach();
        Beach.prepareGear();
        beach.exploreDepths();
    }
}
