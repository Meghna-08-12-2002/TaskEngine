package com.xworkz.java.runner;

import com.xworkz.java.dto.AddressDto;
import com.xworkz.java.dto.PersonDto;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonRunner {
    public static void main(String[] args) {
        Map<PersonDto, AddressDto> map = new HashMap<>();

        PersonDto personDto1 =new PersonDto("Ramya","ramya@gmail.com","7895 4562 2685");
        PersonDto personDto2 =new PersonDto("Shalini","shalini729@gmail.com","6239 8792 8329");
        PersonDto personDto3 =new PersonDto("Akash","akash812@gmail.com","6239 8923 9264");
        PersonDto personDto4 =new PersonDto("Akil","akil082@gmail.com","6239 8923 9264");
        PersonDto personDto5 = new PersonDto("Sneha","sneha123@gmail.com","6211 2233 4455");
        PersonDto personDto6 = new PersonDto("Aarav","aarav.p@gmail.com","6234 9988 2345");
        PersonDto personDto7 = new PersonDto("Kiran","kiran.rao@gmail.com","6245 1234 5678");
        PersonDto personDto8 = new PersonDto("Lakshmi","lakshmi23@gmail.com","6221 3344 5566");
        PersonDto personDto9 = new PersonDto("Deepak","deepak.ds@gmail.com","6212 8765 1234");
        PersonDto personDto10 = new PersonDto("Kavya","kavya99@gmail.com","6233 4455 6677");
        PersonDto personDto11 = new PersonDto("Harsha","harsha123@gmail.com","6288 7766 1122");
        PersonDto personDto12 = new PersonDto("Reena","reena.singh@gmail.com","6291 2233 4455");
        PersonDto personDto13 = new PersonDto("Arjun","arjun.bk@gmail.com","6229 3344 5566");
        PersonDto personDto14 = new PersonDto("Sana","sana.m@gmail.com","6211 5566 7788");
        PersonDto personDto15 = new PersonDto("Nithin","nithin001@gmail.com","6200 9988 7766");
        PersonDto personDto16 = new PersonDto("Priya","priya12@gmail.com","6282 3344 1122");
        PersonDto personDto17 = new PersonDto("Rahul","rahul.k@gmail.com","6233 2233 8899");
        PersonDto personDto18 = new PersonDto("Divya","divya.r@gmail.com","6299 3322 2211");
        PersonDto personDto19 = new PersonDto("Meena","meena.s@gmail.com","6277 4433 2299");
        PersonDto personDto20 = new PersonDto("Varun","varun.singh@gmail.com","6266 7788 1199");
        PersonDto personDto21 = new PersonDto("Simran","simran.k@gmail.com","6211 6633 4411");
        PersonDto personDto22 = new PersonDto("Bhavya","bhavya.r@gmail.com","6244 1234 9876");
        PersonDto personDto23 = new PersonDto("Ravi","ravi.t@gmail.com","6222 2233 4455");
        PersonDto personDto24 = new PersonDto("Neha","neha.m@gmail.com","6281 3399 4400");
        PersonDto personDto25 = new PersonDto("Amit","amit.p@gmail.com","6273 5599 6611");


        AddressDto addressDto1 = new AddressDto(89, "Kattuputhur", "Trichy", 621207);
        AddressDto addressDto2 = new AddressDto(45, "Gandhi Nagar", "Chennai", 600020);
        AddressDto addressDto3 = new AddressDto(12, "MG Road", "Bangalore", 560001);
        AddressDto addressDto4 = new AddressDto(78, "Vasant Vihar", "Delhi", 110057);
        AddressDto addressDto5 = new AddressDto(33, "Civil Lines", "Allahabad", 211001);
        AddressDto addressDto6 = new AddressDto(101, "Lakshmi Nagar", "Pune", 411030);
        AddressDto addressDto7 = new AddressDto(56, "Kothrud", "Pune", 411038);
        AddressDto addressDto8 = new AddressDto(98, "T Nagar", "Chennai", 600017);
        AddressDto addressDto9 = new AddressDto(63, "Salt Lake", "Kolkata", 700064);
        AddressDto addressDto10 = new AddressDto(24, "Dilsukhnagar", "Hyderabad", 500060);
        AddressDto addressDto11 = new AddressDto(39, "Jayanagar", "Bangalore", 560041);
        AddressDto addressDto12 = new AddressDto(85, "Annanagar", "Chennai", 600040);
        AddressDto addressDto13 = new AddressDto(77, "Rajaji Nagar", "Bangalore", 560010);
        AddressDto addressDto14 = new AddressDto(20, "Sector 15", "Noida", 201301);
        AddressDto addressDto15 = new AddressDto(61, "BTM Layout", "Bangalore", 560076);
        AddressDto addressDto16 = new AddressDto(90, "Perambur", "Chennai", 600011);
        AddressDto addressDto17 = new AddressDto(47, "Lalpur", "Ranchi", 834001);
        AddressDto addressDto18 = new AddressDto(29, "Ashok Nagar", "Chennai", 600083);
        AddressDto addressDto19 = new AddressDto(14, "Model Town", "Delhi", 110009);
        AddressDto addressDto20 = new AddressDto(72, "Aliganj", "Lucknow", 226024);
        AddressDto addressDto21 = new AddressDto(36, "Boring Road", "Patna", 800001);
        AddressDto addressDto22 = new AddressDto(59, "Indira Nagar", "Lucknow", 226016);
        AddressDto addressDto23 = new AddressDto(10, "Koramangala", "Bangalore", 560034);
        AddressDto addressDto24 = new AddressDto(53, "Behala", "Kolkata", 700034);
        AddressDto addressDto25 = new AddressDto(66, "Saidapet", "Chennai", 600015);

        map.put(personDto1,addressDto1);
        map.put(personDto2,addressDto2);
        map.put(personDto3,addressDto3);
        map.put(personDto4,addressDto4);
        map.put(personDto5,addressDto5);
        map.put(personDto6,addressDto6);
        map.put(personDto7,addressDto7);
        map.put(personDto8,addressDto8);
        map.put(personDto9,addressDto9);
        map.put(personDto10,addressDto10);
        map.put(personDto11,addressDto11);
        map.put(personDto12,addressDto12);
        map.put(personDto13,addressDto13);
        map.put(personDto14,addressDto14);
        map.put(personDto15,addressDto15);
        map.put(personDto16,addressDto16);
        map.put(personDto17,addressDto17);
        map.put(personDto18,addressDto18);
        map.put(personDto19,addressDto19);
        map.put(personDto20,addressDto20);
        map.put(personDto21,addressDto21);
        map.put(personDto22,addressDto22);
        map.put(personDto23,addressDto23);
        map.put(personDto24,addressDto24);
        map.put(personDto25,addressDto25);

        Set<Map.Entry<PersonDto, AddressDto>> entrySet = map.entrySet();

        entrySet.forEach(e -> {
            System.out.println("Key -> " + e.getKey()+ ", Email: " + e.getKey() + ", Value -> " + e.getValue());
        });

    }
}
