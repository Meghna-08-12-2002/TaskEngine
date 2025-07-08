package com.xworkz.java.dto;

import com.xworkz.java.constant.Type;
import com.xworkz.java.constant.Version;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
public class ApplicationDto {
    private String appName;
    private Type type;
    private double size;
    private LocalDate manufactureDate;
    private List<OwnerDto> owner;
    private Version version;
    private boolean free;
    private double chargePerUser;
}
