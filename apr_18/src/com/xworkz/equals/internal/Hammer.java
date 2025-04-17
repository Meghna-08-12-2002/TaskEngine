package com.xworkz.equals.internal;

import java.util.Objects;

public class Hammer {

    private String brand;
    private String type;
    private String handleMaterial;
    private double weight;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHandleMaterial(String handleMaterial) {
        this.handleMaterial = handleMaterial;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Hammer{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", handleMaterial='" + handleMaterial + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Hammer) {
            Hammer other = (Hammer) obj;
            return Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.handleMaterial, other.handleMaterial) &&
                    this.weight == other.weight;
        }
        return false;
    }
}


