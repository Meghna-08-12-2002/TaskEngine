package com.xworkz.java;

public class Army {
    int id;
    String division;
    String rank;
    int personnel;
    boolean active;
    double budget;
    String location;
    boolean specialForces;
    String missionType;
    String country;

    public Army() {
        this(1001);
    }

    public Army(int id) {
        this(id, "Reconnaissance");
    }

    public Army(int id, String division) {
        this(id, division, "Sergeant");
    }

    public Army(int id, String division, String rank) {
        this(id, division, rank, 450);
    }

    public Army(int id, String division, String rank, int personnel) {
        this(id, division, rank, personnel, false);
    }

    public Army(int id, String division, String rank, int personnel, boolean active) {
        this(id, division, rank, personnel, active, 4200000.0);
    }

    public Army(int id, String division, String rank, int personnel, boolean active, double budget) {
        this(id, division, rank, personnel, active, budget, "Border Post");
    }

    public Army(int id, String division, String rank, int personnel, boolean active, double budget, String location) {
        this(id, division, rank, personnel, active, budget, location, true);
    }

    public Army(int id, String division, String rank, int personnel, boolean active, double budget, String location, boolean specialForces) {
        this(id, division, rank, personnel, active, budget, location, specialForces, "Tactical Operations");
    }

    public Army(int id, String division, String rank, int personnel, boolean active, double budget, String location, boolean specialForces, String missionType) {
        this(id, division, rank, personnel, active, budget, location, specialForces, missionType, "National");
    }

    public Army(int id, String division, String rank, int personnel, boolean active, double budget, String location, boolean specialForces, String missionType, String country) {
        this.id = id;
        this.division = division;
        this.rank = rank;
        this.personnel = personnel;
        this.active = active;
        this.budget = budget;
        this.location = location;
        this.specialForces = specialForces;
        this.missionType = missionType;
        this.country = country;
    }

    public void displayInfo() {
        System.out.println("Army Details:");
        System.out.println("ID: " + id);
        System.out.println("Division: " + division);
        System.out.println("Rank: " + rank);
        System.out.println("Personnel: " + personnel);
        System.out.println("Active: " + active);
        System.out.println("Budget: $" + budget);
        System.out.println("Location: " + location);
        System.out.println("Special Forces: " + specialForces);
        System.out.println("Mission Type: " + missionType);
        System.out.println("Country: " + country);
    }
}
