package com.xworkz.spring.config;

import org.springframework.context.annotation.Bean;

import java.util.*;

public class InstancesConfiguration {
    public InstancesConfiguration()
    {
        System.out.println("InstancesConfiguration constructor");
    }

    @Bean
    public ArrayList<String> arrayList1() {
        System.out.println("arrayList1");
        return new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
    }

    @Bean
    public ArrayList<String> arrayList2() {
        System.out.println("arrayList2");
        return new ArrayList<>(Arrays.asList("Circle", "Square", "Triangle"));
    }

    @Bean
    public ArrayList<String> arrayList3() {
        System.out.println("arrayList3");
        return new ArrayList<>(Arrays.asList("Dog", "Cat", "Rabbit"));
    }

    @Bean
    public ArrayList<String> arrayList4() {
        System.out.println("arrayList4");
        return new ArrayList<>(Arrays.asList("Pen", "Pencil", "Marker"));
    }

    @Bean
    public ArrayList<String> arrayList5() {
        System.out.println("arrayList5");
        return new ArrayList<>(Arrays.asList("Sun", "Moon", "Star"));
    }

    // LinkedLists
    @Bean
    public LinkedList<String> linkedList1() {
        System.out.println("linkedList1");
        return new LinkedList<>(Arrays.asList("Iron", "Gold", "Silver"));
    }

    @Bean
    public LinkedList<String> linkedList2() {
        System.out.println("linkedList2");
        return new LinkedList<>(Arrays.asList("Milk", "Water", "Juice"));
    }

    @Bean
    public LinkedList<String> linkedList3() {
        System.out.println("linkedList3");
        return new LinkedList<>(Arrays.asList("Apple", "Orange", "Grapes"));
    }

    @Bean
    public LinkedList<String> linkedList4() {
        System.out.println("linkedList4");
        return new LinkedList<>(Arrays.asList("Train", "Bus", "Car"));
    }

    @Bean
    public LinkedList<String> linkedList5() {
        System.out.println("linkedList5");
        return new LinkedList<>(Arrays.asList("Table", "Chair", "Sofa"));
    }

    // HashSets
    @Bean
    public HashSet<String> hashSet1() {
        System.out.println("hashSet1");
        return new HashSet<>(Arrays.asList("Earth", "Mars"));
    }

    @Bean
    public HashSet<String> hashSet2() {
        System.out.println("hashSet2");
        return new HashSet<>(Arrays.asList("Venus", "Jupiter"));
    }

    @Bean
    public HashSet<String> hashSet3() {
        System.out.println("hashSet3");
        return new HashSet<>(Arrays.asList("Saturn", "Neptune"));
    }

    @Bean
    public HashSet<String> hashSet4() {
        System.out.println("hashSet4");
        return new HashSet<>(Arrays.asList("Uranus", "Pluto"));
    }

    @Bean
    public HashSet<String> hashSet5() {
        System.out.println("hashSet5");
        return new HashSet<>(Arrays.asList("Comet", "Asteroid"));
    }

    // LinkedHashSets
    @Bean
    public LinkedHashSet<String> linkedHashSet1() {
        System.out.println("linkedHashSet1");
        return new LinkedHashSet<>(Arrays.asList("Rose", "Lily"));
    }

    @Bean
    public LinkedHashSet<String> linkedHashSet2() {
        System.out.println("linkedHashSet2");
        return new LinkedHashSet<>(Arrays.asList("Tulip", "Jasmine"));
    }

    @Bean
    public LinkedHashSet<String> linkedHashSet3() {
        System.out.println("linkedHashSet3");
        return new LinkedHashSet<>(Arrays.asList("Orchid", "Sunflower"));
    }

    @Bean
    public LinkedHashSet<String> linkedHashSet4() {
        System.out.println("linkedHashSet4");
        return new LinkedHashSet<>(Arrays.asList("Daisy", "Marigold"));
    }

    @Bean
    public LinkedHashSet<String> linkedHashSet5() {
        System.out.println("linkedHashSet5");
        return new LinkedHashSet<>(Arrays.asList("Lavender", "Peony"));
    }

    // TreeSets
    @Bean
    public TreeSet<String> treeSet1() {
        System.out.println("treeSet1");
        return new TreeSet<>(Arrays.asList("HTML", "CSS"));
    }

    @Bean
    public TreeSet<String> treeSet2() {
        System.out.println("treeSet2");
        return new TreeSet<>(Arrays.asList("JavaScript", "TypeScript"));
    }

    @Bean
    public TreeSet<String> treeSet3() {
        System.out.println("treeSet3");
        return new TreeSet<>(Arrays.asList("Angular", "React"));
    }

    @Bean
    public TreeSet<String> treeSet4() {
        System.out.println("treeSet4");
        return new TreeSet<>(Arrays.asList("Vue", "Svelte"));
    }

    @Bean
    public TreeSet<String> treeSet5() {
        System.out.println("treeSet5");
        return new TreeSet<>(Arrays.asList("Next.js", "Nuxt.js"));
    }

    // HashMaps
    // HashMaps
    @Bean
    public HashMap<String, String> hashMap1() {
        System.out.println("hashMap1");
        HashMap<String, String> map = new HashMap<>();
        map.put("Code", "Java");
        map.put("Platform", "Spring");
        return map;
    }

    @Bean
    public HashMap<String, String> hashMap2() {
        System.out.println("hashMap2");
        HashMap<String, String> map = new HashMap<>();
        map.put("Build", "Maven");
        map.put("Deploy", "Jenkins");
        return map;
    }

