package com.xworkz.java.list;

import com.xworkz.java.dto.DetailDto;
import com.xworkz.java.dto.JobDto;

import java.util.LinkedList;
import java.util.List;

public class JobList {
    public List<JobDto> getJobList() {
        System.out.println("getJobList method in JobDTOList");

        List<JobDto> list = new LinkedList<>();

        DetailList detailDTOList = new DetailList();
        List<DetailDto> detailList = detailDTOList.getDetailList();

        JobDto jobDto1 = new JobDto("Engineer", "Development", 70000, detailList.get(0));
        JobDto jobDto2 = new JobDto("Senior Engineer", "Development", 85000, detailList.get(1));
        JobDto jobDto3 = new JobDto("Analyst", "Business Intelligence", 65000, detailList.get(2));
        JobDto jobDto4 = new JobDto("Data Scientist", "AI/ML", 95000, detailList.get(3));
        JobDto jobDto5 = new JobDto("System Administrator", "IT Support", 60000, detailList.get(4));
        JobDto jobDto6 = new JobDto("Project Manager", "Management", 100000, detailList.get(5));
        JobDto jobDto7 = new JobDto("QA Engineer", "Testing", 68000, detailList.get(6));
        JobDto jobDto8 = new JobDto("DevOps Engineer", "Cloud", 88000, detailList.get(7));
        JobDto jobDto9 = new JobDto("UI/UX Designer", "Design", 72000, detailList.get(8));
        JobDto jobDto10 = new JobDto("Technical Writer", "Documentation", 58000, detailList.get(9));
        JobDto jobDto11 = new JobDto("Backend Developer", "Development", 77000, detailList.get(10));
        JobDto jobDto12 = new JobDto("Frontend Developer", "Development", 75000, detailList.get(11));
        JobDto jobDto13 = new JobDto("IT Consultant", "Consulting", 90000, detailList.get(12));
        JobDto jobDto14 = new JobDto("Business Analyst", "Business", 70000, detailList.get(13));
        JobDto jobDto15 = new JobDto("Network Engineer", "Infrastructure", 68000, detailList.get(14));
        JobDto jobDto16 = new JobDto("Database Administrator", "Database", 79000, detailList.get(15));
        JobDto jobDto17 = new JobDto("Product Manager", "Product", 105000, detailList.get(16));
        JobDto jobDto18 = new JobDto("Security Analyst", "Cybersecurity", 87000, detailList.get(17));
        JobDto jobDto19 = new JobDto("Cloud Architect", "Cloud", 110000, detailList.get(18));
        JobDto jobDto20 = new JobDto("Technical Support", "Support", 54000, detailList.get(19));
        JobDto jobDto21 = new JobDto("HR Specialist", "Human Resources", 60000, detailList.get(20));
        JobDto jobDto22 = new JobDto("Recruiter", "Human Resources", 62000, detailList.get(21));
        JobDto jobDto23 = new JobDto("Operations Manager", "Operations", 95000, detailList.get(22));
        JobDto jobDto24 = new JobDto("Marketing Executive", "Marketing", 65000, detailList.get(23));
        JobDto jobDto25 = new JobDto("Sales Executive", "Sales", 70000, detailList.get(24));
        JobDto jobDto26 = new JobDto("Finance Analyst", "Finance", 74000, detailList.get(25));
        JobDto jobDto27 = new JobDto("Compliance Officer", "Legal", 80000, detailList.get(26));
        JobDto jobDto28 = new JobDto("Content Strategist", "Content", 67000, detailList.get(27));
        JobDto jobDto29 = new JobDto("Scrum Master", "Agile Team", 92000, detailList.get(28));
        JobDto jobDto30 = new JobDto("AI Engineer", "R&D", 115000, detailList.get(29));

        list.add(jobDto1);
        list.add(jobDto2);
        list.add(jobDto3);
        list.add(jobDto4);
        list.add(jobDto5);
        list.add(jobDto6);
        list.add(jobDto7);
        list.add(jobDto8);
        list.add(jobDto9);
        list.add(jobDto10);
        list.add(jobDto11);
        list.add(jobDto12);
        list.add(jobDto13);
        list.add(jobDto14);
        list.add(jobDto15);
        list.add(jobDto16);
        list.add(jobDto17);
        list.add(jobDto18);
        list.add(jobDto19);
        list.add(jobDto20);
        list.add(jobDto21);
        list.add(jobDto22);
        list.add(jobDto23);
        list.add(jobDto24);
        list.add(jobDto25);
        list.add(jobDto26);
        list.add(jobDto27);
        list.add(jobDto28);
        list.add(jobDto29);
        list.add(jobDto30);

        return list;

    }
}
