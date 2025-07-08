package com.xworks.encapsulation.internal7;

public class Garage {

        private String owner = "John";
        private int capacity = 4;
        private boolean hasLift = true;
        private String type = "Underground";
        private double area = 250.5;

        public Garage() {
            System.out.println("running inside Garage");
        }

        void setOwner(String owner) {
            this.owner = owner;
        }

        void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        void setHasLift(boolean hasLift) {
            this.hasLift = hasLift;
        }

        void setType(String type) {
            this.type = type;
        }

        void setArea(double area) {
            this.area = area;
        }

        public String getOwner() {
            return owner;
        }

        public int getCapacity() {
            return capacity;
        }

        public boolean isHasLift() {
            return hasLift;
        }

        public String getType() {
            return type;
        }

        public double getArea() {
            return area;
        }
    }
