package com.xworkz.java.list;

import com.xworkz.java.dto.CountryDto;
import com.xworkz.java.dto.PresidentDto;

import java.util.LinkedList;
import java.util.List;

public class CountryList {
    public List<CountryDto> getCountryList() {
        System.out.println("getCountryList method in CountryList");

        List<CountryDto> list = new LinkedList<>();

        PresidentList presidentListObj = new PresidentList(); // updated class name
        List<PresidentDto> presidentList = presidentListObj.getPresidentList();

        CountryDto countryDto1 = new CountryDto("India", "New Delhi", 1400000000L, presidentList.get(0));
        CountryDto countryDto2 = new CountryDto("Japan", "Tokyo", 125000000L, presidentList.get(1));
        CountryDto countryDto3 = new CountryDto("Germany", "Berlin", 83000000L, presidentList.get(2));
        CountryDto countryDto4 = new CountryDto("France", "Paris", 67000000L, presidentList.get(3));
        CountryDto countryDto5 = new CountryDto("Brazil", "Brasília", 213000000L, presidentList.get(4));
        CountryDto countryDto6 = new CountryDto("Canada", "Ottawa", 38000000L, presidentList.get(5));
        CountryDto countryDto7 = new CountryDto("Australia", "Canberra", 26000000L, presidentList.get(6));
        CountryDto countryDto8 = new CountryDto("Russia", "Moscow", 145000000L, presidentList.get(7));
        CountryDto countryDto9 = new CountryDto("China", "Beijing", 1440000000L, presidentList.get(8));
        CountryDto countryDto10 = new CountryDto("South Africa", "Pretoria", 60000000L, presidentList.get(9));
        CountryDto countryDto11 = new CountryDto("United States", "Washington, D.C.", 331000000L, presidentList.get(10));
        CountryDto countryDto12 = new CountryDto("United Kingdom", "London", 67000000L, presidentList.get(11));
        CountryDto countryDto13 = new CountryDto("Italy", "Rome", 60000000L, presidentList.get(12));
        CountryDto countryDto14 = new CountryDto("Argentina", "Buenos Aires", 45000000L, presidentList.get(13));
        CountryDto countryDto15 = new CountryDto("Mexico", "Mexico City", 126000000L, presidentList.get(14));
        CountryDto countryDto16 = new CountryDto("Thailand", "Bangkok", 70000000L, presidentList.get(15));
        CountryDto countryDto17 = new CountryDto("Singapore", "Singapore", 5700000L, presidentList.get(16));
        CountryDto countryDto18 = new CountryDto("South Korea", "Seoul", 52000000L, presidentList.get(17));
        CountryDto countryDto19 = new CountryDto("Egypt", "Cairo", 104000000L, presidentList.get(18));
        CountryDto countryDto20 = new CountryDto("Kenya", "Nairobi", 54000000L, presidentList.get(19));
        CountryDto countryDto21 = new CountryDto("Spain", "Madrid", 47000000L, presidentList.get(20));
        CountryDto countryDto22 = new CountryDto("Norway", "Oslo", 5400000L, presidentList.get(21));
        CountryDto countryDto23 = new CountryDto("Sweden", "Stockholm", 10000000L, presidentList.get(22));
        CountryDto countryDto24 = new CountryDto("Switzerland", "Bern", 8700000L, presidentList.get(23));
        CountryDto countryDto25 = new CountryDto("New Zealand", "Wellington", 5100000L, presidentList.get(24));
        CountryDto countryDto26 = new CountryDto("Portugal", "Lisbon", 10000000L, presidentList.get(25));
        CountryDto countryDto27 = new CountryDto("Malaysia", "Kuala Lumpur", 33000000L, presidentList.get(26));
        CountryDto countryDto28 = new CountryDto("Indonesia", "Jakarta", 270000000L, presidentList.get(27));
        CountryDto countryDto29 = new CountryDto("UAE", "Abu Dhabi", 9800000L, presidentList.get(28));
        CountryDto countryDto30 = new CountryDto("Saudi Arabia", "Riyadh", 35000000L, presidentList.get(29));

        list.add(countryDto1);
        list.add(countryDto2);
        list.add(countryDto3);
        list.add(countryDto4);
        list.add(countryDto5);
        list.add(countryDto6);
        list.add(countryDto7);
        list.add(countryDto8);
        list.add(countryDto9);
        list.add(countryDto10);
        list.add(countryDto11);
        list.add(countryDto12);
        list.add(countryDto13);
        list.add(countryDto14);
        list.add(countryDto15);
        list.add(countryDto16);
        list.add(countryDto17);
        list.add(countryDto18);
        list.add(countryDto19);
        list.add(countryDto20);
        list.add(countryDto21);
        list.add(countryDto22);
        list.add(countryDto23);
        list.add(countryDto24);
        list.add(countryDto25);
        list.add(countryDto26);
        list.add(countryDto27);
        list.add(countryDto28);
        list.add(countryDto29);
        list.add(countryDto30);

        return list;
    }
}
