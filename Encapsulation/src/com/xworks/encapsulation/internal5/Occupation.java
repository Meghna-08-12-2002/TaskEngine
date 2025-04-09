package com.xworks.encapsulation.internal5;

public class Occupation {
    private String type = "Engineer";
    private int salary = 50000;
    private String location = "Bangalore";
    private boolean remote = true;
    private int experience = 3;

    public Occupation() {
        System.out.println("running inside Occupation");
    }

    void setType(String type) {
        this.type = type;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setRemote(boolean remote) {
        this.remote = remote;
    }

    void setExperience(int experience) {
        this.experience = experience;
    }

    public String getType() {
        return type;
    }

    public int getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }

    public boolean isRemote() {
        return remote;
    }

    public int getExperience() {
        return experience;
    }
}
