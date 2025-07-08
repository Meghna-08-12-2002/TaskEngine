package com.xworks.encapsulation.external4;

import com.xworks.encapsulation.internal4.PostOffice;

public class Normal {
    public void nrml() {
        PostOffice po = new PostOffice();
        System.out.println("Location: " + po.getLocation());
        System.out.println("Pincode: " + po.getPinCode());
        System.out.println("Head Officer: " + po.getHeadOfficer());
        System.out.println("24x7 Service: " + po.getIs24Hours());
        System.out.println("Staff Count: " + po.getStaffCount());
    }
}
