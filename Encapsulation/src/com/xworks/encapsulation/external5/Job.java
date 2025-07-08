package com.xworks.encapsulation.external5;

import com.xworks.encapsulation.internal5.Occupation;

public class Job {
    public void jb() {
        Occupation occupation = new Occupation();
        System.out.println("Type: " + occupation.getType());
        System.out.println("Salary: " + occupation.getSalary());
        System.out.println("Location: " + occupation.getLocation());
        System.out.println("Remote: " + occupation.isRemote());
        System.out.println("Experience: " + occupation.getExperience());
    }
}
