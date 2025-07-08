package com.xworkz.equals.internal;

import java.util.Objects;

public class Guitar {

        private String brand;
        private String type;
        private int strings;
        private double price;

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setStrings(int strings) {
            this.strings = strings;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Guitar{" +
                    "brand='" + brand + '\'' +
                    ", type='" + type + '\'' +
                    ", strings=" + strings +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Guitar) {
                Guitar other = (Guitar) obj;
                return Objects.equals(this.brand, other.brand) &&
                        Objects.equals(this.type, other.type) &&
                        this.strings == other.strings &&
                        this.price == other.price;
            }
            return false;
        }


}
