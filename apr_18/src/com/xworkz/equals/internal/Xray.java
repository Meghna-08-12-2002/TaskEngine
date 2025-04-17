package com.xworkz.equals.internal;

import java.util.Objects;

public class Xray {
        private String bodyPart;
        private String hospital;
        private String doctor;
        private double cost;

        public Xray(String bodyPart, String hospital, String doctor, double cost) {
            this.bodyPart = bodyPart;
            this.hospital = hospital;
            this.doctor = doctor;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Xray{bodyPart='" + bodyPart + "', hospital='" + hospital + "', doctor='" + doctor + "', cost=" + cost + "}";
        }

        @Override
        public boolean equals(Object Xray) {
            if (Xray!= null && Xray instanceof Xray) {
                Xray other = (Xray) Xray;
                if (Objects.equals(this.bodyPart, other.bodyPart)
                        && Objects.equals(this.hospital, other.hospital)
                        && Objects.equals(this.doctor, other.doctor)
                        && this.cost == other.cost) {
                    System.out.println("Xray is matching..");
                    return true;
                }
            }
            return false;
        }
    }


