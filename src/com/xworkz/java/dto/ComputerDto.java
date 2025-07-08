package com.xworkz.java.dto;


import java.util.Objects;

public class ComputerDto {
    private int id;
    private String processor;
    private int ram;
    private boolean hasSSD;

    public ComputerDto(int id, String processor, int ram, boolean hasSSD) {
        this.id = id;
        this.processor = processor;
        this.ram = ram;
        this.hasSSD = hasSSD;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isHasSSD() {
        return hasSSD;
    }

    public void setHasSSD(boolean hasSSD) {
        this.hasSSD = hasSSD;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null) {
            if (o instanceof ComputerDto) {
                ComputerDto casted = (ComputerDto) o;
                return this.id == casted.id;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
