package com.xworkz.equals.internal;

import java.util.Objects;

public class Dryer {

        private String brand;
        private String type;
        private String color;
        private double cost;

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Dryer{" +
                    "brand='" + brand + '\'' +
                    ", type='" + type + '\'' +
                    ", color='" + color + '\'' +
                    ", cost=" + cost +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Dryer) {
                Dryer other = (Dryer) obj;
                return Objects.equals(this.brand, other.brand) &&
                        Objects.equals(this.type, other.type) &&
                        Objects.equals(this.color, other.color) &&
                        this.cost == other.cost;
            }
            return false;
        }


}
