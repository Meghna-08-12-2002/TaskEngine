package com.xworkz.equals.internal;

import java.util.Objects;

public class Rail {

        private String material;
        private String type;
        private int length;
        private double weight;

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Rail{" +
                    "material='" + material + '\'' +
                    ", type='" + type + '\'' +
                    ", length=" + length +
                    ", weight=" + weight +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Rail) {
                Rail other = (Rail) obj;
                return Objects.equals(this.material, other.material) &&
                        Objects.equals(this.type, other.type) &&
                        this.length == other.length &&
                        this.weight == other.weight;
            }
            return false;
        }


}
