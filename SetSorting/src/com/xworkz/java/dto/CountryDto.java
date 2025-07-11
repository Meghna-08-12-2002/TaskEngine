package com.xworkz.java.dto;


import java.util.Objects;

public class CountryDto {
    public String name;
    public String capital;
    public long population;
    public PresidentDto president;

    public CountryDto(String name, String capital, long population, PresidentDto president) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.president = president;
    }

    @Override
    public String toString() {
        return "CountryDto{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", president=" + president +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public PresidentDto getPresident() {
        return president;
    }

    public void setPresident(PresidentDto president) {
        this.president = president;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CountryDto) {
            CountryDto other = (CountryDto) obj;
            return this.capital.equals(other.capital);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
