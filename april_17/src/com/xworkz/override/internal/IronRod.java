package com.xworkz.override.internal;

public class IronRod {
    private String name;
    private int size;

    public IronRod(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " iron rod with size " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "IronRod{name='" + name + "', size=" + size + "}";
    }
}
