package com.xworkz.java.runner;

import com.xworkz.java.dto.SweetDto;

import java.util.*;

public class SweetRunner {
    public static void main(String[] args) {
        Set<SweetDto> sweetSet = new HashSet<>();

        sweetSet.add(new SweetDto("Mysore Pak", 200, new String[]{"ghee", "besan", "sugar", "milk", "cardamom"}, 10, "Box"));
        sweetSet.add(new SweetDto("Besan", 150, new String[]{"flour", "ghee", "sugar", "saffron", "cashew"}, 20, "Wrap"));
        sweetSet.add(new SweetDto("Barfi", 180, new String[]{"milk", "sugar", "cardamom", "nuts", "silver"}, 15, "Wrap"));
        sweetSet.add(new SweetDto("Rasgulla", 220, new String[]{"chhena", "sugar", "water", "rose", "essence"}, 25, "Tin"));
        sweetSet.add(new SweetDto("Jalebi", 210, new String[]{"maida", "sugar", "ghee", "curd", "saffron"}, 12, "Packet"));
        sweetSet.add(new SweetDto("Halwa", 190, new String[]{"wheat", "ghee", "sugar", "milk", "dry fruit"}, 14, "Box"));
        sweetSet.add(new SweetDto("Kaju Katli", 300, new String[]{"cashew", "sugar", "ghee", "cardamom", "milk"}, 8, "Pack"));
        sweetSet.add(new SweetDto("Peda", 170, new String[]{"milk", "sugar", "cardamom", "ghee", "essence"}, 11, "Box"));
        sweetSet.add(new SweetDto("Cham Cham", 230, new String[]{"chhena", "sugar", "rose", "milk", "color"}, 9, "Tin"));
        sweetSet.add(new SweetDto("Sandesh", 240, new String[]{"milk", "sugar", "chhena", "cardamom", "nuts"}, 10, "Wrap"));
        sweetSet.add(new SweetDto("Badam Halwa", 260, new String[]{"badam", "ghee", "sugar", "milk", "saffron"}, 6, "Box"));
        sweetSet.add(new SweetDto("Imarti", 195, new String[]{"urad", "sugar", "ghee", "cardamom", "saffron"}, 7, "Pack"));
        sweetSet.add(new SweetDto("Modak", 210, new String[]{"rice", "jaggery", "coconut", "ghee", "cardamom"}, 13, "Pack"));
        sweetSet.add(new SweetDto("Kheer", 185, new String[]{"rice", "milk", "sugar", "cardamom", "nuts"}, 15, "Bowl"));
        sweetSet.add(new SweetDto("Malpua", 220, new String[]{"flour", "milk", "sugar", "cardamom", "ghee"}, 9, "Wrap"));
        sweetSet.add(new SweetDto("Sohan Papdi", 170, new String[]{"flour", "ghee", "sugar", "cardamom", "pistachio"}, 11, "Box"));
        sweetSet.add(new SweetDto("Kalakand", 250, new String[]{"milk", "sugar", "paneer", "cardamom", "nuts"}, 12, "Wrap"));
        sweetSet.add(new SweetDto("Kharwas", 160, new String[]{"colostrum", "sugar", "cardamom", "saffron", "milk"}, 6, "Cup"));
        sweetSet.add(new SweetDto("Shrikhand", 190, new String[]{"yogurt", "sugar", "cardamom", "saffron", "milk"}, 10, "Cup"));
        sweetSet.add(new SweetDto("Basundi", 210, new String[]{"milk", "sugar", "cardamom", "nuts", "saffron"}, 8, "Cup"));
        sweetSet.add(new SweetDto("Gulab Jamun", 250, new String[]{"milk powder", "ghee", "sugar", "cardamom", "flour"}, 12, "Tin"));
        sweetSet.add(new SweetDto("Paneer Jalebi", 230, new String[]{"paneer", "sugar", "ghee", "saffron", "maida"}, 8, "Box"));
        sweetSet.add(new SweetDto("Balushahi", 220, new String[]{"flour", "ghee", "sugar", "curd", "soda"}, 7, "Wrap"));
        sweetSet.add(new SweetDto("Chiroti", 180, new String[]{"flour", "ghee", "sugar", "cardamom", "semolina"}, 11, "Box"));
        sweetSet.add(new SweetDto("Til Laddu", 160, new String[]{"til", "jaggery", "cardamom", "ghee", "peanut"}, 10, "Wrap"));
        sweetSet.add(new SweetDto("Anarsa", 175, new String[]{"rice", "jaggery", "ghee", "poppy", "cardamom"}, 6, "Pack"));
        sweetSet.add(new SweetDto("Patishapta", 200, new String[]{"flour", "milk", "coconut", "jaggery", "ghee"}, 9, "Box"));
        sweetSet.add(new SweetDto("Rasmalai", 270, new String[]{"milk", "sugar", "saffron", "cardamom", "paneer"}, 10, "Cup"));
        sweetSet.add(new SweetDto("Gujiya", 185, new String[]{"maida", "coconut", "sugar", "khoya", "cardamom"}, 13, "Wrap"));
        sweetSet.add(new SweetDto("Besan",154,new String[]{"besan","sugar","ghee","cardamom", "milk"},12,"Wrap"));

        Comparator<SweetDto> priceDescComparator = Comparator
                .comparing(SweetDto::getPrice, Comparator.reverseOrder());
        Set<SweetDto> sortedSet = new TreeSet<>(priceDescComparator);
        sortedSet.addAll(sweetSet);
        System.out.println("Sweets Sorted by Price (Descending)");
        sortedSet.forEach(System.out::println);
        System.out.println("------------------------------------------------------------------");

        Comparator<SweetDto> namePriceDescComparator = Comparator
                .comparing(SweetDto::getName, Comparator.reverseOrder())
                .thenComparing(SweetDto::getPrice, Comparator.reverseOrder());
        Set<SweetDto> sort = new TreeSet<>(namePriceDescComparator);
        sort.addAll(sweetSet);
        System.out.println("Sweets Sorted by Name and Price (Descending)");
        sortedSet.forEach(System.out::println);
        System.out.println("------------------------------------------------------------------");

        LinkedList<SweetDto> sweetList = new LinkedList<>(sortedSet);

        System.out.println("Converted LinkedList:");
        sweetList.forEach(System.out::println);


    }
}
