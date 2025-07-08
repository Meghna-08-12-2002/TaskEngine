package com.xworkz.java.dto;

import java.util.Objects;

public class ProjectDto {
    private int projectId;
    private String projectName;

    public ProjectDto(int projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public boolean equals(Object o) {
        if (o !=null)
        {
            if (o instanceof ProjectDto)
            {
                ProjectDto casted=(ProjectDto) o;
                return this.projectId == casted.projectId;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId);
    }
}
