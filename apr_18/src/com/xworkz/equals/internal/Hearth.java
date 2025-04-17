package com.xworkz.equals.internal;

import java.util.Objects;

public class Hearth {

        private String material;
        private String type;
        private int size;
        private double price;

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Hearth{" +
                    "material='" + material + '\'' +
                    ", type='" + type + '\'' +
                    ", size=" + size +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Hearth) {
                Hearth other = (Hearth) obj;
                return Objects.equals(this.material, other.material) &&
                        Objects.equals(this.type, other.type) &&
                        this.size == other.size &&
                        this.price == other.price;
            }
            return false;
        }


}
