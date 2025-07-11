package com.xworkz.java.dto;

import java.util.Objects;

public class SecurityDto {
    public String id;
    public String level;
    public boolean active;
    public JobDto job;

    public SecurityDto(String id, String level, boolean active, JobDto job) {
        this.id = id;
        this.level = level;
        this.active = active;
        this.job = job;
    }

    @Override
    public String toString() {
        return "SecurityDto{" +
                "id='" + id + '\'' +
                ", level='" + level + '\'' +
                ", active=" + active +
                ", job=" + job +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public JobDto getJob() {
        return job;
    }

    public void setJob(JobDto job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SecurityDto) {
            SecurityDto   other = (SecurityDto) obj;
            return this.level.equals(other.level);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
