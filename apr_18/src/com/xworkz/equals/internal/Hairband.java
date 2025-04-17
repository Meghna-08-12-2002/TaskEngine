package com.xworkz.equals.internal;

import java.util.Objects;

public class Hairband {

        private String material;
        private String color;
        private double price;
        private String size;

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setSize(String size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return "Hairband{" +
                    "material='" + material + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    ", size='" + size + '\'' +
                    '}';
        }

        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Hairband) {
                Hairband other = (Hairband) obj;
                if (Objects.equals(this.material, other.material) &&
                        Objects.equals(this.color, other.color) &&
                        this.price == other.price &&
                        Objects.equals(this.size, other.size)) {
                    System.out.println("Hairband is matching..");
                    return true;
                }
            }
            return false;
        }


}
