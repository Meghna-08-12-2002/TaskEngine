package com.xworkz.override.internal;

public class Desert {
    private String name;
    private int size;

    public Desert(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " desert area connected with size " + size);
    }

    @Override
    public String toString() {
        return "Desert{name='" + name + "', size=" + size + "}";
    }
}
