package com.workz.java;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = c1;
        c1.show();
        c1.draw();
        c2.draw();
        Dog d1 = new Dog();
        Dog d2 = d1;
        d1.sound();
        d2.sound();


        Car car = new Car();
        Car car1 = car;
        car.start();
        car.fuel();
        car1.start();

        Student s1 = new Student("Raj", 101);
        Student s2 = s1;
        s1.show();
        s1.display();
        s2.display();

        SmartPhone phoneObj = new SmartPhone();
        SmartPhone phoneCopy = phoneObj;
        phoneObj.info();
        phoneObj.status();
        phoneObj.powerOn();
        phoneObj.operate();
        phoneCopy.operate();

    }
}
