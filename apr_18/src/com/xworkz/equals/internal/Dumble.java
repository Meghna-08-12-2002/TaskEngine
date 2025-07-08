package com.xworkz.equals.internal;

import java.util.Objects;
public class Dumble {
    private String material;
    private double weight;
    private String color;
    private String brand;

    public Dumble(String material, double weight, String color, String brand) {
        this.material = material;
        this.weight = weight;
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Dumble{material='" + material + "', weight=" + weight + ", color='" + color + "', brand='" + brand + "'}";
    }

    @Override
    public boolean equals(Object anything) {
        if (anything != null && anything instanceof Dumble) {
            Dumble other = (Dumble) anything;
            if (Objects.equals(this.material, other.material)
                    && this.weight == other.weight
                    && Objects.equals(this.color, other.color)
                    && Objects.equals(this.brand, other.brand)) {
                System.out.println("Dumble is matching..");
                return true;
            }
        }
        return false;
    }
}
