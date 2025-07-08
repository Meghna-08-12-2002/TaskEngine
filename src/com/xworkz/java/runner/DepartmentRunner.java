package com.xworkz.java.runner;

import com.xworkz.java.dto.DepartmentDto;

import java.util.HashMap;
import java.util.Map;

public class DepartmentRunner {
    public static void main(String[] args) {

        DepartmentDto d1 = new DepartmentDto(101,"Bangalore");
        DepartmentDto d2 = new DepartmentDto(102, "Mysuru");
        DepartmentDto d3 = new DepartmentDto(103, "Mangaluru");
        DepartmentDto d4 = new DepartmentDto(104, "Udupi");
        DepartmentDto d5 = new DepartmentDto(105, "Hubballi");
        DepartmentDto d6 = new DepartmentDto(106, "Dharwad");
        DepartmentDto d7 = new DepartmentDto(107, "Belagavi");
        DepartmentDto d8 = new DepartmentDto(108, "Ballari");
        DepartmentDto d9 = new DepartmentDto(109, "Davangere");
        DepartmentDto d10 = new DepartmentDto(110, "Shivamogga");
        DepartmentDto d11 = new DepartmentDto(111, "Tumakuru");
        DepartmentDto d12 = new DepartmentDto(112, "Chikkamagaluru");
        DepartmentDto d13 = new DepartmentDto(113, "Kodagu");
        DepartmentDto d14 = new DepartmentDto(114, "Chitradurga");
        DepartmentDto d15 = new DepartmentDto(115, "Hassan");
        DepartmentDto d16 = new DepartmentDto(116, "Kolar");
        DepartmentDto d17 = new DepartmentDto(117, "Mandya");
        DepartmentDto d18 = new DepartmentDto(118, "Raichur");
        DepartmentDto d19 = new DepartmentDto(119, "Bidar");
        DepartmentDto d20 = new DepartmentDto(120, "Bagalkot");
        DepartmentDto d21 = new DepartmentDto(121, "Gadag");
        DepartmentDto d22 = new DepartmentDto(122, "Haveri");
        DepartmentDto d23 = new DepartmentDto(123, "Chamarajanagar");
        DepartmentDto d24 = new DepartmentDto(124, "Ramanagara");
        DepartmentDto d25 = new DepartmentDto(125, "Yadgir");

        Map<DepartmentDto, String> departmentMap = new HashMap<>();
        departmentMap.put(d1, "Ramya");
        departmentMap.put(d2, "Shalini");
        departmentMap.put(d3, "Akash");
        departmentMap.put(d4, "Akil");
        departmentMap.put(d5, "Sneha");
        departmentMap.put(d6, "Aarav");
        departmentMap.put(d7, "Kiran");
        departmentMap.put(d8, "Lakshmi");
        departmentMap.put(d9, "Deepak");
        departmentMap.put(d10, "Kavya");
        departmentMap.put(d11, "Harsha");
        departmentMap.put(d12, "Reena");
        departmentMap.put(d13, "Arjun");
        departmentMap.put(d14, "Sana");
        departmentMap.put(d15, "Nithin");
        departmentMap.put(d16, "Priya");
        departmentMap.put(d17, "Rahul");
        departmentMap.put(d18, "Divya");
        departmentMap.put(d19, "Meena");
        departmentMap.put(d20, "Varun");
        departmentMap.put(d21, "Simran");
        departmentMap.put(d22, "Bhavya");
        departmentMap.put(d23, "Ravi");
        departmentMap.put(d24, "Neha");
        departmentMap.put(d25, "Amit");

        System.out.println("Keys:");
        departmentMap.keySet().forEach(System.out::println);

        System.out.println("\nValues:");
        departmentMap.values().forEach(System.out::println);
    }
}
