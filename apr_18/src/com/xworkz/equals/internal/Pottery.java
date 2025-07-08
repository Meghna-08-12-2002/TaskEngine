package com.xworkz.equals.internal;

import java.util.Objects;

public class Pottery {
        private String material;
        private String color;
        private double price;
        private String type;

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setType(String type) {
            this.type = type;
        }
        @Override
        public String toString() {
            return "Pottery{" +
                    "material='" + material + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    ", type='" + type + '\'' +
                    '}';
        }


        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Pottery) {
                Pottery other = (Pottery) obj;
                if (Objects.equals(this.material, other.material) &&
                        Objects.equals(this.color, other.color) &&
                        this.price == other.price &&
                        Objects.equals(this.type, other.type)) {
                    System.out.println("Pottery is matching..");
                    return true;
                }
            }
            return false;
        }

}
