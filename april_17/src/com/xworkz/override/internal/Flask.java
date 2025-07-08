package com.xworkz.override.internal;

public class Flask {
    private String name;
    private int size;

    public Flask(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " flask with size " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Flask{name='" + name + "', size=" + size + "}";
    }
}
