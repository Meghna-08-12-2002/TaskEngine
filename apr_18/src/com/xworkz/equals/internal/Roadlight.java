package com.xworkz.equals.internal;

import java.util.Objects;

public class Roadlight {
    private String type;
    private int height;
    private String color;
    private String location;

    public Roadlight(String type, int height, String color, String location) {
        this.type = type;
        this.height = height;
        this.color = color;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Roadlight{type='" + type + "', height=" + height + ", color='" + color + "', location='" + location + "'}";
    }

    @Override
    public boolean equals(Object light) {
        if (light != null && light instanceof Roadlight) {
            Roadlight other = (Roadlight) light;
            if (Objects.equals(this.type, other.type)
                    && this.height == other.height
                    && Objects.equals(this.color, other.color)
                    && Objects.equals(this.location, other.location)) {
                System.out.println("Roadlight is matching..");
                return true;
            }
        }
        return false;
    }
}
