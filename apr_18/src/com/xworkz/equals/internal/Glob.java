package com.xworkz.equals.internal;

import java.util.Objects;

public class Glob {
        private String material;
        private String size;
        private String brand;
        private double price;

        public Glob(String material, String size, String brand, double price) {
            this.material = material;
            this.size = size;
            this.brand = brand;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Glob{" +
                    "material='" + material + '\'' +
                    ", size='" + size + '\'' +
                    ", brand='" + brand + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Glob) {
                Glob other = (Glob) obj;
                if (Objects.equals(this.material, other.material) &&
                        Objects.equals(this.size, other.size) &&
                        Objects.equals(this.brand, other.brand) &&
                        this.price == other.price) {
                    System.out.println("Glob is matching...");
                    return true;
                }
            }
            return false;
        }
    }


