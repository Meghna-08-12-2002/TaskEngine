package com.xworkz.java.list;

import com.xworkz.java.dto.DetailDto;
import com.xworkz.java.dto.EducationDto;

import java.util.LinkedList;
import java.util.List;

public class DetailList {
    public List<DetailDto> getDetailList() {
        System.out.println("getDetailList method in DetailDtoList");

        List<DetailDto> list = new LinkedList<>();
        EducationList educationListObj = new EducationList();
        List<EducationDto> educationList = educationListObj.getEducationList();

        DetailDto detailDto1 = new DetailDto("1", "Top performer", "true", educationList.get(0));
        DetailDto detailDto2 = new DetailDto("2", "Excellent project work", "true", educationList.get(1));
        DetailDto detailDto3 = new DetailDto("3", "Consistent learner", "true", educationList.get(2));
        DetailDto detailDto4 = new DetailDto("4", "Quick problem solver", "false", educationList.get(3));
        DetailDto detailDto5 = new DetailDto("5", "Good communicator", "true", educationList.get(4));
        DetailDto detailDto6 = new DetailDto("6", "Team player", "true", educationList.get(5));
        DetailDto detailDto7 = new DetailDto("7", "Self-motivated", "false", educationList.get(6));
        DetailDto detailDto8 = new DetailDto("8", "Creative thinker", "true", educationList.get(7));
        DetailDto detailDto9 = new DetailDto("9", "Disciplined", "true", educationList.get(8));
        DetailDto detailDto10 = new DetailDto("10", "Time management skills", "true", educationList.get(9));
        DetailDto detailDto11 = new DetailDto("11", "Leadership qualities", "true", educationList.get(10));
        DetailDto detailDto12 = new DetailDto("12", "Analytical mindset", "false", educationList.get(11));
        DetailDto detailDto13 = new DetailDto("13", "Strong fundamentals", "true", educationList.get(12));
        DetailDto detailDto14 = new DetailDto("14", "Goal-oriented", "true", educationList.get(13));
        DetailDto detailDto15 = new DetailDto("15", "Takes initiative", "true", educationList.get(14));
        DetailDto detailDto16 = new DetailDto("16", "Logical thinker", "true", educationList.get(15));
        DetailDto detailDto17 = new DetailDto("17", "Great at collaboration", "true", educationList.get(16));
        DetailDto detailDto18 = new DetailDto("18", "Technically sound", "true", educationList.get(17));
        DetailDto detailDto19 = new DetailDto("19", "Positive attitude", "false", educationList.get(18));
        DetailDto detailDto20 = new DetailDto("20", "Handles pressure well", "true", educationList.get(19));
        DetailDto detailDto21 = new DetailDto("21", "Attention to detail", "true", educationList.get(20));
        DetailDto detailDto22 = new DetailDto("22", "High integrity", "true", educationList.get(21));
        DetailDto detailDto23 = new DetailDto("23", "Good presentation skills", "false", educationList.get(22));
        DetailDto detailDto24 = new DetailDto("24", "Excellent in documentation", "true", educationList.get(23));
        DetailDto detailDto25 = new DetailDto("25", "Client-focused", "true", educationList.get(24));
        DetailDto detailDto26 = new DetailDto("26", "Innovative", "true", educationList.get(25));
        DetailDto detailDto27 = new DetailDto("27", "Empathetic leader", "false", educationList.get(26));
        DetailDto detailDto28 = new DetailDto("28", "Multitasker", "true", educationList.get(27));
        DetailDto detailDto29 = new DetailDto("29", "Driven by excellence", "true", educationList.get(28));
        DetailDto detailDto30 = new DetailDto("30", "Quick learner", "true", educationList.get(29));

        list.add(detailDto1);
        list.add(detailDto2);
        list.add(detailDto3);
        list.add(detailDto4);
        list.add(detailDto5);
        list.add(detailDto6);
        list.add(detailDto7);
        list.add(detailDto8);
        list.add(detailDto9);
        list.add(detailDto10);
        list.add(detailDto11);
        list.add(detailDto12);
        list.add(detailDto13);
        list.add(detailDto14);
        list.add(detailDto15);
        list.add(detailDto16);
        list.add(detailDto17);
        list.add(detailDto18);
        list.add(detailDto19);
        list.add(detailDto20);
        list.add(detailDto21);
        list.add(detailDto22);
        list.add(detailDto23);
        list.add(detailDto24);
        list.add(detailDto25);
        list.add(detailDto26);
        list.add(detailDto27);
        list.add(detailDto28);
        list.add(detailDto29);
        list.add(detailDto30);

        return list;
    }
}
