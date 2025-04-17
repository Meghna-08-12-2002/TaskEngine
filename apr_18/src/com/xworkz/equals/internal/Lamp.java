package com.xworkz.equals.internal;

import java.util.Objects;

public class Lamp {

        private String brand;
        private String color;
        private String type;
        private double price;

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Lamp{" +
                    "brand='" + brand + '\'' +
                    ", color='" + color + '\'' +
                    ", type='" + type + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Lamp) {
                Lamp other = (Lamp) obj;
                return Objects.equals(this.brand, other.brand) &&
                        Objects.equals(this.color, other.color) &&
                        Objects.equals(this.type, other.type) &&
                        this.price == other.price;
            }
            return false;
        }


}
