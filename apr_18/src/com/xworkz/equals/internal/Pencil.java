package com.xworkz.equals.internal;

import java.util.Objects;

public class Pencil {

        private String brand;
        private String color;
        private String hardness;
        private double price;

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setHardness(String hardness) {
            this.hardness = hardness;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Pencil{" +
                    "brand='" + brand + '\'' +
                    ", color='" + color + '\'' +
                    ", hardness='" + hardness + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Pencil) {
                Pencil other = (Pencil) obj;
                return Objects.equals(this.brand, other.brand) &&
                        Objects.equals(this.color, other.color) &&
                        Objects.equals(this.hardness, other.hardness) &&
                        this.price == other.price;
            }
            return false;
        }


}
