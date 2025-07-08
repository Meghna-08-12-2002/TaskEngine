package com.xworkz.equals.internal;

import java.util.Objects;

public class SmartWatch {

        private String brand;
        private String color;
        private String model;
        private double price;

        public SmartWatch(String brand, String color, String model, double price) {
            this.brand = brand;
            this.color = color;
            this.model = model;
            this.price = price;
        }

        @Override
        public String toString() {
            return "SmartWatch{" +
                    "brand='" + brand + '\'' +
                    ", color='" + color + '\'' +
                    ", model='" + model + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SmartWatch) {
                SmartWatch other = (SmartWatch) obj;
                if (Objects.equals(this.brand, other.brand) &&
                        Objects.equals(this.color, other.color) &&
                        Objects.equals(this.model, other.model) &&
                        this.price == other.price) {
                    System.out.println("SmartWatch is matching...");
                    return true;
                }
            }
            return false;
        }
    }

