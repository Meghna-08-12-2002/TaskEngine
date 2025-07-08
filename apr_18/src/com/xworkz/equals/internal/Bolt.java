package com.xworkz.equals.internal;

import java.util.Objects;

public class Bolt {

        private String material;
        private String size;
        private String type;
        private double price;

        public Bolt(String material, String size, String type, double price) {
            this.material = material;
            this.size = size;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Bolt{" +
                    "material='" + material + '\'' +
                    ", size='" + size + '\'' +
                    ", type='" + type + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Bolt) {
                Bolt other = (Bolt) obj;
                if (Objects.equals(this.material, other.material) &&
                        Objects.equals(this.size, other.size) &&
                        Objects.equals(this.type, other.type) &&
                        this.price == other.price) {
                    System.out.println("Bolt is matching...");
                    return true;
                }
            }
            return false;
        }
    }


