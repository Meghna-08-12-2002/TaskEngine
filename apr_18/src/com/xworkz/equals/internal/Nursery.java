package com.xworkz.equals.internal;

import java.util.Objects;

public class Nursery
{
        private String name;
        private String location;
        private int plantsAvailable;
        private double area;

        public void setName(String name) {
            this.name = name;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public void setPlantsAvailable(int plantsAvailable) {
            this.plantsAvailable = plantsAvailable;
        }

        public void setArea(double area) {
            this.area = area;
        }

        @Override
        public String toString() {
            return "Nursery{" +
                    "name='" + name + '\'' +
                    ", location='" + location + '\'' +
                    ", plantsAvailable=" + plantsAvailable +
                    ", area=" + area +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Nursery) {
                Nursery other = (Nursery) obj;
                return Objects.equals(this.name, other.name) &&
                        Objects.equals(this.location, other.location) &&
                        this.plantsAvailable == other.plantsAvailable &&
                        this.area == other.area;
            }
            return false;
        }



}
