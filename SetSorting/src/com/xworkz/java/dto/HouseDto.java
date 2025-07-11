package com.xworkz.java.dto;

import java.util.Objects;

public class HouseDto {
    public String houseNumber;
    public String color;
    public int floors;
    public SecurityDto security;

    public HouseDto(String houseNumber, String color, int floors, SecurityDto security) {
        this.houseNumber = houseNumber;
        this.color = color;
        this.floors = floors;
        this.security = security;
    }

    @Override
    public String toString() {
        return "HouseDto{" +
                "houseNumber='" + houseNumber + '\'' +
                ", color='" + color + '\'' +
                ", floors=" + floors +
                ", security=" + security +
                '}';
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public SecurityDto getSecurity() {
        return security;
    }

    public void setSecurity(SecurityDto security) {
        this.security = security;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HouseDto) {
           HouseDto  other = (HouseDto) obj;
            return this.color.equals(other.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseNumber);
    }
}
