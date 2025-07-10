package com.xworkz.person.runner;

import com.xworkz.person.dto.PersonDto;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonRunner {

    public static void main(String[] args) {

        PersonDto personDto1 =new PersonDto("Ramya","ram02@gmail.com","6239 8923 8329");
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


        Map<PersonDto,String> map=new HashMap<>();

        map.put(personDto1,"101");
        map.put(personDto2,"Karnataka");
        map.put(personDto3,"kashmir");
        map.put(personDto4,"Kerala");
        map.put(personDto5, "Tamil Nadu");
        map.put(personDto6, "Telangana");
        map.put(personDto7, "Andhra Pradesh");
        map.put(personDto8, "Maharashtra");
        map.put(personDto9, "Punjab");
        map.put(personDto10, "Haryana");

        map.put(personDto11, "Delhi");
        map.put(personDto12, "Gujarat");
        map.put(personDto13, "Rajasthan");
        map.put(personDto14, "Bihar");
        map.put(personDto15, "Odisha");
        map.put(personDto16, "Assam");
        map.put(personDto17, "Manipur");
        map.put(personDto18, "Mizoram");
        map.put(personDto19, "Sikkim");
        map.put(personDto20, "Tripura");

        map.put(personDto21, "Meghalaya");
        map.put(personDto22, "Jharkhand");
        map.put(personDto23, "Chhattisgarh");
        map.put(personDto24, "Uttarakhand");
        map.put(personDto25, "Uttar Pradesh");

        map.keySet().forEach(System.out::println);

        System.out.println("Values");
        map.values().forEach(System.out::println);

        Set<Map.Entry<PersonDto, String>> entrySet = map.entrySet();

        entrySet.forEach(e->{
            System.out.println("key"+e.getKey()+"value"+e.getValue());
        });
    }
}
