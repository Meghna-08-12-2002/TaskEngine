package com.xworkz.java.dto;

import java.util.Objects;

public class UniversityDto {
    private String name;
    private String location;
    private int establishedYear;
    private int worldRanking;

    public UniversityDto(String name, String location, int establishedYear, int worldRanking) {
        this.name = name;
        this.location = location;
        this.establishedYear = establishedYear;
        this.worldRanking = worldRanking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public int getWorldRanking() {
        return worldRanking;
    }

    public void setWorldRanking(int worldRanking) {
        this.worldRanking = worldRanking;
    }

    @Override
    public boolean equals(Object o) {
        if (o !=null)
        {
            if (o instanceof UniversityDto)
            {
                UniversityDto casted=(UniversityDto) o;
                return this.name.equals(casted.name);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
