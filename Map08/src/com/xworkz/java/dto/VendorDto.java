package com.xworkz.java.dto;

import java.time.LocalDate;

public class VendorDto {
    private String name;
    private  String gstNo;
    private LocalDate establishedDate;

    @Override
    public String toString() {
        return "VendorDto{" +
                "name='" + name + '\'' +
                ", gstNo=" + gstNo +
                ", establishedDate='" + establishedDate + '\'' +
                '}';
    }

    public VendorDto(String name, String gstNo, LocalDate establishedDate) {
        this.name = name;
        this.gstNo = gstNo;
        this.establishedDate = establishedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGstNo() {
        return gstNo;
    }

    public void setGstNo(String gstNo) {
        this.gstNo = gstNo;
    }

    public LocalDate getEstablishedDate() {
        return establishedDate;
    }

    public void setEstablishedDate(LocalDate establishedDate) {
        this.establishedDate = establishedDate;
    }
}
