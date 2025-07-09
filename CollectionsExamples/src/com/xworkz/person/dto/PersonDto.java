package com.xworkz.person.dto;

import java.util.Objects;

public class PersonDto {
        private String name;
        private String email;
        private String aadharNumber;

    @Override
    public String toString() {
        return "PersonDto{name='" + name + "', email='" + email + "', aadharNumber='" + aadharNumber + "'}";

    }

    public PersonDto(String name, String email, String aadharNumber) {
            this.name = name;
            this.email = email;
            this.aadharNumber = aadharNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAadharNumber() {
            return aadharNumber;
        }

        public void setAadharNumber(String aadharNumber) {
            this.aadharNumber = aadharNumber;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PersonDto) {
                PersonDto other = (PersonDto) obj;
                return this.email.equals(other.email);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }


