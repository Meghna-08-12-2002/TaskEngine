package com.xworkz.java.dto;
import lombok.*;

@Data
@AllArgsConstructor
public class HandwashDto {
    private String date;
    private int count;
    private boolean soapUsed;
    private String location;
    private int duration;
    private String remarks;
}
