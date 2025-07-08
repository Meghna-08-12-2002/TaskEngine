package com.xworkz.equals.internal;

import java.util.Objects;

public class Cake {
    public Cake(){
        System.out.println("no argument constructor");
    }
    private String color;
    private int cost;
    private String brand;
    private String material;

    public Cake(String color, int cost, String brand, String material) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cake{color='" + color + "', cost=" + cost + ", brand='" + brand + "', material='" + material + "'}";
    }

    @Override
    public boolean equals(Object cakes) {
        if (cakes != null && cakes instanceof Cake ) {
            Cake other = (Cake) cakes;
            if (Objects.equals(this.color, other.color)
                    && this.cost == other.cost
                    && Objects.equals(this.brand, other.brand)
                    && Objects.equals(this.material, other.material)) {
                System.out.println("Bottle is matching..");
                return true;
            }
        }
        return false;
    }

}
