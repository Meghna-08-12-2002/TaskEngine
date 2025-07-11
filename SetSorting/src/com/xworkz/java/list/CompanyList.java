package com.xworkz.java.list;

import com.xworkz.java.dto.CEODto;
import com.xworkz.java.dto.CompanyDto;

import java.util.LinkedList;
import java.util.List;

public class CompanyList {
    public List<CompanyDto> getCompanyList() {
        System.out.println("getCompanyList method in CompanyList");

        List<CompanyDto> list = new LinkedList<>();

        CEOList ceoListObj = new CEOList();
        List<CEODto> ceoList = ceoListObj.getCEOList();

        CompanyDto companyDto1 = new CompanyDto("TechNova", "IT", 500, ceoList.get(0));
        CompanyDto companyDto2 = new CompanyDto("InnoCore", "Finance", 300, ceoList.get(1));
        CompanyDto companyDto3 = new CompanyDto("GreenFusion", "Energy", 450, ceoList.get(2));
        CompanyDto companyDto4 = new CompanyDto("MediPlus", "Healthcare", 600, ceoList.get(3));
        CompanyDto companyDto5 = new CompanyDto("AgroLine", "Agriculture", 250, ceoList.get(4));
        CompanyDto companyDto6 = new CompanyDto("SkyNetics", "Aerospace", 700, ceoList.get(5));
        CompanyDto companyDto7 = new CompanyDto("AutoCraft", "Automobile", 800, ceoList.get(6));
        CompanyDto companyDto8 = new CompanyDto("DataHive", "IT", 520, ceoList.get(7));
        CompanyDto companyDto9 = new CompanyDto("FinEdge", "Finance", 330, ceoList.get(8));
        CompanyDto companyDto10 = new CompanyDto("PowerPulse", "Energy", 470, ceoList.get(9));
        CompanyDto companyDto11 = new CompanyDto("CureWell", "Healthcare", 620, ceoList.get(10));
        CompanyDto companyDto12 = new CompanyDto("FarmNest", "Agriculture", 270, ceoList.get(11));
        CompanyDto companyDto13 = new CompanyDto("OrbitX", "Aerospace", 710, ceoList.get(12));
        CompanyDto companyDto14 = new CompanyDto("DriveMax", "Automobile", 830, ceoList.get(13));
        CompanyDto companyDto15 = new CompanyDto("CodeWave", "IT", 540, ceoList.get(14));
        CompanyDto companyDto16 = new CompanyDto("BankSphere", "Finance", 350, ceoList.get(15));
        CompanyDto companyDto17 = new CompanyDto("SolarGrid", "Energy", 490, ceoList.get(16));
        CompanyDto companyDto18 = new CompanyDto("MediCore", "Healthcare", 640, ceoList.get(17));
        CompanyDto companyDto19 = new CompanyDto("CropWise", "Agriculture", 280, ceoList.get(18));
        CompanyDto companyDto20 = new CompanyDto("AeroGen", "Aerospace", 720, ceoList.get(19));
        CompanyDto companyDto21 = new CompanyDto("TorqueMotors", "Automobile", 850, ceoList.get(20));
        CompanyDto companyDto22 = new CompanyDto("SoftNest", "IT", 560, ceoList.get(21));
        CompanyDto companyDto23 = new CompanyDto("CashWise", "Finance", 360, ceoList.get(22));
        CompanyDto companyDto24 = new CompanyDto("VoltStream", "Energy", 500, ceoList.get(23));
        CompanyDto companyDto25 = new CompanyDto("MediCure", "Healthcare", 660, ceoList.get(24));
        CompanyDto companyDto26 = new CompanyDto("AgriRoot", "Agriculture", 290, ceoList.get(25));
        CompanyDto companyDto27 = new CompanyDto("JetAxis", "Aerospace", 740, ceoList.get(26));
        CompanyDto companyDto28 = new CompanyDto("MotorEdge", "Automobile", 870, ceoList.get(27));
        CompanyDto companyDto29 = new CompanyDto("NextGenTech", "IT", 580, ceoList.get(28));
        CompanyDto companyDto30 = new CompanyDto("FinTrust", "Finance", 380, ceoList.get(29));

        list.add(companyDto1);
        list.add(companyDto2);
        list.add(companyDto3);
        list.add(companyDto4);
        list.add(companyDto5);
        list.add(companyDto6);
        list.add(companyDto7);
        list.add(companyDto8);
        list.add(companyDto9);
        list.add(companyDto10);
        list.add(companyDto11);
        list.add(companyDto12);
        list.add(companyDto13);
        list.add(companyDto14);
        list.add(companyDto15);
        list.add(companyDto16);
        list.add(companyDto17);
        list.add(companyDto18);
        list.add(companyDto19);
        list.add(companyDto20);
        list.add(companyDto21);
        list.add(companyDto22);
        list.add(companyDto23);
        list.add(companyDto24);
        list.add(companyDto25);
        list.add(companyDto26);
        list.add(companyDto27);
        list.add(companyDto28);
        list.add(companyDto29);
        list.add(companyDto30);

        return list;
    }
}