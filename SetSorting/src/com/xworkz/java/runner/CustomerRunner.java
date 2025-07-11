package com.xworkz.java.runner;

import com.xworkz.java.dto.CustomerDto;
import com.xworkz.java.dto.JobDto;
import com.xworkz.java.list.CustomerList;

import java.util.Comparator;
import java.util.List;

public class CustomerRunner {
    public static void main(String[] args) {

        CustomerList customerListObj = new CustomerList();
        List<CustomerDto> customerList = customerListObj.getCustomerList();

        System.out.println("===========================================");
        System.out.println("Sort the collection by Customer name in DESC order:");
        customerList.stream()
                .sorted(Comparator.comparing(CustomerDto::getName).reversed())
                .forEach(customer -> System.out.println(customer.getName()));

        System.out.println("===========================================");
        System.out.println("Find customers with job role 'Backend Developer':");
        customerList.stream()
                .filter(customer -> {
                    JobDto job = customer.getPassport()
                            .getCountry()
                            .getPresident()
                            .getDriver()
                            .getVehicle()
                            .getCompany()
                            .getCeo()
                            .getHouse()
                            .getSecurity()
                            .getJob();
                    return "Backend Developer".equalsIgnoreCase(job.getRole());
                })
                .forEach(customer -> System.out.println(customer.getName()));

        System.out.println("===========================================");
        System.out.println("Sort by Country name in DESC order:");
        customerList.stream()
                .map(customer -> customer.getPassport().getCountry().getName())
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("===========================================");
        System.out.println("Sort by Education qualification in ASC order:");
        customerList.stream()
                .map(customer -> customer.getPassport()
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
                        .getQualification())
                .sorted()
                .forEach(System.out::println);

        System.out.println("============================================");
        System.out.println("Collect all unique Country names:");
        customerList.stream()
                .map(customer -> customer.getPassport().getCountry().getName())
                .distinct()
                .forEach(System.out::println);
    }
}
