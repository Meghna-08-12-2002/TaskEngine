package com.xworkz.java.list;

import com.xworkz.java.dto.CustomerDto;
import com.xworkz.java.dto.PassportDto;

import java.util.LinkedList;
import java.util.List;

public class CustomerList {
    public List<CustomerDto> getCustomerList() {
        System.out.println("getCustomerList method in CustomerList");

        List<CustomerDto> list = new LinkedList<>();

        PassportList passportListObj = new PassportList();
        List<PassportDto> passportList = passportListObj.getPassportList();

        CustomerDto customerDto1 = new CustomerDto("Arulmozhi", 34, "arulmozhi@email.com", passportList.get(0));
        CustomerDto customerDto2 = new CustomerDto("Kaviyarasi", 29, "kaviyarasi@email.com", passportList.get(1));
        CustomerDto customerDto3 = new CustomerDto("Ilamparithi", 41, "ilamparithi@email.com", passportList.get(2));
        CustomerDto customerDto4 = new CustomerDto("Nandhini", 27, "nandhini@email.com", passportList.get(3));
        CustomerDto customerDto5 = new CustomerDto("Thamizharasi", 38, "thamizharasi@email.com", passportList.get(4));
        CustomerDto customerDto6 = new CustomerDto("Velmurugan", 36, "velmurugan@email.com", passportList.get(5));
        CustomerDto customerDto7 = new CustomerDto("Yazhini", 31, "yazhini@email.com", passportList.get(6));
        CustomerDto customerDto8 = new CustomerDto("Senthil", 45, "senthil@email.com", passportList.get(7));
        CustomerDto customerDto9 = new CustomerDto("Madhumitha", 33, "madhumitha@email.com", passportList.get(8));
        CustomerDto customerDto10 = new CustomerDto("Sundarapandian", 39, "sundarapandian@email.com", passportList.get(9));
        CustomerDto customerDto11 = new CustomerDto("Divyabharathi", 26, "divya.b@email.com", passportList.get(10));
        CustomerDto customerDto12 = new CustomerDto("Iniyan", 42, "iniyan@email.com", passportList.get(11));
        CustomerDto customerDto13 = new CustomerDto("Meenatchi", 30, "meenatchi@email.com", passportList.get(12));
        CustomerDto customerDto14 = new CustomerDto("Perarasan", 37, "perarasan@email.com", passportList.get(13));
        CustomerDto customerDto15 = new CustomerDto("Kanmani", 28, "kanmani@email.com", passportList.get(14));
        CustomerDto customerDto16 = new CustomerDto("Ezhilarasi", 35, "ezhilarasi@email.com", passportList.get(15));
        CustomerDto customerDto17 = new CustomerDto("Pugazhendhi", 44, "pugazhendhi@email.com", passportList.get(16));
        CustomerDto customerDto18 = new CustomerDto("Selvalakshmi", 32, "selvalakshmi@email.com", passportList.get(17));
        CustomerDto customerDto19 = new CustomerDto("Aadhavan", 40, "aadhavan@email.com", passportList.get(18));
        CustomerDto customerDto20 = new CustomerDto("Kayalvizhi", 29, "kayalvizhi@email.com", passportList.get(19));
        CustomerDto customerDto21 = new CustomerDto("Thamizhchelvan", 43, "thamizhc@email.com", passportList.get(20));
        CustomerDto customerDto22 = new CustomerDto("Abinaya", 30, "abinaya@email.com", passportList.get(21));
        CustomerDto customerDto23 = new CustomerDto("Karthikeyan", 36, "karthik@email.com", passportList.get(22));
        CustomerDto customerDto24 = new CustomerDto("Nithyashree", 27, "nithya@email.com", passportList.get(23));
        CustomerDto customerDto25 = new CustomerDto("Sathuriyan", 38, "sathuriyan@email.com", passportList.get(24));
        CustomerDto customerDto26 = new CustomerDto("Manimegalai", 34, "manimegalai@email.com", passportList.get(25));
        CustomerDto customerDto27 = new CustomerDto("Vishnupriya", 31, "vishnupriya@email.com", passportList.get(26));
        CustomerDto customerDto28 = new CustomerDto("Ragupathi", 39, "ragupathi@email.com", passportList.get(27));
        CustomerDto customerDto29 = new CustomerDto("Janani", 33, "janani@email.com", passportList.get(28));
        CustomerDto customerDto30 = new CustomerDto("Vaishnavi", 28, "vaishnavi@email.com", passportList.get(29));

        list.add(customerDto1);
        list.add(customerDto2);
        list.add(customerDto3);
        list.add(customerDto4);
        list.add(customerDto5);
        list.add(customerDto6);
        list.add(customerDto7);
        list.add(customerDto8);
        list.add(customerDto9);
        list.add(customerDto10);
        list.add(customerDto11);
        list.add(customerDto12);
        list.add(customerDto13);
        list.add(customerDto14);
        list.add(customerDto15);
        list.add(customerDto16);
        list.add(customerDto17);
        list.add(customerDto18);
        list.add(customerDto19);
        list.add(customerDto20);
        list.add(customerDto21);
        list.add(customerDto22);
        list.add(customerDto23);
        list.add(customerDto24);
        list.add(customerDto25);
        list.add(customerDto26);
        list.add(customerDto27);
        list.add(customerDto28);
        list.add(customerDto29);
        list.add(customerDto30);

        return list;
    }
}