    @Bean
    public HashMap<String, String> hashMap3() {
        System.out.println("hashMap3");
        HashMap<String, String> map = new HashMap<>();
        map.put("Container", "Docker");
        map.put("Cloud", "AWS");
        return map;
    }

    @Bean
    public HashMap<String, String> hashMap4() {
        System.out.println("hashMap4");
        HashMap<String, String> map = new HashMap<>();
        map.put("OS", "Linux");
        map.put("Editor", "VSCode");
        return map;
    }

    @Bean
    public HashMap<String, String> hashMap5() {
        System.out.println("hashMap5");
        HashMap<String, String> map = new HashMap<>();
        map.put("Browser", "Chrome");
        map.put("Database", "MySQL");
        return map;
    }

    // LinkedHashMaps
    @Bean
    public LinkedHashMap<String, String> linkedHashMap1() {
        System.out.println("linkedHashMap1");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("ID", "001");
        map.put("Name", "Alice");
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMap2() {
        System.out.println("linkedHashMap2");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("ID", "002");
        map.put("Name", "Bob");
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMap3() {
        System.out.println("linkedHashMap3");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("ID", "003");
        map.put("Name", "Carol");
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMap4() {
        System.out.println("linkedHashMap4");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("ID", "004");
        map.put("Name", "Dave");
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMap5() {
        System.out.println("linkedHashMap5");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("ID", "005");
        map.put("Name", "Eve");
        return map;
    }

    // TreeMaps
    @Bean
    public TreeMap<String, String> treeMap1() {
        System.out.println("treeMap1");
        TreeMap<String, String> map = new TreeMap<>();
        map.put("OS", "Windows");
        map.put("IDE", "IntelliJ");
        return map;
    }

    @Bean
    public TreeMap<String, String> treeMap2() {
        System.out.println("treeMap2");
        TreeMap<String, String> map = new TreeMap<>();
        map.put("Tool", "Git");
        map.put("Version", "2.40");
        return map;
    }

    @Bean
    public TreeMap<String, String> treeMap3() {
        System.out.println("treeMap3");
        TreeMap<String, String> map = new TreeMap<>();
        map.put("API", "REST");
        map.put("Format", "JSON");
        return map;
    }

    @Bean
    public TreeMap<String, String> treeMap4() {
        System.out.println("treeMap4");
        TreeMap<String, String> map = new TreeMap<>();
        map.put("Framework", "SpringBoot");
        map.put("Lang", "Java");
        return map;
    }

    @Bean
    public TreeMap<String, String> treeMap5() {
        System.out.println("treeMap5");
        TreeMap<String, String> map = new TreeMap<>();
        map.put("Port", "8080");
        map.put("Status", "Running");
        return map;
    }

    // Properties
    @Bean
    public Properties properties1() {
        System.out.println("properties1");
        Properties p = new Properties();
        p.setProperty("app", "InventorySystem");
        p.setProperty("ver", "2.1");
        return p;
    }

    @Bean
    public Properties properties2() {
        System.out.println("properties2");
        Properties p = new Properties();
        p.setProperty("author", "Meghna");
        p.setProperty("license", "MIT");
        return p;
    }

    @Bean
    public Properties properties3() {
        System.out.println("properties3");
        Properties p = new Properties();
        p.setProperty("support", "24x7");
        p.setProperty("region", "Asia");
        return p;
    }

    @Bean
    public Properties properties4() {
        System.out.println("properties4");
        Properties p = new Properties();
        p.setProperty("theme", "Dark");
        p.setProperty("language", "English");
        return p;
    }

    @Bean
    public Properties properties5() {
        System.out.println("properties5");
        Properties p = new Properties();
        p.setProperty("backup", "Enabled");
        p.setProperty("autosave", "True");
        return p;
    }

    // Hashtables
    @Bean
    public Hashtable<String, String> hashtable1() {
        System.out.println("hashtable1");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("K1", "KeyOne");
        table.put("K2", "KeyTwo");
        return table;
    }

    @Bean
    public Hashtable<String, String> hashtable2() {
        System.out.println("hashtable2");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("K3", "KeyThree");
        table.put("K4", "KeyFour");
        return table;
    }

    @Bean
    public Hashtable<String, String> hashtable3() {
        System.out.println("hashtable3");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("K5", "KeyFive");
        table.put("K6", "KeySix");
        return table;
    }

    @Bean
    public Hashtable<String, String> hashtable4() {
        System.out.println("hashtable4");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("K7", "KeySeven");
        table.put("K8", "KeyEight");
        return table;
    }

    @Bean
    public Hashtable<String, String> hashtable5() {
        System.out.println("hashtable5");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("K9", "KeyNine");
        table.put("K10", "KeyTen");
        return table;
    }

    // Arrays
    @Bean
    public String[] namesArray1() {
        System.out.println("namesArray1");
        return new String[]{"Lion", "Tiger", "Bear"};
    }

    @Bean
    public String[] namesArray2() {
        System.out.println("namesArray2");
        return new String[]{"Shark", "Whale", "Dolphin"};
    }

    @Bean
    public String[] namesArray3() {
        System.out.println("namesArray3");
        return new String[]{"Ant", "Bee", "Spider"};
    }

    @Bean
    public String[] namesArray4() {
        System.out.println("namesArray4");
        return new String[]{"Eagle", "Owl", "Parrot"};
    }

    @Bean
    public String[] namesArray5() {
        System.out.println("namesArray5");
        return new String[]{"Fox", "Wolf", "Panther"};
    }

}
