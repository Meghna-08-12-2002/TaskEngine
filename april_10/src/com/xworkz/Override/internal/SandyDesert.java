package com.xworkz.Override.internal;

public class SandyDesert extends Desert {
    public SandyDesert() {
        System.out.println("No argument constructor in SandyDesert");
    }

    @Override
    public void climate() {
        System.out.println("Sandy desert has hot and dry climate with lots of sand");
    }

    public void sandStorm() {

            System.out.println("Sandy desert is experiencing a sandstorm");

    }
}
