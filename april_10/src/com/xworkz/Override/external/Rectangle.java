package com.xworkz.Override.external;

import com.xworkz.Override.internal.Circle;
import com.xworkz.Override.internal.Shape;

public class Rectangle {
    public Rectangle(){
        System.out.println("no argumenet constructor of rectangle");
    }
   public void Tringle(Shape shape){
        if(shape!=null){
            shape.draw();
            if(shape instanceof Circle){
                Circle circle=(Circle)shape;
                circle.rotate();
            }
            else{
                System.out.println("shape is not found");
            }
        }
        else{
            System.out.println("shape is null");
        }
   }
}
