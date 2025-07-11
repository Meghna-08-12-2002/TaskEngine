package com.xworkz.java.list;

import com.xworkz.java.dto.DriverDto;
import com.xworkz.java.dto.PresidentDto;

import java.util.LinkedList;
import java.util.List;

public class PresidentList {
    public List<PresidentDto> getPresidentList() {
        System.out.println("getPresidentList method in PresidentList");

        List<PresidentDto> list = new LinkedList<>();
        DriverList driverDTOList = new DriverList();
        List<DriverDto> driverList = driverDTOList.getDriverList();

        PresidentDto presidentDto1 = new PresidentDto("Arul", 60, "PartyA", driverList.get(0));
        PresidentDto presidentDto2 = new PresidentDto("Prakash", 58, "PartyB", driverList.get(1));
        PresidentDto presidentDto3 = new PresidentDto("Sundar", 62, "PartyC", driverList.get(2));
        PresidentDto presidentDto4 = new PresidentDto("Rajadurai", 61, "PartyD", driverList.get(3));
        PresidentDto presidentDto5 = new PresidentDto("Saravanan", 59, "PartyE", driverList.get(4));
        PresidentDto presidentDto6 = new PresidentDto("Balamurugan", 64, "PartyF", driverList.get(5));
        PresidentDto presidentDto7 = new PresidentDto("Elango", 56, "PartyG", driverList.get(6));
        PresidentDto presidentDto8 = new PresidentDto("Vignesh", 57, "PartyH", driverList.get(7));
        PresidentDto presidentDto9 = new PresidentDto("Gokul", 60, "PartyI", driverList.get(8));
        PresidentDto presidentDto10 = new PresidentDto("Sathish", 65, "PartyJ", driverList.get(9));
        PresidentDto presidentDto11 = new PresidentDto("Arvind", 63, "PartyK", driverList.get(10));
        PresidentDto presidentDto12 = new PresidentDto("Murugan", 59, "PartyL", driverList.get(11));
        PresidentDto presidentDto13 = new PresidentDto("Rajkumar", 61, "PartyM", driverList.get(12));
        PresidentDto presidentDto14 = new PresidentDto("Dinesh", 62, "PartyN", driverList.get(13));
        PresidentDto presidentDto15 = new PresidentDto("Logesh", 55, "PartyO", driverList.get(14));
        PresidentDto presidentDto16 = new PresidentDto("Naveen", 64, "PartyP", driverList.get(15));
        PresidentDto presidentDto17 = new PresidentDto("Harish", 60, "PartyQ", driverList.get(16));
        PresidentDto presidentDto18 = new PresidentDto("Balaji", 58, "PartyR", driverList.get(17));
        PresidentDto presidentDto19 = new PresidentDto("Karthik", 63, "PartyS", driverList.get(18));
        PresidentDto presidentDto20 = new PresidentDto("Sankar", 61, "PartyT", driverList.get(19));
        PresidentDto presidentDto21 = new PresidentDto("Raghavan", 66, "PartyU", driverList.get(20));
        PresidentDto presidentDto22 = new PresidentDto("Manikandan", 56, "PartyV", driverList.get(21));
        PresidentDto presidentDto23 = new PresidentDto("Jeyakumar", 59, "PartyW", driverList.get(22));
        PresidentDto presidentDto24 = new PresidentDto("Nataraj", 60, "PartyX", driverList.get(23));
        PresidentDto presidentDto25 = new PresidentDto("Parameswaran", 62, "PartyY", driverList.get(24));
        PresidentDto presidentDto26 = new PresidentDto("Thamizhanban", 61, "PartyZ", driverList.get(25));
        PresidentDto presidentDto27 = new PresidentDto("Muthuvel", 58, "PartyAA", driverList.get(26));
        PresidentDto presidentDto28 = new PresidentDto("Vinoth", 64, "PartyAB", driverList.get(27));
        PresidentDto presidentDto29 = new PresidentDto("Sivakumar", 63, "PartyAC", driverList.get(28));
        PresidentDto presidentDto30 = new PresidentDto("Kandhasamy", 60, "PartyAD", driverList.get(29));

        list.add(presidentDto1);
        list.add(presidentDto2);
        list.add(presidentDto3);
        list.add(presidentDto4);
        list.add(presidentDto5);
        list.add(presidentDto6);
        list.add(presidentDto7);
        list.add(presidentDto8);
        list.add(presidentDto9);
        list.add(presidentDto10);
        list.add(presidentDto11);
        list.add(presidentDto12);
        list.add(presidentDto13);
        list.add(presidentDto14);
        list.add(presidentDto15);
        list.add(presidentDto16);
        list.add(presidentDto17);
        list.add(presidentDto18);
        list.add(presidentDto19);
        list.add(presidentDto20);
        list.add(presidentDto21);
        list.add(presidentDto22);
        list.add(presidentDto23);
        list.add(presidentDto24);
        list.add(presidentDto25);
        list.add(presidentDto26);
        list.add(presidentDto27);
        list.add(presidentDto28);
        list.add(presidentDto29);
        list.add(presidentDto30);

        return list;
    }
}
