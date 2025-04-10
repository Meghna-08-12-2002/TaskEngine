package com.xworkz.Override.internal;

public class StudEarrings extends Earrings {
    public StudEarrings() {
        System.out.println("No argument constructor in StudEarrings");
    }

    @Override
    public void wear() {
        System.out.println("Wearing stud earrings");
    }

    public void clean(Earrings earrings) {
        if (earrings != null) {
            System.out.println("Cleaning the earrings");
        } else {
            System.out.println("Earrings object is null, can't clean");
        }
    }
}
