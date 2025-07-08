package com.xworkz.override.internal;

public class Fog {
    private String name;
    private int size;

    public Fog(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " fog with density " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Fog{name='" + name + "', size=" + size + "}";
    }
}
