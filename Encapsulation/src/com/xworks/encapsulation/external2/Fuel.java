package com.xworks.encapsulation.external2;

import com.xworks.encapsulation.internal2.Tank;

public class Fuel {

        public void fuel() {
            Tank tank = new Tank();
            System.out.println("Name: " + tank.getName());
            System.out.println("Litres: " + tank.getLtr());
            System.out.println("Available: " + tank.getAvlbe());
            System.out.println("Height: " + tank.getHeight());
            System.out.println("Width: " + tank.getWidth());
        }
    }


