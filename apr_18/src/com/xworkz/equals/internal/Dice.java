package com.xworkz.equals.internal;

import java.util.Objects;

public class Dice {

        private String color;
        private int numberOfSides;
        private String material;
        private double price;

        public Dice(String color, int numberOfSides, String material, double price) {
            this.color = color;
            this.numberOfSides = numberOfSides;
            this.material = material;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Dice{" +
                    "color='" + color + '\'' +
                    ", numberOfSides=" + numberOfSides +
                    ", material='" + material + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Dice) {
                Dice other = (Dice) obj;
                if (Objects.equals(this.color, other.color) &&
                        this.numberOfSides == other.numberOfSides &&
                        Objects.equals(this.material, other.material) &&
                        this.price == other.price) {
                    System.out.println("Dice is matching...");
                    return true;
                }
            }
            return false;

    }

}
