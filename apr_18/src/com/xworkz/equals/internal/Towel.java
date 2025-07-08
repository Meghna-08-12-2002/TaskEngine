package com.xworkz.equals.internal;

import java.util.Objects;

public class Towel {

        private String color;
        private String material;
        private String size;
        private double price;

        public Towel(String color, String material, String size, double price) {
            this.color = color;
            this.material = material;
            this.size = size;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Towel{" +
                    "color='" + color + '\'' +
                    ", material='" + material + '\'' +
                    ", size='" + size + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Towel) {
                Towel other = (Towel) obj;
                if (Objects.equals(this.color, other.color) &&
                        Objects.equals(this.material, other.material) &&
                        Objects.equals(this.size, other.size) &&
                        this.price == other.price) {
                    System.out.println("Towel is matching...");
                    return true;
                }
            }
            return false;
        }
    }


