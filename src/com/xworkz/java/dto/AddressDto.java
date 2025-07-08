package com.xworkz.java.dto;

public class AddressDto {
    private int no;
    private  String street;
    private String city;
    private int pincode;

    public AddressDto(int no, String street, String city, int pincode) {
        this.no = no;
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
