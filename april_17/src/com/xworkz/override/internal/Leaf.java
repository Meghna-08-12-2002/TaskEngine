package com.xworkz.override.internal;

public class Leaf {
    private String name;
    private int size;

    public Leaf(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " leaf with size " + size + " cm is connected.");
    }

    @Override
    public String toString() {
        return "Leaf{name='" + name + "', size=" + size + "}";
    }
}
