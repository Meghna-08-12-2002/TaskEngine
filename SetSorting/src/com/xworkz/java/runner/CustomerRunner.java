package com.xworkz.java.runner;

import com.xworkz.java.dto.CustomerDto;
import com.xworkz.java.dto.JobDto;
import com.xworkz.java.list.CustomerList;

import java.util.*;

public class CustomerRunner {
    public static void main(String[] args) {
        List<CustomerDto> customers = new CustomerList().getCustomerList();

        System.out.println("===========================================");
        System.out.println("Sort customers by name (DESC):");
        List<String> names = new ArrayList<>();
        for (CustomerDto c : customers) {
            names.add(c.getName());
        }
        Collections.sort(names, Collections.reverseOrder());
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("===========================================");
        System.out.println("Customers with job role 'Backend Developer':");
        for (CustomerDto c : customers) {
            JobDto job = c.getPassport()
                    .getCountry()
                    .getPresident()
                    .getDriver()
                    .getVehicle()
                    .getCompany()
                    .getCeo()
                    .getHouse()
                    .getSecurity()
                    .getJob();
            if ("Backend Developer".equalsIgnoreCase(job.getRole())) {
                System.out.println(c.getName());
            }
        }

        System.out.println("===========================================");
        System.out.println("Sort by country name (DESC):");
        Set<String> countrySet = new HashSet<>();
        for (CustomerDto c : customers) {
            countrySet.add(c.getPassport().getCountry().getName());
        }
        List<String> sortedCountries = new ArrayList<>(countrySet);
        Collections.sort(sortedCountries, Collections.reverseOrder());
        for (String country : sortedCountries) {
            System.out.println(country);
        }

        System.out.println("===========================================");
        System.out.println("Sort by education qualification (ASC):");
        Set<String> qualificationSet = new HashSet<>();
        for (CustomerDto c : customers) {
            String qualification = c.getPassport()
                    .getCountry()
                    .getPresident()
                    .getDriver()
                    .getVehicle()
                    .getCompany()
                    .getCeo()
                    .getHouse()
                    .getSecurity()
                    .getJob()
                    .getDetail()
                    .getEducation()
                    .getQualification();
            qualificationSet.add(qualification);
        }
        List<String> sortedQualifications = new ArrayList<>(qualificationSet);
        Collections.sort(sortedQualifications);
        for (String q : sortedQualifications) {
            System.out.println(q);
        }

        System.out.println("===========================================");
        System.out.println("All unique country names:");
        Set<String> uniqueCountries = new HashSet<>();
        for (CustomerDto c : customers) {
            uniqueCountries.add(c.getPassport().getCountry().getName());
        }
        for (String country : uniqueCountries) {
            System.out.println(country);
        }
    }
}
