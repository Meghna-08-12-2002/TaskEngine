package com.xworkz.equals.internal;

import java.util.Objects;

public class ICEcream {

        private String flavor;
        private String brand;
        private String type;
        private double cost;

        public void setFlavor(String flavor) {
            this.flavor = flavor;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "ICEcream{" +
                    "flavor='" + flavor + '\'' +
                    ", brand='" + brand + '\'' +
                    ", type='" + type + '\'' +
                    ", cost=" + cost +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ICEcream) {
                ICEcream other = (ICEcream) obj;
                return Objects.equals(this.flavor, other.flavor) &&
                        Objects.equals(this.brand, other.brand) &&
                        Objects.equals(this.type, other.type) &&
                        this.cost == other.cost;
            }
            return false;

    }

}
