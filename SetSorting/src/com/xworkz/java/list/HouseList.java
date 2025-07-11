package com.xworkz.java.list;

import com.xworkz.java.dto.HouseDto;
import com.xworkz.java.dto.SecurityDto;

import java.util.LinkedList;
import java.util.List;

public class HouseList {
    public List<HouseDto> getHouseDtoList() {
        System.out.println("getHouseDtoList method in HouseDTOList");

        List<HouseDto> list = new LinkedList<>();

        SecurityList securityDTOList = new SecurityList();
        List<SecurityDto> securityList = securityDTOList.getSecurityList();

        HouseDto houseDto1 = new HouseDto("123 Main Street", "Blue", 4, securityList.get(0));
        HouseDto houseDto2 = new HouseDto("456 Oak Avenue", "Green", 3, securityList.get(1));
        HouseDto houseDto3 = new HouseDto("789 Pine Road", "White", 5, securityList.get(2));
        HouseDto houseDto4 = new HouseDto("101 Maple Street", "Yellow", 2, securityList.get(3));
        HouseDto houseDto5 = new HouseDto("202 Birch Blvd", "Red", 3, securityList.get(4));
        HouseDto houseDto6 = new HouseDto("303 Cedar Lane", "Cream", 4, securityList.get(5));
        HouseDto houseDto7 = new HouseDto("404 Elm Drive", "Pink", 5, securityList.get(6));
        HouseDto houseDto8 = new HouseDto("505 Walnut Way", "Orange", 2, securityList.get(7));
        HouseDto houseDto9 = new HouseDto("606 Cherry Circle", "Purple", 3, securityList.get(8));
        HouseDto houseDto10 = new HouseDto("707 Poplar Street", "Gray", 4, securityList.get(9));
        HouseDto houseDto11 = new HouseDto("808 Chestnut Road", "Teal", 5, securityList.get(10));
        HouseDto houseDto12 = new HouseDto("909 Spruce Avenue", "Lavender", 3, securityList.get(11));
        HouseDto houseDto13 = new HouseDto("111 Fir Lane", "Beige", 2, securityList.get(12));
        HouseDto houseDto14 = new HouseDto("121 Redwood Blvd", "Sky Blue", 4, securityList.get(13));
        HouseDto houseDto15 = new HouseDto("131 Cypress Street", "Navy", 5, securityList.get(14));
        HouseDto houseDto16 = new HouseDto("141 Dogwood Drive", "Brown", 3, securityList.get(15));
        HouseDto houseDto17 = new HouseDto("151 Willow Road", "Olive", 4, securityList.get(16));
        HouseDto houseDto18 = new HouseDto("161 Magnolia Lane", "Maroon", 2, securityList.get(17));
        HouseDto houseDto19 = new HouseDto("171 Aspen Circle", "Cyan", 3, securityList.get(18));
        HouseDto houseDto20 = new HouseDto("181 Alder Street", "Black", 5, securityList.get(19));
        HouseDto houseDto21 = new HouseDto("191 Beech Blvd", "Mint", 3, securityList.get(20));
        HouseDto houseDto22 = new HouseDto("201 Hickory Avenue", "Ivory", 4, securityList.get(21));
        HouseDto houseDto23 = new HouseDto("211 Cottonwood Lane", "Violet", 5, securityList.get(22));
        HouseDto houseDto24 = new HouseDto("221 Sycamore Street", "Charcoal", 3, securityList.get(23));
        HouseDto houseDto25 = new HouseDto("231 Sequoia Road", "Turquoise", 4, securityList.get(24));
        HouseDto houseDto26 = new HouseDto("241 Juniper Circle", "Peach", 2, securityList.get(25));
        HouseDto houseDto27 = new HouseDto("251 Larch Drive", "Rust", 3, securityList.get(26));
        HouseDto houseDto28 = new HouseDto("261 Tamarack Street", "Tan", 4, securityList.get(27));
        HouseDto houseDto29 = new HouseDto("271 Hazel Avenue", "Steel Blue", 5, securityList.get(28));
        HouseDto houseDto30 = new HouseDto("281 Buckeye Blvd", "Plum", 3, securityList.get(29));

        list.add(houseDto1);
        list.add(houseDto2);
        list.add(houseDto3);
        list.add(houseDto4);
        list.add(houseDto5);
        list.add(houseDto6);
        list.add(houseDto7);
        list.add(houseDto8);
        list.add(houseDto9);
        list.add(houseDto10);
        list.add(houseDto11);
        list.add(houseDto12);
        list.add(houseDto13);
        list.add(houseDto14);
        list.add(houseDto15);
        list.add(houseDto16);
        list.add(houseDto17);
        list.add(houseDto18);
        list.add(houseDto19);
        list.add(houseDto20);
        list.add(houseDto21);
        list.add(houseDto22);
        list.add(houseDto23);
        list.add(houseDto24);
        list.add(houseDto25);
        list.add(houseDto26);
        list.add(houseDto27);
        list.add(houseDto28);
        list.add(houseDto29);
        list.add(houseDto30);

        return list;
    }
}
