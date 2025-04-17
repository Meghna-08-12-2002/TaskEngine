package com.xworkz.equals.internal;

import java.util.Objects;

public class Bat {

        private String type;
        private String color;
        private double weight;
        private String material;

        // Setter methods
        public void setType(String type) {
            this.type = type;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        // Overridden toString method
        @Override
        public String toString() {
            return "Bat{" +
                    "type='" + type + '\'' +
                    ", color='" + color + '\'' +
                    ", weight=" + weight +
                    ", material='" + material + '\'' +
                    '}';
        }

        // Overridden equals method
        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Bat) {
                Bat other = (Bat) obj;
                if (Objects.equals(this.type, other.type) &&
                        Objects.equals(this.color, other.color) &&
                        this.weight == other.weight &&
                        Objects.equals(this.material, other.material)) {
                    System.out.println("Bat is matching..");
                    return true;
                }
            }
            return false;
        }

}
