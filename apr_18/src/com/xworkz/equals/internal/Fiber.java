package com.xworkz.equals.internal;

import java.util.Objects;

public class Fiber {

        private String type;
        private String color;
        private int length;
        private double price;

        // Setter methods
        public void setType(String type) {
            this.type = type;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        // Overridden toString method
        @Override
        public String toString() {
            return "Fiber{" +
                    "type='" + type + '\'' +
                    ", color='" + color + '\'' +
                    ", length=" + length +
                    ", price=" + price +
                    '}';
        }

        // Overridden equals method
        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Fiber) {
                Fiber other = (Fiber) obj;
                if (Objects.equals(this.type, other.type) &&
                        Objects.equals(this.color, other.color) &&
                        this.length == other.length &&
                        this.price == other.price) {
                    System.out.println("Fiber is matching..");
                    return true;
                }
            }
            return false;
        }


}
