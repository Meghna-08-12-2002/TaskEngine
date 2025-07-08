package com.xworks.encapsulation.internal3;

public class Badge {

        private String color = "Blue";
        private int number = 101;
        private String rank = "Captain";
        private boolean valid = true;
        private String issueAuthority = "Defense Dept";

        public Badge() {
            System.out.println("running inside Badge");
        }

        void setColor(String color) {
            this.color = color;
        }

        void setNumber(int number) {
            this.number = number;
        }

        void setRank(String rank) {
            this.rank = rank;
        }

        void setValid(boolean valid) {
            this.valid = valid;
        }

        void setIssueAuthority(String issueAuthority) {
            this.issueAuthority = issueAuthority;
        }

        public String getColor() {
            return color;
        }

        public int getNumber() {
            return number;
        }

        public String getRank() {
            return rank;
        }

        public boolean isValid() {
            return valid;
        }

        public String getIssueAuthority() {
            return issueAuthority;
        }
    }


