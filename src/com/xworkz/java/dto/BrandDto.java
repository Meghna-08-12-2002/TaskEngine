package com.xworkz.java.dto;

public class BrandDto {
    private String name;
    private String country;
    private String ceo;
    private int foundedYear;

    public BrandDto(String name, String country, String ceo, int foundedYear) {
        this.name = name;
        this.country = country;
        this.ceo = ceo;
        this.foundedYear = foundedYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }
}
