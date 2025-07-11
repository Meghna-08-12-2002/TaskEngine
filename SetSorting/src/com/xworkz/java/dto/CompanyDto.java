package com.xworkz.java.dto;

import java.util.Objects;

public class CompanyDto {
    public String name;
    public String domain;
    public int foundedYear;
    public CEODto ceo;

    public CompanyDto(String name, String domain, int foundedYear, CEODto ceo) {
        this.name = name;
        this.domain = domain;
        this.foundedYear = foundedYear;
        this.ceo = ceo;
    }

    @Override
    public String toString() {
        return "CompanyDto{" +
                "name='" + name + '\'' +
                ", domain='" + domain + '\'' +
                ", foundedYear=" + foundedYear +
                ", ceo=" + ceo +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }

    public CEODto getCeo() {
        return ceo;
    }

    public void setCeo(CEODto ceo) {
        this.ceo = ceo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CompanyDto) {
            CompanyDto other = (CompanyDto) obj;
            return this.domain.equals(other.domain);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
