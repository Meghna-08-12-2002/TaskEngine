package com.xworkz.java.dto;

import java.util.Objects;

public class CustomerDto {
    public String name;
    public int age;
    public String email;
    public PassportDto passport;

    @Override
    public String toString() {
        return "CustomerDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", passport=" + passport +
                '}';
    }

    public CustomerDto(String name, int age, String email, PassportDto passport) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PassportDto getPassport() {
        return passport;
    }

    public void setPassport(PassportDto passport) {
        this.passport = passport;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CustomerDto) {
            CustomerDto other = (CustomerDto) obj;
            return this.email.equals(other.email);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
