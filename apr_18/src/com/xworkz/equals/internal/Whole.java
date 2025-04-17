package com.xworkz.equals.internal;

import java.util.Objects;

public class Whole {

        private String material;
        private double price;
        private String size;
        private String color;

        // Setter methods
        public void setMaterial(String material) {
            this.material = material;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // Overridden toString method
        @Override
        public String toString() {
            return "Whole{" +
                    "material='" + material + '\'' +
                    ", price=" + price +
                    ", size='" + size + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Whole) {
                Whole other = (Whole) obj;
                if (Objects.equals(this.material, other.material) &&
                        this.price == other.price &&
                        Objects.equals(this.size, other.size) &&
                        Objects.equals(this.color, other.color)) {
                    System.out.println("Whole is matching..");
                    return true;
                }
            }
            return false;
        }
    }


