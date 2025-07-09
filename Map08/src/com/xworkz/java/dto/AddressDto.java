package com.xworkz.java.dto;

public class AddressDto {
    private int id;
    private String street;
    private String city;
    private double pincode;

    @Override
    public String toString() {
        return "AddressDto{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public AddressDto(int id, String street, String city, double pincode) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPincode() {
        return pincode;
    }

    public void setPincode(double pincode) {
        this.pincode = pincode;
    }

}
