package com.xworkz.java.internal;

public class Rectangle extends Polygon {
    void defineShape() { System.out.println("This is a rectangle."); }
    void calculateArea() { System.out.println("Area = length * breadth"); }
    void calculatePerimeter() { System.out.println("Perimeter = 2*(l+b)"); }
    void displayVertices() { System.out.println("It has 4 vertices."); }
    void describeAngles() { System.out.println("All angles are 90 degrees."); }
}
