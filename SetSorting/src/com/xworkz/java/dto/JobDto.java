package com.xworkz.java.dto;

import java.util.Objects;

public class JobDto {
    public String role;
    public String department;
    public int experience;
    public DetailDto detail;

    public JobDto(String role, String department, int experience, DetailDto detail) {
        this.role = role;
        this.department = department;
        this.experience = experience;
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "JobDto{" +
                "role='" + role + '\'' +
                ", department='" + department + '\'' +
                ", experience=" + experience +
                ", detail=" + detail +
                '}';
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public DetailDto getDetail() {
        return detail;
    }

    public void setDetail(DetailDto detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JobDto) {
          JobDto   other = (JobDto) obj;
            return this.role.equals(other.role);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(department);
    }
}
