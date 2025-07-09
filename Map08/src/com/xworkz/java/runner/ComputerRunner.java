package com.xworkz.java.runner;

import com.xworkz.java.dto.BrandDto;
import com.xworkz.java.dto.ComputerDto;

import java.util.HashMap;
import java.util.Map;

public class ComputerRunner {
    public static void main(String[] args) {
        ComputerDto c1 = new ComputerDto("Intel i7", 16, "Windows 11", "SN001");
        ComputerDto c2 = new ComputerDto("Intel i5", 8, "Windows 10", "SN002");
        ComputerDto c3 = new ComputerDto("Intel i3", 4, "Linux", "SN003");
        ComputerDto c4 = new ComputerDto("AMD Ryzen 5", 16, "Ubuntu", "SN004");
        ComputerDto c5 = new ComputerDto("AMD Ryzen 7", 32, "Windows 11", "SN005");
        ComputerDto c6 = new ComputerDto("Intel i9", 64, "Windows Server", "SN006");
        ComputerDto c7 = new ComputerDto("Intel i5", 16, "Linux Mint", "SN007");
        ComputerDto c8 = new ComputerDto("Intel i3", 8, "Fedora", "SN008");
        ComputerDto c9 = new ComputerDto("AMD Ryzen 3", 4, "Windows 10", "SN009");
        ComputerDto c10 = new ComputerDto("AMD Ryzen 9", 32, "Windows 11", "SN010");
        ComputerDto c11 = new ComputerDto("Intel i7", 8, "Zorin OS", "SN011");
        ComputerDto c12 = new ComputerDto("Intel i5", 16, "Windows 10", "SN012");
        ComputerDto c13 = new ComputerDto("Intel i9", 32, "Ubuntu", "SN013");
        ComputerDto c14 = new ComputerDto("AMD Ryzen 5", 8, "Windows 8", "SN014");
        ComputerDto c15 = new ComputerDto("Intel i3", 4, "Linux Lite", "SN015");
        ComputerDto c16 = new ComputerDto("Intel i7", 16, "Kali Linux", "SN016");
        ComputerDto c17 = new ComputerDto("AMD Ryzen 7", 16, "Pop!_OS", "SN017");
        ComputerDto c18 = new ComputerDto("Intel i9", 64, "Windows 11", "SN018");
        ComputerDto c19 = new ComputerDto("Intel i5", 8, "Windows 8.1", "SN019");
        ComputerDto c20 = new ComputerDto("AMD Ryzen 3", 8, "Linux", "SN020");
        ComputerDto c21 = new ComputerDto("Intel i7", 32, "Windows 10", "SN021");
        ComputerDto c22 = new ComputerDto("Intel i3", 8, "Ubuntu", "SN022");
        ComputerDto c23 = new ComputerDto("AMD Ryzen 9", 64, "Windows Server", "SN023");
        ComputerDto c24 = new ComputerDto("Intel i5", 4, "Elementary OS", "SN024");
        ComputerDto c25 = new ComputerDto("AMD Ryzen 5", 16, "Debian", "SN025");

        BrandDto b1 = new BrandDto("Dell", "USA", 1984, "Michael Dell");
        BrandDto b2 = new BrandDto("HP", "USA", 1939, "Enrique Lores");
        BrandDto b3 = new BrandDto("Lenovo", "China", 1984, "Yang Yuanqing");
        BrandDto b4 = new BrandDto("Apple", "USA", 1976, "Tim Cook");
        BrandDto b5 = new BrandDto("Asus", "Taiwan", 1989, "S.Y. Hsu");
        BrandDto b6 = new BrandDto("Acer", "Taiwan", 1976, "Jason Chen");
        BrandDto b7 = new BrandDto("Microsoft", "USA", 1975, "Satya Nadella");
        BrandDto b8 = new BrandDto("Samsung", "South Korea", 1938, "Jong-Hee Han");
        BrandDto b9 = new BrandDto("Sony", "Japan", 1946, "Kenichiro Yoshida");
        BrandDto b10 = new BrandDto("MSI", "Taiwan", 1986, "Charles Chiang");
        BrandDto b11 = new BrandDto("Toshiba", "Japan", 1875, "Tanaka Hisashige");
        BrandDto b12 = new BrandDto("LG", "South Korea", 1958, "Koo Kwang-mo");
        BrandDto b13 = new BrandDto("IBM", "USA", 1911, "Arvind Krishna");
        BrandDto b14 = new BrandDto("Razer", "USA", 2005, "Min-Liang Tan");
        BrandDto b15 = new BrandDto("Huawei", "China", 1987, "Ren Zhengfei");
        BrandDto b16 = new BrandDto("Alienware", "USA", 1996, "Frank Azor");
        BrandDto b17 = new BrandDto("Compaq", "USA", 1982, "Rod Canion");
        BrandDto b18 = new BrandDto("Panasonic", "Japan", 1918, "Yuki Kusumi");
        BrandDto b19 = new BrandDto("Fujitsu", "Japan", 1935, "Takahito Tokita");
        BrandDto b20 = new BrandDto("Gateway", "USA", 1985, "Ted Waitt");
        BrandDto b21 = new BrandDto("Sharp", "Japan", 1912, "Wu Po-hsuan");
        BrandDto b22 = new BrandDto("Xiaomi", "China", 2010, "Lei Jun");
        BrandDto b23 = new BrandDto("Zebronics", "India", 1997, "Rajesh Doshi");
        BrandDto b24 = new BrandDto("iBall", "India", 2001, "Sandeep Parasrampuria");
        BrandDto b25 = new BrandDto("HCL", "India", 1976, "C Vijayakumar");

        Map<ComputerDto, BrandDto> map = new HashMap<>();

        map.put(c1, b1);   map.put(c2, b2);   map.put(c3, b3);   map.put(c4, b4);   map.put(c5, b5);
        map.put(c6, b6);   map.put(c7, b7);   map.put(c8, b8);   map.put(c9, b9);   map.put(c10, b10);
        map.put(c11, b11); map.put(c12, b12); map.put(c13, b13); map.put(c14, b14); map.put(c15, b15);
        map.put(c16, b16); map.put(c17, b17); map.put(c18, b18); map.put(c19, b19); map.put(c20, b20);
        map.put(c21, b21); map.put(c22, b22); map.put(c23, b23); map.put(c24, b24); map.put(c25, b25);

        System.out.println("All Computer Keys:");
        map.keySet().forEach(System.out::println);

        System.out.println(" All Brand Values:");
        map.values().forEach(System.out::println);
    }
}
