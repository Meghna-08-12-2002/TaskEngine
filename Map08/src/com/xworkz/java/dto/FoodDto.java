package com.xworkz.java.dto;

import java.util.Objects;

public class FoodDto {
    private String name;
    private String type;

    public FoodDto(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "FooodDto{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            if(obj instanceof FoodDto)
            {
                FoodDto casting=(FoodDto) obj;
                return this.type.equals(casting.type);
            }
        }
        return false;
    }
}
