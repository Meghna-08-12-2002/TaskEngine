package com.xworkz.equals.internal;

import java.util.Objects;

public class Grater {

        private String brand;
        private String material;
        private String shape;
        private double cost;

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Grater{" +
                    "brand='" + brand + '\'' +
                    ", material='" + material + '\'' +
                    ", shape='" + shape + '\'' +
                    ", cost=" + cost +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Grater) {
                Grater other = (Grater) obj;
                return Objects.equals(this.brand, other.brand) &&
                        Objects.equals(this.material, other.material) &&
                        Objects.equals(this.shape, other.shape) &&
                        this.cost == other.cost;
            }
            return false;
        }

}
