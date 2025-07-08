package com.xworkz.equals.internal;

import java.util.Objects;

public class Lock {

        private String type;
        private String material;
        private int securityLevel;
        private double price;

        public void setType(String type) {
            this.type = type;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setSecurityLevel(int securityLevel) {
            this.securityLevel = securityLevel;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Lock{" +
                    "type='" + type + '\'' +
                    ", material='" + material + '\'' +
                    ", securityLevel=" + securityLevel +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Lock) {
                Lock other = (Lock) obj;
                return Objects.equals(this.type, other.type) &&
                        Objects.equals(this.material, other.material) &&
                        this.securityLevel == other.securityLevel &&
                        this.price == other.price;
            }
            return false;
        }


}
