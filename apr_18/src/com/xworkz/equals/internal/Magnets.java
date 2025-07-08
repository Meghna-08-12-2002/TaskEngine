package com.xworkz.equals.internal;

import java.util.Objects;

public class Magnets {

        private String shape;
        private String material;
        private int strength;
        private double price;

        public void setShape(String shape) {
            this.shape = shape;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Magnets{" +
                    "shape='" + shape + '\'' +
                    ", material='" + material + '\'' +
                    ", strength=" + strength +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Magnets) {
                Magnets other = (Magnets) obj;
                return Objects.equals(this.shape, other.shape) &&
                        Objects.equals(this.material, other.material) &&
                        this.strength == other.strength &&
                        this.price == other.price;
            }
            return false;
        }


}
