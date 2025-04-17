package com.xworkz.equals.internal;

import java.util.Objects;

public class Belt {

        private String color;
        private String material;
        private String size;
        private double price;

        public Belt(String color, String material, String size, double price) {
            this.color = color;
            this.material = material;
            this.size = size;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Belt{" +
                    "color='" + color + '\'' +
                    ", material='" + material + '\'' +
                    ", size='" + size + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Belt) {
                Belt other = (Belt) obj;
                if (Objects.equals(this.color, other.color) &&
                        Objects.equals(this.material, other.material) &&
                        Objects.equals(this.size, other.size) &&
                        this.price == other.price) {
                    System.out.println("Belt is matching...");
                    return true;
                }
            }
            return false;
        }
    }


