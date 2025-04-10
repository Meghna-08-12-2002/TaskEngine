package com.xworkz.Override.internal;

public class Gecko extends Lizard {
    public Gecko() {
        System.out.println("No argument constructor in Gecko");
    }

    @Override
    public void move() {
        System.out.println("Gecko is climbing walls");
    }

    @Override
    public void makeSound() {
        System.out.println("Gecko makes a chirping sound");
    }

    public void changeColor() {
        System.out.println("Gecko is changing color");
    }
}
