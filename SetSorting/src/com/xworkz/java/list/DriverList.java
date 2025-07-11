package com.xworkz.java.list;

import com.xworkz.java.dto.DriverDto;
import com.xworkz.java.dto.VehicleDto;

import java.util.LinkedList;
import java.util.List;

public class DriverList {
    public List<DriverDto> getDriverList() {
        System.out.println("getDriverList method in DriverList");

        List<DriverDto> list = new LinkedList<>();
        VehicleList vehicleListObj = new VehicleList();
        List<VehicleDto> vehicleList = vehicleListObj.getVehicleList();

        DriverDto driverDto1 = new DriverDto("Arumugam", 45, "TN01A1234", vehicleList.get(0));
        DriverDto driverDto2 = new DriverDto("Selvam", 39, "TN02B2345", vehicleList.get(1));
        DriverDto driverDto3 = new DriverDto("Kumaravel", 48, "TN03C3456", vehicleList.get(2));
        DriverDto driverDto4 = new DriverDto("Thangavel", 50, "TN04D4567", vehicleList.get(3));
        DriverDto driverDto5 = new DriverDto("Periyasamy", 42, "TN05E5678", vehicleList.get(4));
        DriverDto driverDto6 = new DriverDto("Dhanasekar", 46, "TN06F6789", vehicleList.get(5));
        DriverDto driverDto7 = new DriverDto("Ilango", 52, "TN07G7890", vehicleList.get(6));
        DriverDto driverDto8 = new DriverDto("Muthukumaran", 44, "TN08H8901", vehicleList.get(7));
        DriverDto driverDto9 = new DriverDto("Sankaran", 41, "TN09J9012", vehicleList.get(8));
        DriverDto driverDto10 = new DriverDto("Gopal", 38, "TN10K0123", vehicleList.get(9));
        DriverDto driverDto11 = new DriverDto("Ravichandran", 53, "TN11L1234", vehicleList.get(10));
        DriverDto driverDto12 = new DriverDto("Rajamani", 47, "TN12M2345", vehicleList.get(11));
        DriverDto driverDto13 = new DriverDto("Velmurugan", 45, "TN13N3456", vehicleList.get(12));
        DriverDto driverDto14 = new DriverDto("Sundararajan", 51, "TN14P4567", vehicleList.get(13));
        DriverDto driverDto15 = new DriverDto("Marimuthu", 49, "TN15Q5678", vehicleList.get(14));
        DriverDto driverDto16 = new DriverDto("Venkatesan", 43, "TN16R6789", vehicleList.get(15));
        DriverDto driverDto17 = new DriverDto("Natarajan", 40, "TN17S7890", vehicleList.get(16));
        DriverDto driverDto18 = new DriverDto("Annamalai", 46, "TN18T8901", vehicleList.get(17));
        DriverDto driverDto19 = new DriverDto("Pazhani", 44, "TN19U9012", vehicleList.get(18));
        DriverDto driverDto20 = new DriverDto("Sekar", 42, "TN20V0123", vehicleList.get(19));
        DriverDto driverDto21 = new DriverDto("Baskaran", 50, "TN21W1234", vehicleList.get(20));
        DriverDto driverDto22 = new DriverDto("Jayakumar", 47, "TN22X2345", vehicleList.get(21));
        DriverDto driverDto23 = new DriverDto("Manikandan", 39, "TN23Y3456", vehicleList.get(22));
        DriverDto driverDto24 = new DriverDto("Shanmugam", 43, "TN24Z4567", vehicleList.get(23));
        DriverDto driverDto25 = new DriverDto("Karthikeyan", 38, "TN25A5678", vehicleList.get(24));
        DriverDto driverDto26 = new DriverDto("Parthiban", 41, "TN26B6789", vehicleList.get(25));
        DriverDto driverDto27 = new DriverDto("Loganathan", 45, "TN27C7890", vehicleList.get(26));
        DriverDto driverDto28 = new DriverDto("Ramasamy", 44, "TN28D8901", vehicleList.get(27));
        DriverDto driverDto29 = new DriverDto("Ragunathan", 40, "TN29E9012", vehicleList.get(28));
        DriverDto driverDto30 = new DriverDto("Chandran", 52, "TN30F0123", vehicleList.get(29));

        list.add(driverDto1);
        list.add(driverDto2);
        list.add(driverDto3);
        list.add(driverDto4);
        list.add(driverDto5);
        list.add(driverDto6);
        list.add(driverDto7);
        list.add(driverDto8);
        list.add(driverDto9);
        list.add(driverDto10);
        list.add(driverDto11);
        list.add(driverDto12);
        list.add(driverDto13);
        list.add(driverDto14);
        list.add(driverDto15);
        list.add(driverDto16);
        list.add(driverDto17);
        list.add(driverDto18);
        list.add(driverDto19);
        list.add(driverDto20);
        list.add(driverDto21);
        list.add(driverDto22);
        list.add(driverDto23);
        list.add(driverDto24);
        list.add(driverDto25);
        list.add(driverDto26);
        list.add(driverDto27);
        list.add(driverDto28);
        list.add(driverDto29);
        list.add(driverDto30);

        return list;
    }
}
