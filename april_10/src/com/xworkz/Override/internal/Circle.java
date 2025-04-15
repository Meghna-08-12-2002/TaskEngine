package com.xworkz.Override.internal;

public class Circle extends Shape {
    public Circle(){
        System.out.println("no argument constructor in Circle");
    }
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    public void rotate() {
        System.out.println("Rotation direction is not set");
    }
}
