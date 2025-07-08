package com.xworkz.equals.internal;

import java.util.Objects;

public class Robot {

        private String model;
        private String color;
        private String functionality;
        private double price;

        public Robot(String model, String color, String functionality, double price) {
            this.model = model;
            this.color = color;
            this.functionality = functionality;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Robot{" +
                    "model='" + model + '\'' +
                    ", color='" + color + '\'' +
                    ", functionality='" + functionality + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Robot) {
                Robot other = (Robot) obj;
                if (Objects.equals(this.model, other.model) &&
                        Objects.equals(this.color, other.color) &&
                        Objects.equals(this.functionality, other.functionality) &&
                        this.price == other.price) {
                    System.out.println("Robot is matching...");
                    return true;
                }
            }
            return false;

    }

}
