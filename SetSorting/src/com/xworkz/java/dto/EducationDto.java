package com.xworkz.java.dto;

import java.util.Objects;

public class EducationDto {
    public String qualification;
    public String university;
    public int year;
    public double percentage;

    public EducationDto(String qualification, String university, int year, double percentage) {
        this.qualification = qualification;
        this.university = university;
        this.year = year;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "EducationDto{" +
                "qualification='" + qualification + '\'' +
                ", university='" + university + '\'' +
                ", year=" + year +
                ", percentage=" + percentage +
                '}';
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EducationDto) {
             EducationDto other = (EducationDto) obj;
            return this.qualification.equals(other.qualification);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(university);
    }
}
