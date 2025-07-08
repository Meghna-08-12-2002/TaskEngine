package com.xworkz.override.internal;

public class DrySkin {
    private String name;
    private int size;

    public DrySkin(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " dry skin connected with size " + size);
    }

    @Override
    public String toString() {
        return "DrySkin{name='" + name + "', size=" + size + "}";
    }
}

