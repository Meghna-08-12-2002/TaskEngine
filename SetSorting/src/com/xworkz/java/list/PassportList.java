package com.xworkz.java.list;

import com.xworkz.java.dto.CountryDto;
import com.xworkz.java.dto.PassportDto;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class PassportList {
    public List<PassportDto> getPassportList() {
        System.out.println("getPassportList method in PassportList");

        List<PassportDto> list = new LinkedList<>();
        CountryList countryDTOList = new CountryList();
        List<CountryDto> countryList = countryDTOList.getCountryList();

        PassportDto passportDto1 = new PassportDto("IND123456", "Indian", LocalDate.of(2021, 8, 10), countryList.get(0));
        PassportDto passportDto2 = new PassportDto("JPN654321", "Japanese", LocalDate.of(2020, 6, 15), countryList.get(1));
        PassportDto passportDto3 = new PassportDto("GER987654", "German", LocalDate.of(2019, 5, 1), countryList.get(2));
        PassportDto passportDto4 = new PassportDto("FRA246810", "French", LocalDate.of(2022, 1, 12), countryList.get(3));
        PassportDto passportDto5 = new PassportDto("BRA135791", "Brazilian", LocalDate.of(2021, 3, 9), countryList.get(4));
        PassportDto passportDto6 = new PassportDto("CAN102938", "Canadian", LocalDate.of(2020, 10, 5), countryList.get(5));
        PassportDto passportDto7 = new PassportDto("AUS564738", "Australian", LocalDate.of(2023, 2, 20), countryList.get(6));
        PassportDto passportDto8 = new PassportDto("RUS837261", "Russian", LocalDate.of(2021, 7, 25), countryList.get(7));
        PassportDto passportDto9 = new PassportDto("CHN384756", "Chinese", LocalDate.of(2022, 5, 18), countryList.get(8));
        PassportDto passportDto10 = new PassportDto("SAF958473", "South African", LocalDate.of(2019, 12, 2), countryList.get(9));
        PassportDto passportDto11 = new PassportDto("USA192837", "American", LocalDate.of(2021, 4, 6), countryList.get(10));
        PassportDto passportDto12 = new PassportDto("UK837465", "British", LocalDate.of(2020, 9, 30), countryList.get(11));
        PassportDto passportDto13 = new PassportDto("ITA564738", "Italian", LocalDate.of(2022, 8, 21), countryList.get(12));
        PassportDto passportDto14 = new PassportDto("ARG111222", "Argentinian", LocalDate.of(2023, 3, 5), countryList.get(13));
        PassportDto passportDto15 = new PassportDto("MEX333444", "Mexican", LocalDate.of(2019, 7, 14), countryList.get(14));
        PassportDto passportDto16 = new PassportDto("THA888999", "Thai", LocalDate.of(2020, 2, 10), countryList.get(15));
        PassportDto passportDto17 = new PassportDto("SGP777888", "Singaporean", LocalDate.of(2021, 11, 25), countryList.get(16));
        PassportDto passportDto18 = new PassportDto("KOR555666", "South Korean", LocalDate.of(2023, 6, 2), countryList.get(17));
        PassportDto passportDto19 = new PassportDto("EGY444333", "Egyptian", LocalDate.of(2022, 10, 8), countryList.get(18));
        PassportDto passportDto20 = new PassportDto("KEN222111", "Kenyan", LocalDate.of(2020, 12, 15), countryList.get(19));
        PassportDto passportDto21 = new PassportDto("ESP998877", "Spanish", LocalDate.of(2021, 5, 20), countryList.get(20));
        PassportDto passportDto22 = new PassportDto("NOR112233", "Norwegian", LocalDate.of(2022, 9, 3), countryList.get(21));
        PassportDto passportDto23 = new PassportDto("SWE445566", "Swedish", LocalDate.of(2020, 3, 28), countryList.get(22));
        PassportDto passportDto24 = new PassportDto("SWI778899", "Swiss", LocalDate.of(2019, 1, 9), countryList.get(23));
        PassportDto passportDto25 = new PassportDto("NZL998877", "New Zealander", LocalDate.of(2023, 7, 30), countryList.get(24));
        PassportDto passportDto26 = new PassportDto("POR667788", "Portuguese", LocalDate.of(2021, 6, 18), countryList.get(25));
        PassportDto passportDto27 = new PassportDto("MYS556677", "Malaysian", LocalDate.of(2022, 4, 22), countryList.get(26));
        PassportDto passportDto28 = new PassportDto("IDN334455", "Indonesian", LocalDate.of(2023, 1, 5), countryList.get(27));
        PassportDto passportDto29 = new PassportDto("UAE223344", "Emirati", LocalDate.of(2020, 11, 17), countryList.get(28));
        PassportDto passportDto30 = new PassportDto("KSA112233", "Saudi", LocalDate.of(2021, 2, 1), countryList.get(29));

        list.add(passportDto1);
        list.add(passportDto2);
        list.add(passportDto3);
        list.add(passportDto4);
        list.add(passportDto5);
        list.add(passportDto6);
        list.add(passportDto7);
        list.add(passportDto8);
        list.add(passportDto9);
        list.add(passportDto10);
        list.add(passportDto11);
        list.add(passportDto12);
        list.add(passportDto13);
        list.add(passportDto14);
        list.add(passportDto15);
        list.add(passportDto16);
        list.add(passportDto17);
        list.add(passportDto18);
        list.add(passportDto19);
        list.add(passportDto20);
        list.add(passportDto21);
        list.add(passportDto22);
        list.add(passportDto23);
        list.add(passportDto24);
        list.add(passportDto25);
        list.add(passportDto26);
        list.add(passportDto27);
        list.add(passportDto28);
        list.add(passportDto29);
        list.add(passportDto30);

        return list;
    }
}
