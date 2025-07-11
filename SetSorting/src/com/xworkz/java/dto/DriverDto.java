package com.xworkz.java.dto;

import java.util.Objects;

public class DriverDto {
    public String name;
    public int age;
    public String licenseNumber;
    public VehicleDto vehicle;
    public DriverDto(String name, int age, String licenseNumber, VehicleDto vehicle) {
        this.name = name;
        this.age = age;
        this.licenseNumber = licenseNumber;
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "DriverDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", vehicle=" + vehicle +
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

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public VehicleDto getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleDto vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DriverDto ) {
            DriverDto other = (DriverDto) obj;
            return this.licenseNumber.equals(other.licenseNumber);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
