package com.xworkz.equals.internal;

import java.util.Objects;

public class Statue {

        private String material;
        private String shape;
        private double height;
        private double price;

        public Statue(String material, String shape, double height, double price) {
            this.material = material;
            this.shape = shape;
            this.height = height;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Statue{" +
                    "material='" + material + '\'' +
                    ", shape='" + shape + '\'' +
                    ", height=" + height +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Statue) {
                Statue other = (Statue) obj;
                if (Objects.equals(this.material, other.material) &&
                        Objects.equals(this.shape, other.shape) &&
                        this.height == other.height &&
                        this.price == other.price) {
                    System.out.println("Statue is matching...");
                    return true;
                }
            }
            return false;
        }
    }


