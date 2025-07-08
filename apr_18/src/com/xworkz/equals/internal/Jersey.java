package com.xworkz.equals.internal;

import java.util.Objects;

public class Jersey {

        private String teamName;
        private String color;
        private String size;
        private double price;

        public Jersey(String teamName, String color, String size, double price) {
            this.teamName = teamName;
            this.color = color;
            this.size = size;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Jersey{" +
                    "teamName='" + teamName + '\'' +
                    ", color='" + color + '\'' +
                    ", size='" + size + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Jersey) {
                Jersey other = (Jersey) obj;
                if (Objects.equals(this.teamName, other.teamName) &&
                        Objects.equals(this.color, other.color) &&
                        Objects.equals(this.size, other.size) &&
                        this.price == other.price) {
                    System.out.println("Jersey is matching...");
                    return true;
                }
            }
            return false;
        }
    }

