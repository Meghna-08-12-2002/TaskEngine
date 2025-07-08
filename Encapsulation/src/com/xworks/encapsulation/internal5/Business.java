package com.xworks.encapsulation.internal5;

public class Business {
    public void bns() {
        Occupation occupation = new Occupation();
        System.out.println("Type: " + occupation.getType());
        System.out.println("Salary: " + occupation.getSalary());
        System.out.println("Location: " + occupation.getLocation());
        System.out.println("Remote: " + occupation.isRemote());
        System.out.println("Experience: " + occupation.getExperience());

        occupation.setType("Developer");
        occupation.setSalary(80000);
        occupation.setLocation("Hyderabad");
        occupation.setRemote(false);
        occupation.setExperience(5);

        System.out.println("Updated Type: " + occupation.getType());
    }
}
