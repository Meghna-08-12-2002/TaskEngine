package com.xworkz.equals.internal;

import java.util.Objects;

public class Hose {

        private String length;
        private String diameter;
        private String material;
        private double price;

        public void setLength(String length) {
            this.length = length;
        }

        public void setDiameter(String diameter) {
            this.diameter = diameter;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Hose{" +
                    "length='" + length + '\'' +
                    ", diameter='" + diameter + '\'' +
                    ", material='" + material + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Hose) {
                Hose other = (Hose) obj;
                return Objects.equals(this.length, other.length) &&
                        Objects.equals(this.diameter, other.diameter) &&
                        Objects.equals(this.material, other.material) &&
                        this.price == other.price;
            }
            return false;
        }

}
