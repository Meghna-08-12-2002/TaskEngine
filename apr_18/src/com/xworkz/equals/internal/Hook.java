package com.xworkz.equals.internal;

import java.util.Objects;

public class Hook {

        private String material;
        private String size;
        private int loadCapacity;
        private double price;

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setLoadCapacity(int loadCapacity) {
            this.loadCapacity = loadCapacity;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Hook{" +
                    "material='" + material + '\'' +
                    ", size='" + size + '\'' +
                    ", loadCapacity=" + loadCapacity +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Hook) {
                Hook other = (Hook) obj;
                return Objects.equals(this.material, other.material) &&
                        Objects.equals(this.size, other.size) &&
                        this.loadCapacity == other.loadCapacity &&
                        this.price == other.price;
            }
            return false;
        }


}
