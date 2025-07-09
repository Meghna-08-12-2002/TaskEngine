package com.xworkz.java.dto;

import java.util.Objects;

public class StudentDto {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }@Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            if(obj instanceof StudentDto)
            {
                StudentDto casting=(StudentDto) obj;
                return this.name.equals(casting.name);
            }
        }
        return false;
    }
}
