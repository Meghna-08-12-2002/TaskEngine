package com.xworkz.java.runner;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Chair", 12);
        map.put("Table", 8);
        map.put("Fan", 20);
        map.put("Lamp", 6);
        map.put("Mirror", 15);
        map.put("Shelf", 10);
        map.put("Carpet", 5);

        System.out.println(map.get("Fan"));
        System.out.println("Map has Table: " + map.containsKey("Table"));
        System.out.println("Map has value 12: " + map.containsValue(12));
        System.out.println("Removed value: " + map.remove("Carpet"));
        System.out.println("Map Size: " + map.size());
        System.out.println("Map is empty: " + map.isEmpty());

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Clock", 18);
        map.putAll(map2);

        System.out.println(map.getOrDefault("Mirror", 0));

        System.out.println("Replaced value: " + map.replace("Clock", 22));
        System.out.println(map);

        map.putIfAbsent("Curtains", 30);
        System.out.println(map);

        map.computeIfPresent("Curtains", (k, v) -> v + 1);
        System.out.println(map);

        map.putIfAbsent("Lamp", 14);
        System.out.println(map);

        map.merge("Table", 3, Integer::sum);
        System.out.println(map);

        map.compute("Shelf", (k, v) -> v == null ? 10 : 16);
        System.out.println(map);
    }
}
