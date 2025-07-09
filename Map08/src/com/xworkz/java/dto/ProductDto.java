package com.xworkz.java.dto;

import java.util.Objects;

public class ProductDto {
    private String name;
    private String type;
    private double cost;
    private String modelNo;
    private int id;

    @Override
    public String toString() {
        return "ProductDto{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", cost=" + cost +
                ", modelNo=" + modelNo +
                ", id=" + id +
                '}';
    }

    public ProductDto(String name, String type, double cost, String modelNo, int id) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.modelNo = modelNo;
        this.id = id;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            if(obj instanceof ProductDto)
            {
                ProductDto casting=(ProductDto) obj;
                return this.type.equals(casting.type);
            }
        }
        return false;
    }
}
