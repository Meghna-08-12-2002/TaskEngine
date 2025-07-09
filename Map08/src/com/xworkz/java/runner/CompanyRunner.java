package com.xworkz.java.runner;

import com.xworkz.java.dto.CompanyDto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyRunner {
    public static void main(String[] args) {
        CompanyDto company1 = new CompanyDto(201, "Bangalore");
        CompanyDto company2 = new CompanyDto(202, "Hyderabad");
        CompanyDto company3 = new CompanyDto(203, "Pune");
        CompanyDto company4 = new CompanyDto(204, "Chennai");
        CompanyDto company5 = new CompanyDto(205, "Delhi");
        CompanyDto company6 = new CompanyDto(206, "Mumbai");
        CompanyDto company7 = new CompanyDto(207, "Kolkata");
        CompanyDto company8 = new CompanyDto(208, "Ahmedabad");
        CompanyDto company9 = new CompanyDto(209, "Jaipur");
        CompanyDto company10 = new CompanyDto(210, "Coimbatore");
        CompanyDto company11 = new CompanyDto(211, "Nagpur");
        CompanyDto company12 = new CompanyDto(212, "Lucknow");
        CompanyDto company13 = new CompanyDto(213, "Bhopal");
        CompanyDto company14 = new CompanyDto(214, "Indore");
        CompanyDto company15 = new CompanyDto(215, "Surat");
        CompanyDto company16 = new CompanyDto(216, "Vijayawada");
        CompanyDto company17 = new CompanyDto(217, "Visakhapatnam");
        CompanyDto company18 = new CompanyDto(218, "Patna");
        CompanyDto company19 = new CompanyDto(219, "Chandigarh");
        CompanyDto company20 = new CompanyDto(220, "Mysore");
        CompanyDto company21 = new CompanyDto(221, "Guwahati");
        CompanyDto company22 = new CompanyDto(222, "Trivandrum");
        CompanyDto company23 = new CompanyDto(223, "Nashik");
        CompanyDto company24 = new CompanyDto(224, "Noida");
        CompanyDto company25 = new CompanyDto(225, "Hubli");

        Map<CompanyDto, List<String>> map = new HashMap<>();

        map.put(company1, Arrays.asList("Ravi", "Kiran", "Meena"));
        map.put(company2, Arrays.asList("Divya", "Amit", "Gopi"));
        map.put(company3, Arrays.asList("Suresh", "Kavya", "Rohit"));
        map.put(company4, Arrays.asList("Vinay", "Harsha", "Bhavya"));
        map.put(company5, Arrays.asList("Lakshmi", "Praveen", "Neha"));
        map.put(company6, Arrays.asList("Manoj", "Anjali", "Arun"));
        map.put(company7, Arrays.asList("Nitin", "Sneha", "Karthik"));
        map.put(company8, Arrays.asList("Raj", "Shruti", "Deepak"));
        map.put(company9, Arrays.asList("Komal", "Shiva", "Alok"));
        map.put(company10, Arrays.asList("Teja", "Swapna", "Gaurav"));
        map.put(company11, Arrays.asList("Akshay", "Payal", "Naveen"));
        map.put(company12, Arrays.asList("Ishaan", "Priya", "Sathish"));
        map.put(company13, Arrays.asList("Latha", "Anil", "Monika"));
        map.put(company14, Arrays.asList("Santosh", "Kishore", "Bharathi"));
        map.put(company15, Arrays.asList("Ritika", "Murali", "Keerthi"));
        map.put(company16, Arrays.asList("Pooja", "Arvind", "Lavanya"));
        map.put(company17, Arrays.asList("Deeksha", "Ramesh", "Harini"));
        map.put(company18, Arrays.asList("Kavitha", "Shankar", "Suhas"));
        map.put(company19, Arrays.asList("Zara", "Ali", "Ragini"));
        map.put(company20, Arrays.asList("Shyam", "Mohan", "Diya"));
        map.put(company21, Arrays.asList("Tanvi", "Vishal", "Sonia"));
        map.put(company22, Arrays.asList("Jeevan", "Kalyani", "Babu"));
        map.put(company23, Arrays.asList("Vaishali", "Yogesh", "Rekha"));
        map.put(company24, Arrays.asList("Ajay", "Swathi", "Rajiv"));
        map.put(company25, Arrays.asList("Mahesh", "Bindu", "Rahul"));

        System.out.println("Company Keys:");
        map.keySet().forEach(System.out::println);

        System.out.println("Employee Name Lists:");
        map.values().forEach(System.out::println);
    }

}
