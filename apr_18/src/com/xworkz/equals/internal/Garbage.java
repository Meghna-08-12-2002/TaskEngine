package com.xworkz.equals.internal;

import java.util.Objects;

public class Garbage {
        private String material;
        private String type;
        private String location;
        private double weight;

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Garbage{" +
                    "material='" + material + '\'' +
                    ", type='" + type + '\'' +
                    ", location='" + location + '\'' +
                    ", weight=" + weight +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Garbage) {
                Garbage other = (Garbage) obj;
                return Objects.equals(this.material, other.material) &&
                        Objects.equals(this.type, other.type) &&
                        Objects.equals(this.location, other.location) &&
                        this.weight == other.weight;
            }
            return false;
        }


}
