package com.xworkz.java.dto;

import java.util.IdentityHashMap;
import java.util.Objects;

public class DetailDto {
    public String id;
    public String description;
    public String status;
    public EducationDto education;

    public DetailDto(String id, String description, String status, EducationDto education) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.education = education;
    }

    @Override
    public String toString() {
        return "DetailDto{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", education=" + education +
                '}';
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EducationDto getEducation() {
        return education;
    }

    public void setEducation(EducationDto education) {
        this.education = education;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DetailDto) {
            DetailDto other = (DetailDto) obj;
            return this.description.equals(other.description);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
