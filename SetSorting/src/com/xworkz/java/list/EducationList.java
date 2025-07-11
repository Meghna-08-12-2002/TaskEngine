package com.xworkz.java.list;

import com.xworkz.java.dto.EducationDto;

import java.util.LinkedList;
import java.util.List;

public class EducationList {
    public List<EducationDto> getEducationList() {
        System.out.println("getEducationList method in EducationList");

        List<EducationDto> list = new LinkedList<>();

        EducationDto educationDto1 = new EducationDto("B.Tech", "IIT Delhi", 2015, 8.2);
        EducationDto educationDto2 = new EducationDto("M.Tech", "IIT Bombay", 2017, 9.0);
        EducationDto educationDto3 = new EducationDto("B.Sc", "Delhi University", 2014, 7.5);
        EducationDto educationDto4 = new EducationDto("M.Sc", "Delhi University", 2016, 8.1);
        EducationDto educationDto5 = new EducationDto("BCA", "Christ University", 2013, 7.8);
        EducationDto educationDto6 = new EducationDto("MCA", "NIT Trichy", 2016, 8.4);
        EducationDto educationDto7 = new EducationDto("B.Com", "Mumbai University", 2012, 7.2);
        EducationDto educationDto8 = new EducationDto("M.Com", "Mumbai University", 2014, 7.9);
        EducationDto educationDto9 = new EducationDto("B.E", "Anna University", 2011, 8.0);
        EducationDto educationDto10 = new EducationDto("M.E", "Anna University", 2013, 8.5);
        EducationDto educationDto11 = new EducationDto("B.Tech", "IIT Kanpur", 2018, 8.7);
        EducationDto educationDto12 = new EducationDto("M.Tech", "IIT Kharagpur", 2020, 9.2);
        EducationDto educationDto13 = new EducationDto("BBA", "Symbiosis", 2015, 7.6);
        EducationDto educationDto14 = new EducationDto("MBA", "IIM Bangalore", 2017, 8.9);
        EducationDto educationDto15 = new EducationDto("B.Sc", "Jadavpur University", 2010, 7.4);
        EducationDto educationDto16 = new EducationDto("M.Sc", "Jadavpur University", 2012, 8.0);
        EducationDto educationDto17 = new EducationDto("B.Tech", "NIT Warangal", 2016, 8.3);
        EducationDto educationDto18 = new EducationDto("M.Tech", "BITS Pilani", 2018, 8.8);
        EducationDto educationDto19 = new EducationDto("BCA", "IGNOU", 2011, 6.9);
        EducationDto educationDto20 = new EducationDto("MCA", "IGNOU", 2013, 7.5);
        EducationDto educationDto21 = new EducationDto("B.Com", "Loyola College", 2009, 7.1);
        EducationDto educationDto22 = new EducationDto("M.Com", "Madras University", 2011, 7.6);
        EducationDto educationDto23 = new EducationDto("B.E", "PES University", 2014, 8.1);
        EducationDto educationDto24 = new EducationDto("M.E", "PES University", 2016, 8.5);
        EducationDto educationDto25 = new EducationDto("B.Tech", "VIT Vellore", 2017, 8.0);
        EducationDto educationDto26 = new EducationDto("M.Tech", "SRM University", 2019, 8.3);
        EducationDto educationDto27 = new EducationDto("B.Sc", "Osmania University", 2012, 7.3);
        EducationDto educationDto28 = new EducationDto("M.Sc", "Osmania University", 2014, 7.8);
        EducationDto educationDto29 = new EducationDto("BBA", "Amity University", 2016, 7.7);
        EducationDto educationDto30 = new EducationDto("MBA", "Amity University", 2018, 8.2);

        list.add(educationDto1);
        list.add(educationDto2);
        list.add(educationDto3);
        list.add(educationDto4);
        list.add(educationDto5);
        list.add(educationDto6);
        list.add(educationDto7);
        list.add(educationDto8);
        list.add(educationDto9);
        list.add(educationDto10);
        list.add(educationDto11);
        list.add(educationDto12);
        list.add(educationDto13);
        list.add(educationDto14);
        list.add(educationDto15);
        list.add(educationDto16);
        list.add(educationDto17);
        list.add(educationDto18);
        list.add(educationDto19);
        list.add(educationDto20);
        list.add(educationDto21);
        list.add(educationDto22);
        list.add(educationDto23);
        list.add(educationDto24);
        list.add(educationDto25);
        list.add(educationDto26);
        list.add(educationDto27);
        list.add(educationDto28);
        list.add(educationDto29);
        list.add(educationDto30);

        return list;
    }
}
