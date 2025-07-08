package com.xworks.encapsulation.internal1;

public class KeyChain {

        private String material = "Metal";
        private int length = 10;
        private String shape = "Round";
        private boolean isCustom = true;
        private String brand = "KeyMaster";

        public KeyChain() {
            System.out.println("running inside KeyChain");
        }

        void setMaterial(String material) {
            this.material = material;
        }

        void setLength(int length) {
            this.length = length;
        }

        void setShape(String shape) {
            this.shape = shape;
        }

        void setCustom(boolean isCustom) {
            this.isCustom = isCustom;
        }

        void setBrand(String brand) {
            this.brand = brand;
        }

        public String getMaterial() {
            return material;
        }

        public int getLength() {
            return length;
        }

        public String getShape() {
            return shape;
        }

        public boolean isCustom() {
            return isCustom;
        }

        public String getBrand() {
            return brand;
        }
    }


