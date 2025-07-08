package com.xworkz.java.dto;

import java.util.Objects;

public class ProductDto {
    private String name;
    private String type;
    private double price;
    private String modelNo;
    private int id;

    public ProductDto(String name, String type, double price, String modelNo, int id) {
        this.name = name;
        this.type = type;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
    public boolean equals(Object o) {
        if (o!=null)
        {
            if(o instanceof ProductDto)
            {
                ProductDto casted=(ProductDto) o;
                return this.id== casted.id;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
