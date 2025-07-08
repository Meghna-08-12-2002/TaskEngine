package com.xworkz.equals.internal;

import java.util.Objects;

public class Pendent
{

        private String material;
        private String shape;
        private String color;
        private double price;

        public Pendent(String material, String shape, String color, double price) {
            this.material = material;
            this.shape = shape;
            this.color = color;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Pendent{" +
                    "material='" + material + '\'' +
                    ", shape='" + shape + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Pendent) {
                Pendent other = (Pendent) obj;
                if (Objects.equals(this.material, other.material) &&
                        Objects.equals(this.shape, other.shape) &&
                        Objects.equals(this.color, other.color) &&
                        this.price == other.price) {
                    System.out.println("Pendent is matching...");
                    return true;
                }
            }
            return false;
        }
    }


