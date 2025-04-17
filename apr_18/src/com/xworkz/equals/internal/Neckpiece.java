package com.xworkz.equals.internal;

import java.util.Objects;

public class Neckpiece {

        private String brand;
        private String material;
        private String color;
        private double price;

        public Neckpiece(String brand, String material, String color, double price) {
            this.brand = brand;
            this.material = material;
            this.color = color;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Neckpiece{" +
                    "brand='" + brand + '\'' +
                    ", material='" + material + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Neckpiece) {
                Neckpiece other = (Neckpiece) obj;
                if (Objects.equals(this.brand, other.brand) &&
                        Objects.equals(this.material, other.material) &&
                        Objects.equals(this.color, other.color) &&
                        this.price == other.price) {
                    System.out.println("Neckpiece is matching...");
                    return true;
                }
            }
            return false;
        }
    }


