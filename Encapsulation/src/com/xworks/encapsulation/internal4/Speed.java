package com.xworks.encapsulation.internal4;

public class Speed {
    public void spd() {
        PostOffice po = new PostOffice();
        System.out.println("Location: " + po.getLocation());
        System.out.println("Pincode: " + po.getPinCode());
        System.out.println("Head Officer: " + po.getHeadOfficer());
        System.out.println("24x7 Service: " + po.getIs24Hours());
        System.out.println("Staff Count: " + po.getStaffCount());

        po.setLocation("Brigade Road");
        po.setPinCode(560042);
        po.setHeadOfficer("Ms. Rani");
        po.setIs24Hours(true);
        po.setStaffCount(25);

        System.out.println("Updated Location: " + po.getLocation());
    }
}
