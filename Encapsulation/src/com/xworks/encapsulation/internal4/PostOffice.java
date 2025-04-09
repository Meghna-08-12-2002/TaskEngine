package com.xworks.encapsulation.internal4;

public class PostOffice {

        private String location = "Main Street";
        private int pinCode = 560001;
        private String headOfficer = "Mr. Kumar";
        private boolean is24Hours = false;
        private int staffCount = 15;

        public PostOffice() {
            System.out.println("running inside PostOffice");
        }

        void setLocation(String location) {
            this.location = location;
        }

        void setPinCode(int pinCode) {
            this.pinCode = pinCode;
        }

        void setHeadOfficer(String headOfficer) {
            this.headOfficer = headOfficer;
        }

        void setIs24Hours(boolean is24Hours) {
            this.is24Hours = is24Hours;
        }

        void setStaffCount(int staffCount) {
            this.staffCount = staffCount;
        }

        public String getLocation() {
            return location;
        }

        public int getPinCode() {
            return pinCode;
        }

        public String getHeadOfficer() {
            return headOfficer;
        }

        public boolean getIs24Hours() {
            return is24Hours;
        }

        public int getStaffCount() {
            return staffCount;
        }
    }

