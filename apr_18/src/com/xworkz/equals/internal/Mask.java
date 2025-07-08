package com.xworkz.equals.internal;

import java.util.Objects;

public class Mask {

        private String material;
        private String color;
        private String size;
        private double price;

        public Mask(String material, String color, String size, double price) {
            this.material = material;
            this.color = color;
            this.size = size;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Mask{" +
                    "material='" + material + '\'' +
                    ", color='" + color + '\'' +
                    ", size='" + size + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Mask) {
                Mask other = (Mask) obj;
                if (Objects.equals(this.material, other.material) &&
                        Objects.equals(this.color, other.color) &&
                        Objects.equals(this.size, other.size) &&
                        this.price == other.price) {
                    System.out.println("Mask is matching...");
                    return true;
                }
            }
            return false;
        }


}
