package com.xworkz.equals.internal;

import java.util.Objects;

public class Gate
{

        private String material;
        private String color;
        private String type;
        private double height;

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        @Override
        public String toString() {
            return "Gate{" +
                    "material='" + material + '\'' +
                    ", color='" + color + '\'' +
                    ", type='" + type + '\'' +
                    ", height=" + height +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Gate) {
                Gate other = (Gate) obj;
                return Objects.equals(this.material, other.material) &&
                        Objects.equals(this.color, other.color) &&
                        Objects.equals(this.type, other.type) &&
                        this.height == other.height;
            }
            return false;
        }


}
