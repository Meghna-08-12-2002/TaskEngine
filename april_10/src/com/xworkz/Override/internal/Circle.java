package com.xworkz.Override.internal;

public class Circle extends Shape {
    public Circle(){
        System.out.println("no argument constructor in Circle");
    }
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    public void rotate(Shape shape) {
        if (shape!= null) {
            System.out.println("Rotation direction is not set");
        } else {
            System.out.println("Rotating the circle based on shape");
        }
    }
}
