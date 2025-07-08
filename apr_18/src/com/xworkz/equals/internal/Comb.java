package com.xworkz.equals.internal;

import java.util.Objects;

public class Comb {
    private String material;
    private String brand;
    private String color;
    private int teethCount;

    public Comb(String material, String brand, String color, int teethCount) {
        this.material = material;
        this.brand = brand;
        this.color = color;
        this.teethCount = teethCount;
    }

    @Override
    public String toString() {
        return "Comb{material='" + material + "', brand='" + brand + "', color='" + color + "', teethCount=" + teethCount + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Comb) {
            Comb other = (Comb) obj;
            if (Objects.equals(material, other.material) &&
                    Objects.equals(brand, other.brand) &&
                    Objects.equals(color, other.color) &&
                    teethCount == other.teethCount) {
                System.out.println("Comb is matching..");
                return true;
            }
        }
        return false;
    }
}
