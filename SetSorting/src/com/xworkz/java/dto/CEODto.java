package com.xworkz.java.dto;

import java.util.Objects;

public class CEODto {
    public String name;
    public int age;
    public String email;
    public HouseDto house;

    public CEODto(String name, int age, String email, HouseDto house) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.house = house;
    }

    @Override
    public String toString() {
        return "CEODto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", house=" + house +
                '}';
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

    public HouseDto getHouse() {
        return house;
    }

    public void setHouse(HouseDto house) {
        this.house = house;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CEODto) {
            CEODto other = (CEODto) obj;
            return this.email.equals(other.email);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

