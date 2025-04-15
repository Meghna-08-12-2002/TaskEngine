package com.xworkz.Override.internal;

public class HollowCylinder extends Cylinder {
    public HollowCylinder() {
        System.out.println("No argument constructor in HollowCylinder");
    }

    @Override
    public void rotate() {
        System.out.println("Rotating the hollow cylinder");
    }

    public void inspect() {

            System.out.println("Inspecting the hollow cylinder");

    }
}
