package com.xworkz.override.internal;

public class Flagon {
    private String name;
    private int size;

    public Flagon(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " flagon with size " + size + " is connected.");
    }

    @Override
    public String toString() {
        return "Flagon{name='" + name + "', size=" + size + "}";
    }

}
