package com.xworkz.person.runner;

import com.xworkz.person.dto.PersonDto;

import java.util.*;

public class EmployeeRunner {
    private static Collection<? extends PersonDto> Collection;

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Meghna");
        collection.add("Ramya");
        collection.add("Meera");
        collection.add("Akash");
        collection.add("Veena");

        System.out.println(collection);
        System.out.println("---------------");

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

        collection.remove("Meera");
        System.out.println("After remove: " + collection);
        collection.addAll(Arrays.asList("Kiran", "Ravi"));
        System.out.println("After addAll: " + collection);
        collection.removeAll(Arrays.asList("Kiran"));
        System.out.println("After removeAll: " + collection);
        System.out.println("Contains Ramya? " + collection.contains("Ramya"));
        System.out.println("Size: " + collection.size());
        System.out.println("Is Empty? " + collection.isEmpty());
        System.out.println("---------------");

        Collection<PersonDto> collection2 = new HashSet<>();
        collection2.add(personDto1);
        collection2.add(personDto2);
        collection2.add(personDto3);
        collection2.add(personDto4);
        collection2.add(personDto5);
        System.out.println("HashSet<PersonDto>: " + collection2);
        collection1.remove(personDto4);
        System.out.println("After remove Akil: " + collection2);
        System.out.println("Contains Sneha? " + collection2.contains(personDto5));
        System.out.println("Size: " + collection2.size());
        System.out.println("Is Empty? " + collection2.isEmpty());
        System.out.println("---------------");


        Collection<PersonDto> collection3 = new HashSet<>();
        collection3.addAll(collection2);
        System.out.println("Copied collection2: " + collection3);
        collection3.removeAll(Arrays.asList(personDto1, personDto5));
        System.out.println("After removeAll: " + collection3);
        System.out.println("---------------");


        List<String> list1 = new LinkedList<>();
        list1.add("Monish");
        list1.add("Manya");
        list1.add("Vaishnavi");
        list1.add("Veena");

        System.out.println(list1);
        System.out.println("---------------");

        List<String> list = new ArrayList<>();
        list.add("Monish");
        list.add("Manya");
        list.add("Vaishnavi");
        list.add("Veena");

        System.out.println(list1);
        System.out.println("---------------");

        List<String> list2 = new LinkedList<>();
        list2.add("Monish");
        list2.add("Manya");
        list2.add("Vaishnavi");
        list2.add("Veena");
        System.out.println("LinkedList: " + list2);
        list2.remove("Manya");
        list2.addAll(Arrays.asList("Shiva", "Krishna"));
        list2.removeAll(Arrays.asList("Krishna"));
        System.out.println("After add/remove: " + list2);
        System.out.println("Size: " + list2.size());
        System.out.println("---------------");

        List<String> list3 = new ArrayList<>();
        list3.add("Monish");
        list3.add("Manya");
        list3.add("Vaishnavi");
        list3.add("Veena");
        list3.remove("Vaishnavi");
        list3.addAll(Arrays.asList("Geetha", "Harsha"));
        list3.removeAll(Arrays.asList("Harsha"));
        System.out.println("ArrayList: " + list3);
        System.out.println("Contains Veena? " + list.contains("Veena"));
        System.out.println("Size: " + list.size());
        System.out.println("---------------");

        Set<String> set = new TreeSet<>();
        set.add("Monish");
        set.add("Chandra");
        set.add("Aishwarya");
        set.add("Nayana");
        set.add("Bindu");

        System.out.println(set);
        System.out.println("---------------");

        Set<String> set1 = new LinkedHashSet<>();
        set1.add("Monish");
        set1.add("Chandra");
        set1.add("Aishwarya");
        set1.add("Nayana");
        set1.add("Bindu");

        System.out.println(set1);
        System.out.println("---------------");

        Set<String> set2 = new HashSet<>();
        set2.add("Monish");
        set2.add("Chandra");
        set2.add("Aishwarya");
        set2.add("Nayana");
        set2.add("Bindu");

        System.out.println(set2);
        System.out.println("---------------");

        Set<String> set3 = new TreeSet<>();
        set3.add("Monish");
        set3.add("Chandra");
        set3.add("Aishwarya");
        set3.add("Nayana");
        set3.add("Bindu");
        System.out.println("TreeSet: " + set3);
        set3.remove("Chandra");
        set3.addAll(Arrays.asList("Ram", "Lakshmi"));
        set3.removeAll(Arrays.asList("Ram"));
        System.out.println("After operations: " + set3);
        System.out.println("Contains Bindu? " + set.contains("Bindu"));
        System.out.println("Size: " + set.size());
        System.out.println("---------------");


        Set<String> set4 = new LinkedHashSet<>();
        set4.add("Monish");
        set4.add("Chandra");
        set4.add("Aishwarya");
        set4.add("Nayana");
        set4.add("Bindu");
        System.out.println("LinkedHashSet: " + set4);
        set4.remove("Monish");
        set4.addAll(Arrays.asList("Ravi", "Sneha"));
        set4.removeAll(Arrays.asList("Ravi"));
        System.out.println("After operations: " + set4);
        System.out.println("Size: " + set4.size());
        System.out.println("---------------");

        Set<String> set5 = new HashSet<>();
        set5.add("Monish");
        set5.add("Chandra");
        set5.add("Aishwarya");
        set5.add("Nayana");
        set5.add("Bindu");
        System.out.println("HashSet: " + set5);
        set5.remove("Aishwarya");
        set5.addAll(Arrays.asList("Mohan", "Kavya"));
        set5.removeAll(Arrays.asList("Kavya"));
        System.out.println("After operations: " + set5);
        System.out.println("Size: " + set5.size());
        System.out.println("---------------");



        SortedSet<String> sortedSet=new TreeSet<>();
        sortedSet.add("Monish");
        sortedSet.add("Chandra");
        sortedSet.add("Aishwarya");
        sortedSet.add("Nayana");
        sortedSet.add("Bindu");

        System.out.println(set);
        System.out.println("---------------");

        SortedSet<String> sortedSet1 = new TreeSet<>();
        sortedSet1.add("Monish");
        sortedSet1.add("Chandra");
        sortedSet1.add("Aishwarya");
        sortedSet1.add("Nayana");
        sortedSet1.add("Bindu");
        System.out.println("SortedSet: " + sortedSet1);
        sortedSet1.remove("Chandra");
        sortedSet1.addAll(Arrays.asList("Nikhil", "Sana"));
        sortedSet1.removeAll(Arrays.asList("Nikhil"));
        System.out.println("After operations: " + sortedSet1);
        System.out.println("Contains Sana? " + sortedSet1.contains("Sana"));
        System.out.println("Size: " + sortedSet1.size());
        System.out.println("Is Empty? " + sortedSet1.isEmpty());
        sortedSet1.clear();
        System.out.println("After clear: " + sortedSet1);
        System.out.println("Is Empty Now? " + sortedSet1.isEmpty());
        System.out.println("---------------");


    }
}
