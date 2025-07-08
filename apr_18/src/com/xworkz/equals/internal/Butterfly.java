package com.xworkz.equals.internal;

import java.util.Objects;

public class Butterfly {

        private String species;
        private String color;
        private double wingspan;
        private double price;

        public Butterfly(String species, String color, double wingspan, double price) {
            this.species = species;
            this.color = color;
            this.wingspan = wingspan;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Butterfly{" +
                    "species='" + species + '\'' +
                    ", color='" + color + '\'' +
                    ", wingspan=" + wingspan +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Butterfly) {
                Butterfly other = (Butterfly) obj;
                if (Objects.equals(this.species, other.species) &&
                        Objects.equals(this.color, other.color) &&
                        this.wingspan == other.wingspan &&
                        this.price == other.price) {
                    System.out.println("Butterfly is matching...");
                    return true;
                }
            }
            return false;
        }
    }


