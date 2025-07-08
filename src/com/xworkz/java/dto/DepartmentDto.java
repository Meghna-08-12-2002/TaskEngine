package com.xworkz.java.dto;

import java.util.Objects;

public class DepartmentDto {
    private int departmentId;
    private String location;

    public DepartmentDto(int departmentId, String location) {
        this.departmentId = departmentId;
        this.location = location;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null) {
            if (o instanceof DepartmentDto) {
                DepartmentDto casted = (DepartmentDto) o;
                return this.departmentId == casted.departmentId;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId);
    }
}
