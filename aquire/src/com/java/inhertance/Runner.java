package com.java.inhertance;

import com.java.inhertance.external.*;
import com.java.inhertance.internal.*;

public class Runner {
    public static void main(String[] args) {
        Food food = new Food();
        Food food1 = new Sweet();
        Food food2 = new Biscuit();
        Food food3 = new GoodDayBiscuit();
        System.out.println("=====================================");

        Organization o1 = new Organization();
        Organization o2 = new Academy();
        Organization o3 = new Tap();
        Organization o4 = new TapTraining();
        System.out.println("=====================================");



        Dish d1 = new Dish();
        Dish d2 = new SideDish();
        Dish d3 = new Omlet();
        System.out.println("=====================================");


        Human h1 = new Human();
        Human h2 = new Person();
        Human h3 = new Actor();

        System.out.println("=====================================");

        Tool t1 = new Tool();
        Tool t2 = new Weapon();
        Tool t3 = new Revolver();
        System.out.println("=====================================");

        Thing th1 = new Thing();
        Thing th2 = new Plant();
        Thing th3 = new Cactus();
        System.out.println("=====================================");


        Material m1 = new Material();
        Material m2 = new Cotton();
        Material m3 = new Thread1();

        System.out.println("=====================================");

        Security s1 = new Security();
        Security s2 = new Lock();

        System.out.println("=====================================");

        Light l1 = new Light();
        Light l2 = new LED();

        System.out.println("=====================================");

        Accessory a1 = new Accessory();
        Accessory a2 = new Shoe();
        Accessory a3 = new Sneaker();
        System.out.println("=====================================");


        Product p1 = new Product();
        Product p2 = new Furniture();
        Product p3 = new Sofa();
        System.out.println("=====================================");


     }

}
