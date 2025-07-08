package com.xworkz.override.external;

public class SafariZoo {
    private String name;
    private String size;

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "SafariZoo{name='" + name + "', size='" + size + "'}";
    }
}
