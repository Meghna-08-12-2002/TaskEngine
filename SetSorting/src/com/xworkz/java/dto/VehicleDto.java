package com.xworkz.java.dto;

import java.util.Objects;

public class VehicleDto {
    public String type;
    public String fuel;
    public String registration;
    public CompanyDto company;

    public VehicleDto(String type, String fuel, String registration, CompanyDto company) {
        this.type = type;
        this.fuel = fuel;
        this.registration = registration;
        this.company = company;
    }

    @Override
    public String toString() {
        return "VehicleDto{" +
                "type='" + type + '\'' +
                ", fuel='" + fuel + '\'' +
                ", registration='" + registration + '\'' +
                ", company=" + company +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public CompanyDto getCompany() {
        return company;
    }

    public void setCompany(CompanyDto company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VehicleDto) {
             VehicleDto  other = (VehicleDto) obj;
            return this.fuel.equals(other.fuel);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
