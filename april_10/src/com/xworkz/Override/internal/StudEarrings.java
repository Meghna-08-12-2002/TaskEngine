package com.xworkz.Override.internal;

public class StudEarrings extends Earrings {
    public StudEarrings() {
        System.out.println("No argument constructor in StudEarrings");
    }

    @Override
    public void wear() {
        System.out.println("Wearing stud earrings");
    }

    public void clean() {

            System.out.println("Cleaning the earrings");

    }
}
