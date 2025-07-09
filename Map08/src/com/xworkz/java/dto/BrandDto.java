package com.xworkz.java.dto;

public class BrandDto {
    String name;
    String country;
    int establishedYear;
    String ceo;

    @Override
    public String toString() {
        return "BrandDto{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", establishedYear=" + establishedYear +
                ", ceo='" + ceo + '\'' +
                '}';
    }

    public BrandDto(String name, String country, int establishedYear, String ceo) {
        this.name = name;
        this.country = country;
        this.establishedYear = establishedYear;
        this.ceo = ceo;
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

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }
}
