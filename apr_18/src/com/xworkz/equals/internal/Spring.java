package com.xworkz.equals.internal;

import java.util.Objects;

public class Spring {

        private String type;
        private String material;
        private String usage;
        private double length;

        public Spring(String type, String material, String usage, double length) {
            this.type = type;
            this.material = material;
            this.usage = usage;
            this.length = length;
        }

        @Override
        public String toString() {
            return "Spring{" +
                    "type='" + type + '\'' +
                    ", material='" + material + '\'' +
                    ", usage='" + usage + '\'' +
                    ", length=" + length +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Spring) {
                Spring other = (Spring) obj;
                if (Objects.equals(this.type, other.type) &&
                        Objects.equals(this.material, other.material) &&
                        Objects.equals(this.usage, other.usage) &&
                        this.length == other.length) {
                    System.out.println("Spring is matching...");
                    return true;
                }
            }
            return false;
        }
    }


