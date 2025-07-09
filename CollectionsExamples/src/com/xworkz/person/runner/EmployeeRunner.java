package com.xworkz.person.runner;

import com.xworkz.person.dto.PersonDto;

import java.util.*;

public class EmployeeRunner {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Meghna");
        collection.add("Ramya");
        collection.add("Meera");
        collection.add("Akash");
        collection.add("Veena");

        System.out.println(collection);

        PersonDto personDto1 =new PersonDto("Ramya","ram02@gmail.com","6239 8923 8329");
        PersonDto personDto2 =new PersonDto("Shalini","shalini729@gmail.com","6239 8792 8329");
        PersonDto personDto3 =new PersonDto("Akash","akash812@gmail.com","6239 8923 9264");
        PersonDto personDto4 =new PersonDto("Akil","akil082@gmail.com","6239 8923 9264");
        PersonDto personDto5 = new PersonDto("Sneha","sneha123@gmail.com","6211 2233 4455");

        Collection<PersonDto> collection1 = new HashSet<>();
        collection1.add(personDto1);
        collection1.add(personDto2);
        collection1.add(personDto3);
        collection1.add(personDto4);
        collection1.add(personDto5);

        System.out.println(collection1);
        System.out.println("---------------");

        List<String> list1 = new LinkedList<>();
        list1.add("Monish");
        list1.add("Manya");
        list1.add("Vaishnavi");
        list1.add("Veena");

        System.out.println(list1);
        System.out.println("---------------");
        Set<String> set = new TreeSet<>();
        set.add("Monish");
        set.add("Chandra");
        set.add("Aishwarya");
        set.add("Nayana");
        set.add("Bindu");

        System.out.println(set);
        System.out.println("---------------");

    }
}
