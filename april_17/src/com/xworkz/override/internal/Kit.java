package com.xworkz.override.internal;

public class Kit {
    private String name;
    private int size;

    public Kit(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " kit with size " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Kit{name='" + name + "', size=" + size + "}";
    }
}
