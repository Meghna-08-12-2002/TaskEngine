package com.xworkz.Override.internal;

public class WoodenCradle extends Cradle {
    public WoodenCradle() {
        System.out.println("No argument constructor in WoodenCradle");
    }

    @Override
    public void rock() {
        System.out.println("Rocking in a wooden cradle");
    }

    public void paint() {

            System.out.println("Painting the wooden cradle");

    }
}
