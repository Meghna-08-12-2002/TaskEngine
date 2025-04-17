package com.xworkz.equals.internal;

import java.util.Objects;

public class Juicer {

        private String brand;
        private String type;
        private int power;
        private double price;

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Juicer{" +
                    "brand='" + brand + '\'' +
                    ", type='" + type + '\'' +
                    ", power=" + power +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Juicer) {
                Juicer other = (Juicer) obj;
                return Objects.equals(this.brand, other.brand) &&
                        Objects.equals(this.type, other.type) &&
                        this.power == other.power &&
                        this.price == other.price;
            }
            return false;
        }


}
