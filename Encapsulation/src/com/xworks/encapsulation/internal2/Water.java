package com.xworks.encapsulation.internal2;

public class Water {

        public void wtr() {
            Tank tank = new Tank();
            System.out.println("Name: " + tank.getName());
            System.out.println("Litres: " + tank.getLtr());
            System.out.println("Available: " + tank.getAvlbe());
            System.out.println("Height: " + tank.getHeight());
            System.out.println("Width: " + tank.getWidth());

            tank.setName("petrol");
            tank.setLtr(45);
            tank.setAvlbe(22);
            tank.setHeight(66);
            tank.setWidth(50);

            System.out.println("Updated Name: " + tank.getName());
        }
    }


