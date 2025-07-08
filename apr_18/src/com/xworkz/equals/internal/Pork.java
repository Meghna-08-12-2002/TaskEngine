package com.xworkz.equals.internal;

import java.util.Objects;

public class Pork
{
        private String cutType;
        private double weight;
        private String packaging;
        private double price;

        public Pork(String cutType, double weight, String packaging, double price) {
            this.cutType = cutType;
            this.weight = weight;
            this.packaging = packaging;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Pork{" +
                    "cutType='" + cutType + '\'' +
                    ", weight=" + weight +
                    ", packaging='" + packaging + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Pork) {
                Pork other = (Pork) obj;
                if (Objects.equals(this.cutType, other.cutType) &&
                        this.weight == other.weight &&
                        Objects.equals(this.packaging, other.packaging) &&
                        this.price == other.price) {
                    System.out.println("Pork is matching...");
                    return true;
                }
            }
            return false;
        }
    }


