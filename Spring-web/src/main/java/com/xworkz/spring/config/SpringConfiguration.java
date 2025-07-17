package com.xworkz.spring.config;

import com.xworkz.spring.component.Developer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.spring.component")
public class SpringConfiguration {

    public SpringConfiguration() {
        System.out.println("SpringConfiguration constructor");
    }

    @Bean
    public String getName() {
        System.out.println("getName String1 method");
        return "Meghna";
    }

    @Bean
    public String getCollegeName() {
        System.out.println("getCollegeName String2 method");
        return "PES University";
    }

    @Bean
    public String getProgramLang() {
        System.out.println("getProgramLang String3 method");
        return "Python";
    }

    @Bean
    public String getCatName() {
        System.out.println("getCatName String4 method");
        return "Simba";
    }

    @Bean
    public String getTreeName() {
        System.out.println("getTreeName String5 method");
        return "Banyan tree";
    }

    @Bean
    public Developer getDeveloper1() {
        System.out.println("Developer1 method");
        return new Developer("Ravi", 24);
    }

    @Bean
    public Developer getDeveloper2() {
        System.out.println("Developer2 method");
        return new Developer("Neha", 22);
    }

    @Bean
    public Developer getDeveloper3() {
        System.out.println("Developer3 method");
        return new Developer("Arjun", 25);
    }

    @Bean
    public Developer getDeveloper4() {
        System.out.println("Developer4 method");
        return new Developer("Divya", 23);
    }

    @Bean
    public Developer getDeveloper5() {
        System.out.println("Developer5 method");
        return new Developer("Karthik", 26);
    }

    @Bean
    public Byte byte1() {
        System.out.println("Byte1 method");
        return 30;
    }

    @Bean
    public Byte byte2() {
        System.out.println("Byte2 method");
        return 40;
    }

    @Bean
    public Short short1() {
        System.out.println("Short1 method");
        return 300;
    }

    @Bean
    public Short short2() {
        System.out.println("Short2 method");
        return 400;
    }

    @Bean
    public Integer int1() {
        System.out.println("integer1 method");
        return 3000;
    }

    @Bean
    public Integer int2() {
        System.out.println("integer2 method");
        return 4000;
    }

    @Bean
    public Long long1() {
        System.out.println("Long1 method");
        return 30000L;
    }

    @Bean
    public Long long2() {
        System.out.println("Long2 method");
        return 40000L;
    }

    @Bean
    public Float float1() {
        System.out.println("Float1 method");
        return 3.3f;
    }

    @Bean
    public Float float2() {
        System.out.println("float2 method");
        return 4.4f;
    }

    @Bean
    public Double double1() {
        System.out.println("double1 method");
        return 5.5;
    }

    @Bean
    public Double double2() {
        System.out.println("double2 method");
        return 6.6;
    }

    @Bean
    public Character char1() {
        System.out.println("character1 method");
        return 'X';
    }

    @Bean
    public Character char2() {
        System.out.println("Character2 method");
        return 'Y';
    }

    @Bean
    public Boolean boolean1() {
        System.out.println("Boolean1 method");
        return false;
    }

    @Bean
    public Boolean boolean2() {
        System.out.println("Boolean2 method");
        return true;
    }
}
