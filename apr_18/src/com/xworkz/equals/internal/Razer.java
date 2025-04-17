package com.xworkz.equals.internal;

import java.util.Objects;

public class Razer {

        private String type;
        private String brand;
        private String bladeMaterial;
        private double cost;

        public Razer(String type, String brand, String bladeMaterial, double cost) {
            this.type = type;
            this.brand = brand;
            this.bladeMaterial = bladeMaterial;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Razer{type='" + type + "', brand='" + brand + "', bladeMaterial='" + bladeMaterial + "', cost=" + cost + "}";
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Razer) {
                Razer other = (Razer) obj;
                if (Objects.equals(type, other.type) &&
                        Objects.equals(brand, other.brand) &&
                        Objects.equals(bladeMaterial, other.bladeMaterial) &&
                        cost == other.cost) {
                    System.out.println("Razer is matching..");
                    return true;
                }
            }
            return false;
        }
    }

