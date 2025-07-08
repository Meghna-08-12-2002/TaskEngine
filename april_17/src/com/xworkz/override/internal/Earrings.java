package com.xworkz.override.internal;

public class Earrings {
    private String name;
    private int size;

    public Earrings(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " earrings with size " + size + " are connected.");
    }

    @Override
    public String toString() {
        return "Earrings{name='" + name + "', size=" + size + "}";
    }
}
