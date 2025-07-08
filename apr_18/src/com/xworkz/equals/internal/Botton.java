package com.xworkz.equals.internal;

import java.util.Objects;

public class Botton
{
        private String color;
        private String material;
        private String size;
        private double price;

        public Botton(String color, String material, String size, double price) {
            this.color = color;
            this.material = material;
            this.size = size;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Botton{" +
                    "color='" + color + '\'' +
                    ", material='" + material + '\'' +
                    ", size='" + size + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Botton) {
                Botton other = (Botton) obj;
                if (Objects.equals(this.color, other.color) &&
                        Objects.equals(this.material, other.material) &&
                        Objects.equals(this.size, other.size) &&
                        this.price == other.price) {
                    System.out.println("Botton is matching...");
                    return true;
                }
            }
            return false;
        }
    }


