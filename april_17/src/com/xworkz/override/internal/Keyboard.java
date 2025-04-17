package com.xworkz.override.internal;

public class Keyboard {
    private String name;
    private int size;

    public Keyboard(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " keyboard with size " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Keyboard{name='" + name + "', size=" + size + "}";
    }
}
