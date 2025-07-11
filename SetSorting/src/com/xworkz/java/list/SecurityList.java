package com.xworkz.java.list;

import com.xworkz.java.dto.JobDto;
import com.xworkz.java.dto.SecurityDto;

import java.util.LinkedList;
import java.util.List;

public class SecurityList {
    public List<SecurityDto> getSecurityList() {
        System.out.println("getSecurityList method in SecurityList");

        List<SecurityDto> list = new LinkedList<>();
        JobList jobDTOList = new JobList();
        List<JobDto> jobList = jobDTOList.getJobList();

        SecurityDto securityDto1 = new SecurityDto("SEC001", "High", true, jobList.get(0));
        SecurityDto securityDto2 = new SecurityDto("SEC002", "Medium", true, jobList.get(1));
        SecurityDto securityDto3 = new SecurityDto("SEC003", "Low", false, jobList.get(2));
        SecurityDto securityDto4 = new SecurityDto("SEC004", "High", true, jobList.get(3));
        SecurityDto securityDto5 = new SecurityDto("SEC005", "Medium", true, jobList.get(4));
        SecurityDto securityDto6 = new SecurityDto("SEC006", "Low", false, jobList.get(5));
        SecurityDto securityDto7 = new SecurityDto("SEC007", "High", true, jobList.get(6));
        SecurityDto securityDto8 = new SecurityDto("SEC008", "Medium", true, jobList.get(7));
        SecurityDto securityDto9 = new SecurityDto("SEC009", "Low", false, jobList.get(8));
        SecurityDto securityDto10 = new SecurityDto("SEC010", "High", true, jobList.get(9));
        SecurityDto securityDto11 = new SecurityDto("SEC011", "Medium", true, jobList.get(10));
        SecurityDto securityDto12 = new SecurityDto("SEC012", "Low", false, jobList.get(11));
        SecurityDto securityDto13 = new SecurityDto("SEC013", "High", true, jobList.get(12));
        SecurityDto securityDto14 = new SecurityDto("SEC014", "Medium", true, jobList.get(13));
        SecurityDto securityDto15 = new SecurityDto("SEC015", "Low", false, jobList.get(14));
        SecurityDto securityDto16 = new SecurityDto("SEC016", "High", true, jobList.get(15));
        SecurityDto securityDto17 = new SecurityDto("SEC017", "Medium", false, jobList.get(16));
        SecurityDto securityDto18 = new SecurityDto("SEC018", "Low", false, jobList.get(17));
        SecurityDto securityDto19 = new SecurityDto("SEC019", "High", true, jobList.get(18));
        SecurityDto securityDto20 = new SecurityDto("SEC020", "Medium", true, jobList.get(19));
        SecurityDto securityDto21 = new SecurityDto("SEC021", "Low", true, jobList.get(20));
        SecurityDto securityDto22 = new SecurityDto("SEC022", "High", true, jobList.get(21));
        SecurityDto securityDto23 = new SecurityDto("SEC023", "Medium", true, jobList.get(22));
        SecurityDto securityDto24 = new SecurityDto("SEC024", "Low", false, jobList.get(23));
        SecurityDto securityDto25 = new SecurityDto("SEC025", "High", true, jobList.get(24));
        SecurityDto securityDto26 = new SecurityDto("SEC026", "Medium", false, jobList.get(25));
        SecurityDto securityDto27 = new SecurityDto("SEC027", "Low", false, jobList.get(26));
        SecurityDto securityDto28 = new SecurityDto("SEC028", "High", true, jobList.get(27));
        SecurityDto securityDto29 = new SecurityDto("SEC029", "Medium", true, jobList.get(28));
        SecurityDto securityDto30 = new SecurityDto("SEC030", "Low", true, jobList.get(29));

        list.add(securityDto1);
        list.add(securityDto2);
        list.add(securityDto3);
        list.add(securityDto4);
        list.add(securityDto5);
        list.add(securityDto6);
        list.add(securityDto7);
        list.add(securityDto8);
        list.add(securityDto9);
        list.add(securityDto10);
        list.add(securityDto11);
        list.add(securityDto12);
        list.add(securityDto13);
        list.add(securityDto14);
        list.add(securityDto15);
        list.add(securityDto16);
        list.add(securityDto17);
        list.add(securityDto18);
        list.add(securityDto19);
        list.add(securityDto20);
        list.add(securityDto21);
        list.add(securityDto22);
        list.add(securityDto23);
        list.add(securityDto24);
        list.add(securityDto25);
        list.add(securityDto26);
        list.add(securityDto27);
        list.add(securityDto28);
        list.add(securityDto29);
        list.add(securityDto30);

        return list;
    }
}
