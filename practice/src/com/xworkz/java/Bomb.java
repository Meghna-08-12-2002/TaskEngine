package com.xworkz.java;

public class Bomb {
        public static void details(String type, double weight, String material, double blastRadius, boolean remoteControlled,
                                   String fuseType, double detonationTime, String explosiveType, String countryOfOrigin, boolean waterproof) {
            System.out.println("Type: " + type + ", Weight: " + weight + "kg, Material: " + material +
                    ", Blast Radius: " + blastRadius + "m, Remote Controlled: " + remoteControlled +
                    ", Fuse Type: " + fuseType + ", Detonation Time: " + detonationTime + "s" +
                    ", Explosive Type: " + explosiveType + ", Country of Origin: " + countryOfOrigin +
                    ", Waterproof: " + waterproof);
        }
    }
