package com.xworks.god.internal6;

public class Face {
    public Face() {
        System.out.println("Face constructor called");
    }

    public static void glow() {
        Powder powder = new Powder();
        Powder.apply();
        powder.blend();
    }
}
