package com.xworkz.java.list;

import com.xworkz.java.dto.CEODto;
import com.xworkz.java.dto.HouseDto;

import java.util.LinkedList;
import java.util.List;

public class CEOList {
    public List<CEODto> getCEOList()
    {
        System.out.println("getCEOList method in CEODTOList ");

        List<CEODto> list = new LinkedList<>();
        HouseList houseDTOList = new HouseList();
        List<HouseDto> houseList = houseDTOList.getHouseDtoList();
        CEODto ceoDto1 = new CEODto("Arun Kumar", 52, "arun.kumar@example.com", houseList.get(0));
        CEODto ceoDto2 = new CEODto("Meena Rani", 49, "meena.rani@example.com", houseList.get(1));
        CEODto ceoDto3 = new CEODto("Sundar Raj", 55, "sundar.raj@example.com", houseList.get(2));
        CEODto ceoDto4 = new CEODto("Kavitha", 47, "kavitha@example.com", houseList.get(3));
        CEODto ceoDto5 = new CEODto("Murugan", 53, "murugan@example.com", houseList.get(4));
        CEODto ceoDto6 = new CEODto("Lakshmi", 50, "lakshmi@example.com", houseList.get(5));
        CEODto ceoDto7 = new CEODto("Vignesh", 56, "vignesh@example.com", houseList.get(6));
        CEODto ceoDto8 = new CEODto("Revathi", 45, "revathi@example.com", houseList.get(7));
        CEODto ceoDto9 = new CEODto("Ramesh", 51, "ramesh@example.com", houseList.get(8));
        CEODto ceoDto10 = new CEODto("Anjali", 48, "anjali@example.com", houseList.get(9));
        CEODto ceoDto11 = new CEODto("Natarajan", 54, "natarajan@example.com", houseList.get(10));
        CEODto ceoDto12 = new CEODto("Sujatha", 46, "sujatha@example.com", houseList.get(11));
        CEODto ceoDto13 = new CEODto("Saravanan", 50, "saravanan@example.com", houseList.get(12));
        CEODto ceoDto14 = new CEODto("Priya", 49, "priya@example.com", houseList.get(13));
        CEODto ceoDto15 = new CEODto("Karthik", 53, "karthik@example.com", houseList.get(14));
        CEODto ceoDto16 = new CEODto("Geetha", 47, "geetha@example.com", houseList.get(15));
        CEODto ceoDto17 = new CEODto("Ravi", 55, "ravi@example.com", houseList.get(16));
        CEODto ceoDto18 = new CEODto("Shanthi", 44, "shanthi@example.com", houseList.get(17));
        CEODto ceoDto19 = new CEODto("Muthu", 52, "muthu@example.com", houseList.get(18));
        CEODto ceoDto20 = new CEODto("Janani", 48, "janani@example.com", houseList.get(19));
        CEODto ceoDto21 = new CEODto("Hariharan", 51, "hariharan@example.com", houseList.get(20));
        CEODto ceoDto22 = new CEODto("Kausalya", 46, "kausalya@example.com", houseList.get(21));
        CEODto ceoDto23 = new CEODto("Periyasamy", 54, "periyasamy@example.com", houseList.get(22));
        CEODto ceoDto24 = new CEODto("Deepa", 49, "deepa@example.com", houseList.get(23));
        CEODto ceoDto25 = new CEODto("Bala", 50, "bala@example.com", houseList.get(24));
        CEODto ceoDto26 = new CEODto("Uma", 47, "uma@example.com", houseList.get(25));
        CEODto ceoDto27 = new CEODto("Thirumalai", 53, "thirumalai@example.com", houseList.get(26));
        CEODto ceoDto28 = new CEODto("Sindhu", 45, "sindhu@example.com", houseList.get(27));
        CEODto ceoDto29 = new CEODto("Manikandan", 52, "manikandan@example.com", houseList.get(28));
        CEODto ceoDto30 = new CEODto("Rajalakshmi", 48, "rajalakshmi@example.com", houseList.get(29));

// Adding all to the list
        list.add(ceoDto1);
        list.add(ceoDto2);
        list.add(ceoDto3);
        list.add(ceoDto4);
        list.add(ceoDto5);
        list.add(ceoDto6);
        list.add(ceoDto7);
        list.add(ceoDto8);
        list.add(ceoDto9);
        list.add(ceoDto10);
        list.add(ceoDto11);
        list.add(ceoDto12);
        list.add(ceoDto13);
        list.add(ceoDto14);
        list.add(ceoDto15);
        list.add(ceoDto16);
        list.add(ceoDto17);
        list.add(ceoDto18);
        list.add(ceoDto19);
        list.add(ceoDto20);
        list.add(ceoDto21);
        list.add(ceoDto22);
        list.add(ceoDto23);
        list.add(ceoDto24);
        list.add(ceoDto25);
        list.add(ceoDto26);
        list.add(ceoDto27);
        list.add(ceoDto28);
        list.add(ceoDto29);
        list.add(ceoDto30);

        return list;
    }
    }

