package com.xworkz.override.internal;

public class Cradle {
    private String name;
    private int size;

    public Cradle(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " cradle connected with size " + size);
    }

    @Override
    public String toString() {
        return "Cradle{name='" + name + "', size=" + size + "}";
    }
}
