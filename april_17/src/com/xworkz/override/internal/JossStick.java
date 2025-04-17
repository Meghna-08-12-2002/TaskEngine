package com.xworkz.override.internal;

public class JossStick {
    private String name;
    private int size;

    public JossStick(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void connect() {
        System.out.println(name + " joss stick with length " + size + " cm is connected.");
    }

    @Override
    public String toString() {
        return "JossStick{name='" + name + "', size=" + size + "}";
    }
}
