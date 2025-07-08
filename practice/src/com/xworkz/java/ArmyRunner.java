package com.xworkz.java;

public class ArmyRunner {
    public static void main(String[] args) {
        Army army1 = new Army();
        army1.displayInfo();

        Army army2 = new Army(1002);
        army2.displayInfo();

        Army army3 = new Army(1003, "Naval Infantry");
        army3.displayInfo();

        Army army4 = new Army(1004, "Air Defense", "Captain");
        army4.displayInfo();

        Army army5 = new Army(1005, "Special Operations", "Major", 620);
        army5.displayInfo();

        Army army6 = new Army(1006, "Cavalry", "Colonel", 275, true);
        army6.displayInfo();

        Army army7 = new Army(1007, "Armored Division", "Brigadier", 580, false, 7800000.0);
        army7.displayInfo();

        Army army8 = new Army(1008, "Signal Corps", "General", 1100, true, 9500000.0, "Main Base");
        army8.displayInfo();

        Army army9 = new Army(1009, "Medical Unit", "Lieutenant", 750, true, 4300000.0, "Forward Hospital", true);
        army9.displayInfo();

        Army army10 = new Army(1010, "Logistics Unit", "Major General", 1450, true, 22000000.0, "Supply Chain HQ", true, "Strategic Support");
        army10.displayInfo();

        Army army11 = new Army(1011, "Cyber Defense", "Field Marshal", 480, true, 52000000.0, "Cyber Command", true, "Network Security", "International");
        army11.displayInfo();
    }
}
