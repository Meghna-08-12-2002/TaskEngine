package com.xworkz.java.dto;

import java.util.Objects;

public class PresidentDto {
    public String name;
    public int age;
    public String party;
    public DriverDto driver;

    public PresidentDto(String name, int age, String party, DriverDto driver) {
        this.name = name;
        this.age = age;
        this.party = party;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "PresidentDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", party='" + party + '\'' +
                ", driver=" + driver +
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

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public DriverDto getDriver() {
        return driver;
    }

    public void setDriver(DriverDto driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PresidentDto) {
             PresidentDto other = (PresidentDto) obj;
            return this.party.equals(other.party);
        }
        return false;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
