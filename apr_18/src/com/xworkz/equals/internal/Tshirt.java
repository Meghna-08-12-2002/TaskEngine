package com.xworkz.equals.internal;

import java.util.Objects;

public class Tshirt {
    private String brand;
    private String size;
    private String color;
    private double price;

    public Tshirt(String brand, String size, String color, double price) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tshirt{brand='" + brand + "', size='" + size + "', color='" + color + "', price=" + price + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tshirt) {
            Tshirt other = (Tshirt) obj;
            if (Objects.equals(brand, other.brand) &&
                    Objects.equals(size, other.size) &&
                    Objects.equals(color, other.color) &&
                    price == other.price) {
                System.out.println("Tshirt is matching..");
                return true;
            }
        }
        return false;
    }
}
