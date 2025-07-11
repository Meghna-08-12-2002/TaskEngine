package com.xworkz.java.dto;

import java.time.LocalDate;
import java.util.Objects;

public class PassportDto {
    public String passportNumber;
    public String nationality;
    public LocalDate issueDate;
    public CountryDto country;

    @Override
    public String toString() {
        return "PassportDto{" +
                "passportNumber='" + passportNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                ", issueDate=" + issueDate +
                ", country=" + country +
                '}';
    }

    public PassportDto(String passportNumber, String nationality, LocalDate issueDate, CountryDto country) {
        this.passportNumber = passportNumber;
        this.nationality = nationality;
        this.issueDate = issueDate;
        this.country= country ;

    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public CountryDto getCountry() {
        return country;
    }

    public void setCountry(CountryDto country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PassportDto ) {
           PassportDto other = (PassportDto) obj;
            return this.nationality.equals(other.nationality);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }
}
