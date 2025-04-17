package com.xworkz.equals.internal;

import java.util.Objects;

public class Resistor {

        private String material;
        private int resistance;
        private String tolerance;
        private double power;

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setResistance(int resistance) {
            this.resistance = resistance;
        }

        public void setTolerance(String tolerance) {
            this.tolerance = tolerance;
        }

        public void setPower(double power) {
            this.power = power;
        }

        @Override
        public String toString() {
            return "Resistor{" +
                    "material='" + material + '\'' +
                    ", resistance=" + resistance +
                    ", tolerance='" + tolerance + '\'' +
                    ", power=" + power +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Resistor) {
                Resistor other = (Resistor) obj;
                return Objects.equals(this.material, other.material) &&
                        this.resistance == other.resistance &&
                        Objects.equals(this.tolerance, other.tolerance) &&
                        this.power == other.power;
            }
            return false;

    }

}
