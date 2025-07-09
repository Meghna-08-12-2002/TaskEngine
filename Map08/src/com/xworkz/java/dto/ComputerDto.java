package com.xworkz.java.dto;

import java.util.Objects;

public class ComputerDto {
    String processor;
    String os;
    int ram;
    String serialNumber;

    @Override
    public String toString() {
        return "ComputerDto{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", os='" + os + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    public ComputerDto(String processor, int ram, String os, String serialNumber) {
        this.processor = processor;
        this.ram = ram;
        this.os = os;
        this.serialNumber = serialNumber;
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

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    @Override
    public int hashCode() {
        return Objects.hash(processor);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            if(obj instanceof ComputerDto)
            {
                ComputerDto casting=(ComputerDto) obj;
                return this.os.equals(casting.os);
            }
        }
        return false;
    }
}
