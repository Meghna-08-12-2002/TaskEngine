package com.xworks.encapsulation.internal8;

public class Gym {

        private String name = "FitZone";
        private int members = 150;
        private boolean hasTrainer = true;
        private double monthlyFee = 1200.0;
        private String location = "Chennai";

        public Gym() {
            System.out.println("running inside Gym");
        }

        void setName(String name) {
            this.name = name;
        }

        void setMembers(int members) {
            this.members = members;
        }

        void setHasTrainer(boolean hasTrainer) {
            this.hasTrainer = hasTrainer;
        }

        void setMonthlyFee(double monthlyFee) {
            this.monthlyFee = monthlyFee;
        }

        void setLocation(String location) {
            this.location = location;
        }

        public String getName() {
            return name;
        }

        public int getMembers() {
            return members;
        }

        public boolean isHasTrainer() {
            return hasTrainer;
        }

        public double getMonthlyFee() {
            return monthlyFee;
        }

        public String getLocation() {
            return location;
        }
    }

