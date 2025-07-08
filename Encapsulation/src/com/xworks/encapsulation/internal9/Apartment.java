package com.xworks.encapsulation.internal9;

public class Apartment {

        private String buildingName = "Green Heights";
        private int flatNumber = 202;
        private double area = 980.5;
        private boolean hasBalcony = true;
        private String city = "Bangalore";

        public Apartment() {
            System.out.println("running inside Apartment");
        }

        void setBuildingName(String buildingName) {
            this.buildingName = buildingName;
        }

        void setFlatNumber(int flatNumber) {
            this.flatNumber = flatNumber;
        }

        void setArea(double area) {
            this.area = area;
        }

        void setHasBalcony(boolean hasBalcony) {
            this.hasBalcony = hasBalcony;
        }

        void setCity(String city) {
            this.city = city;
        }

        public String getBuildingName() {
            return buildingName;
        }

        public int getFlatNumber() {
            return flatNumber;
        }

        public double getArea() {
            return area;
        }

        public boolean isHasBalcony() {
            return hasBalcony;
        }

        public String getCity() {
            return city;
        }
    }


