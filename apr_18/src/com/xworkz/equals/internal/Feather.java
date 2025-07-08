package com.xworkz.equals.internal;

import java.util.Objects;

public class Feather {

        private String type;
        private String color;
        private double length;
        private double price;

        public Feather(String type, String color, double length, double price) {
            this.type = type;
            this.color = color;
            this.length = length;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Feather{" +
                    "type='" + type + '\'' +
                    ", color='" + color + '\'' +
                    ", length=" + length +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Feather) {
                Feather other = (Feather) obj;
                if (Objects.equals(this.type, other.type) &&
                        Objects.equals(this.color, other.color) &&
                        this.length == other.length &&
                        this.price == other.price) {
                    System.out.println("Feather is matching...");
                    return true;
                }
            }
            return false;
        }


}
