package com.xworkz.override.internal;

public class Elevator {
    private String name;
    private int size;

    public Elevator(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " elevator with capacity " + size + " people is connected.");
    }

    @Override
    public String toString() {
        return "Elevator{name='" + name + "', size=" + size + "}";
    }

}
