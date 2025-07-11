package com.xworkz.java.list;

import com.xworkz.java.dto.CompanyDto;
import com.xworkz.java.dto.VehicleDto;

import java.util.LinkedList;
import java.util.List;

public class VehicleList {
    public List<VehicleDto> getVehicleList() {
        System.out.println("getVehicleList method in VehicleList");

        List<VehicleDto> list = new LinkedList<>();
        CompanyList companyDTOList = new CompanyList();
        List<CompanyDto> companyList = companyDTOList.getCompanyList();

        VehicleDto vehicleDto1 = new VehicleDto("Car", "Electric", "REG001", companyList.get(0));
        VehicleDto vehicleDto2 = new VehicleDto("SUV", "Diesel", "REG002", companyList.get(1));
        VehicleDto vehicleDto3 = new VehicleDto("SUV", "Petrol", "REG003", companyList.get(2));
        VehicleDto vehicleDto4 = new VehicleDto("SUV", "Petrol", "REG004", companyList.get(3));
        VehicleDto vehicleDto5 = new VehicleDto("SUV", "Diesel", "REG005", companyList.get(4));
        VehicleDto vehicleDto6 = new VehicleDto("Hatchback", "Petrol", "REG006", companyList.get(5));
        VehicleDto vehicleDto7 = new VehicleDto("Sedan", "Petrol", "REG007", companyList.get(6));
        VehicleDto vehicleDto8 = new VehicleDto("SUV", "Diesel", "REG008", companyList.get(7));
        VehicleDto vehicleDto9 = new VehicleDto("Compact SUV", "Petrol", "REG009", companyList.get(8));
        VehicleDto vehicleDto10 = new VehicleDto("SUV", "Diesel", "REG010", companyList.get(9));
        VehicleDto vehicleDto11 = new VehicleDto("SUV", "Diesel", "REG011", companyList.get(10));
        VehicleDto vehicleDto12 = new VehicleDto("Compact SUV", "Petrol", "REG012", companyList.get(11));
        VehicleDto vehicleDto13 = new VehicleDto("Compact SUV", "Petrol", "REG013", companyList.get(12));
        VehicleDto vehicleDto14 = new VehicleDto("SUV", "Petrol", "REG014", companyList.get(13));
        VehicleDto vehicleDto15 = new VehicleDto("SUV", "Petrol", "REG015", companyList.get(14));
        VehicleDto vehicleDto16 = new VehicleDto("SUV", "Petrol", "REG016", companyList.get(15));
        VehicleDto vehicleDto17 = new VehicleDto("SUV", "Diesel", "REG017", companyList.get(16));
        VehicleDto vehicleDto18 = new VehicleDto("Pickup", "Diesel", "REG018", companyList.get(17));
        VehicleDto vehicleDto19 = new VehicleDto("SUV", "Petrol", "REG019", companyList.get(18));
        VehicleDto vehicleDto20 = new VehicleDto("SUV", "Petrol", "REG020", companyList.get(19));
        VehicleDto vehicleDto21 = new VehicleDto("SUV", "Petrol", "REG021", companyList.get(20));
        VehicleDto vehicleDto22 = new VehicleDto("SUV", "Diesel", "REG022", companyList.get(21));
        VehicleDto vehicleDto23 = new VehicleDto("SUV", "Petrol", "REG023", companyList.get(22));
        VehicleDto vehicleDto24 = new VehicleDto("SUV", "Hybrid", "REG024", companyList.get(23));
        VehicleDto vehicleDto25 = new VehicleDto("Hatchback", "Petrol", "REG025", companyList.get(24));
        VehicleDto vehicleDto26 = new VehicleDto("Sports", "Petrol", "REG026", companyList.get(25));
        VehicleDto vehicleDto27 = new VehicleDto("SUV", "Petrol", "REG027", companyList.get(26));
        VehicleDto vehicleDto28 = new VehicleDto("SUV", "Petrol", "REG028", companyList.get(27));
        VehicleDto vehicleDto29 = new VehicleDto("SUV", "Petrol", "REG029", companyList.get(28));
        VehicleDto vehicleDto30 = new VehicleDto("Sports", "Petrol", "REG030", companyList.get(29));

        list.add(vehicleDto1);
        list.add(vehicleDto2);
        list.add(vehicleDto3);
        list.add(vehicleDto4);
        list.add(vehicleDto5);
        list.add(vehicleDto6);
        list.add(vehicleDto7);
        list.add(vehicleDto8);
        list.add(vehicleDto9);
        list.add(vehicleDto10);
        list.add(vehicleDto11);
        list.add(vehicleDto12);
        list.add(vehicleDto13);
        list.add(vehicleDto14);
        list.add(vehicleDto15);
        list.add(vehicleDto16);
        list.add(vehicleDto17);
        list.add(vehicleDto18);
        list.add(vehicleDto19);
        list.add(vehicleDto20);
        list.add(vehicleDto21);
        list.add(vehicleDto22);
        list.add(vehicleDto23);
        list.add(vehicleDto24);
        list.add(vehicleDto25);
        list.add(vehicleDto26);
        list.add(vehicleDto27);
        list.add(vehicleDto28);
        list.add(vehicleDto29);
        list.add(vehicleDto30);

        return list;
    }
}
