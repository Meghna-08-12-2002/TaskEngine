package com.xworkz.Override.internal;

public class GlassJar extends Jar {
    public GlassJar() {
        System.out.println("No argument constructor in GlassJar");
    }

    @Override
    public void store() {
        System.out.println("Storing items in the glass jar");
    }

    public void preserve() {

            System.out.println("Preserving items in the glass jar");

    }
}
