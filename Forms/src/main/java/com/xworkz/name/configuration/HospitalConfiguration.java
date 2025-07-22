package com.xworkz.name.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.name")
public class HospitalConfiguration {
    public HospitalConfiguration(){
        System.out.println("running in HospitalConfiguration");
    }
}
