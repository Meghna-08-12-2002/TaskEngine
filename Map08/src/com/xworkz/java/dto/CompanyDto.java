package com.xworkz.java.dto;

import java.util.Objects;

public class CompanyDto {
    private int companyId;
    private String location;

    @Override
    public String toString() {
        return "CompanyDto{" +
                "companyId=" + companyId +
                ", location='" + location + '\'' +
                '}';
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CompanyDto(int companyId, String location) {
        this.companyId = companyId;
        this.location = location;
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            if(obj instanceof CompanyDto)
            {
                CompanyDto casting=(CompanyDto) obj;
                return this.location.equals(casting.location);
            }
        }
        return false;

    }
}
