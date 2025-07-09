package com.xworkz.java.runner;

import com.xworkz.java.dto.StudentDto;

import java.util.*;

public class StudentRunner {
    public static void main(String[] args) {
        Map<StudentDto, List<String>> studentMap = new HashMap<>();

        studentMap.put(new StudentDto(101, "Arun"), Arrays.asList("Math", "Science", "English"));
        studentMap.put(new StudentDto(102, "Bala"), Arrays.asList("Physics", "Chemistry", "Biology"));
        studentMap.put(new StudentDto(103, "Chitra"), Arrays.asList("Economics", "Business", "Accounts"));
        studentMap.put(new StudentDto(104, "Dinesh"), Arrays.asList("History", "Civics", "Geography"));
        studentMap.put(new StudentDto(105, "Ezhil"), Arrays.asList("Hindi", "English", "Tamil"));
        studentMap.put(new StudentDto(106, "Farook"), Arrays.asList("Python", "Java", "SQL"));
        studentMap.put(new StudentDto(107, "Gokul"), Arrays.asList("C", "C++", "Python"));
        studentMap.put(new StudentDto(108, "Harini"), Arrays.asList("Biotech", "Zoology", "Botany"));
        studentMap.put(new StudentDto(109, "Ilamaran"), Arrays.asList("PE", "Art", "Music"));
        studentMap.put(new StudentDto(110, "Jaya"), Arrays.asList("English", "French", "Spanish"));
        studentMap.put(new StudentDto(111, "Karthik"), Arrays.asList("Electronics", "EEE", "Robotics"));
        studentMap.put(new StudentDto(112, "Lavanya"), Arrays.asList("Accounts", "Finance", "Taxation"));
        studentMap.put(new StudentDto(113, "Mani"), Arrays.asList("Geology", "Astronomy", "Oceanography"));
        studentMap.put(new StudentDto(114, "Nalini"), Arrays.asList("Microbiology", "Genetics", "Immunology"));
        studentMap.put(new StudentDto(115, "Prakash"), Arrays.asList("Networking", "Cloud", "Cybersecurity"));
        studentMap.put(new StudentDto(116, "Quila"), Arrays.asList("Dance", "Drama", "Music"));
        studentMap.put(new StudentDto(117, "Revathi"), Arrays.asList("Environmental", "Climate", "Earth Science"));
        studentMap.put(new StudentDto(118, "Saravanan"), Arrays.asList("Agri", "Soil", "Crop Science"));
        studentMap.put(new StudentDto(119, "Tharani"), Arrays.asList("Design", "UI/UX", "Graphics"));
        studentMap.put(new StudentDto(120, "Uma"), Arrays.asList("Sports", "Yoga", "Meditation"));
        studentMap.put(new StudentDto(121, "Vignesh"), Arrays.asList("Film", "Photography", "Editing"));
        studentMap.put(new StudentDto(122, "Yamini"), Arrays.asList("Public Admin", "Political Science", "IR"));
        studentMap.put(new StudentDto(123, "Zareena"), Arrays.asList("Anthropology", "Sociology", "Psychology"));
        studentMap.put(new StudentDto(124, "Akilan"), Arrays.asList("Architecture", "Civil", "AutoCAD"));
        studentMap.put(new StudentDto(125, "Bhavani"), Arrays.asList("Medical Ethics", "Anatomy", "Pharmacology"));


        Set<Map.Entry<StudentDto, List<String>>> entrySet = studentMap.entrySet();
        entrySet.forEach(e -> {
            StudentDto student = e.getKey();
            List<String> subjects = e.getValue();
            System.out.println(student);
            System.out.println(subjects);
        });
    }
}
