package com.xworkz.equals.runner;

import com.xworkz.equals.internal.*;

public class Runner {
    public static void main(String[] args) {

        Cake cake1 = new Cake("Vanilla", 2, "Round", "White");
        Cake cake2 = new Cake("Chocolate", 3, "Square", "Brown");
        Cake cake3 = new Cake("Chocolate", 3, "Square", "Brown");
        boolean match = cake2.equals(cake3);
        boolean notMatch = cake1.equals(cake3);
        System.out.println("Cake match: " + match);
        System.out.println("Cake not match: " + notMatch);
        System.out.println("-----------------------------------------------");

        Roadlight light1 = new Roadlight("LED", 12, "White", "Main Road");
        Roadlight light2 = new Roadlight("Halogen", 10, "Yellow", "Street 5");
        Roadlight light3 = new Roadlight("Halogen", 10, "Yellow", "Street 5");
        boolean roadlightmatch = light2.equals(light3);
        boolean roadlightnotMatch = light1.equals(light3);
        System.out.println("Roadlight match: " + match);
        System.out.println("Roadlight not match: " + notMatch);
        System.out.println("-----------------------------------------------");

        Dumble dumble1 = new Dumble("Iron", 10.0, "Black", "FitGear");
        Dumble dumble2 = new Dumble("Rubber", 5.0, "Red", "FlexiFit");
        Dumble dumble3 = new Dumble("Rubber", 5.0, "Red", "FlexiFit");
        boolean dumbleMatch = dumble2.equals(dumble3);
        boolean dumbleNotMatch = dumble1.equals(dumble3);
        System.out.println("Dumble match: " + dumbleMatch);
        System.out.println("Dumble not match: " + dumbleNotMatch);
        System.out.println("-----------------------------------------------");

        Xray xray1 = new Xray("Chest", "City Hospital", "Dr. Sharma", 500);
        Xray xray2 = new Xray("Arm", "Sunrise Clinic", "Dr. Khan", 300);
        Xray xray3 = new Xray("Arm", "Sunrise Clinic", "Dr. Khan", 300);
        boolean xrayMatch = xray2.equals(xray3);
        boolean xrayNotMatch = xray1.equals(xray3);
        System.out.println("Xray match: " + xrayMatch);
        System.out.println("Xray not match: " + xrayNotMatch);
        System.out.println("-----------------------------------------------");

        Money money1 = new Money("Dollar", "USA", 100.0, "$");
        Money money2 = new Money("Euro", "Germany", 100.0, "€");
        Money money3 = new Money("Euro", "Germany", 100.0, "€");
        boolean moneyMatch = money2.equals(money3);
        boolean moneyNotMatch = money1.equals(money3);
        System.out.println("Money match: " + moneyMatch);
        System.out.println("Money not match: " + moneyNotMatch);
        System.out.println("-----------------------------------------------");

        Tshirt t1 = new Tshirt("Nike", "M", "Black", 799.0);
        Tshirt t2 = new Tshirt("Adidas", "L", "White", 899.0);
        Tshirt t3 = new Tshirt("Adidas", "L", "White", 899.0);
        boolean tshirtMatch = t2.equals(t3);
        boolean tshirtNotMatch = t1.equals(t3);
        System.out.println("Tshirt match: " + tshirtMatch);
        System.out.println("Tshirt not match: " + tshirtNotMatch);
        System.out.println("-----------------------------------------------");

        Neckpiece n1 = new Neckpiece("Tanishq", "Gold", "Yellow", 15000.0);
        Neckpiece n2 = new Neckpiece("Voylla", "Silver", "White", 2000.0);
        Neckpiece n3 = new Neckpiece("Voylla", "Silver", "White", 2000.0);
        boolean neckpieceMatch = n2.equals(n3);
        boolean neckpieceNotMatch = n1.equals(n3);
        System.out.println("Neckpiece match: " + neckpieceMatch);
        System.out.println("Neckpiece not match: " + neckpieceNotMatch);
        System.out.println("-----------------------------------------------");

        Comb c1 = new Comb("Plastic", "Vega", "Black", 28);
        Comb c2 = new Comb("Wood", "Ayur", "Brown", 25);
        Comb c3 = new Comb("Wood", "Ayur", "Brown", 25);
        boolean combMatch = c2.equals(c3);
        boolean combNotMatch = c1.equals(c3);
        System.out.println("Comb match: " + combMatch);
        System.out.println("Comb not match: " + combNotMatch);
        System.out.println("-----------------------------------------------");

        Razer r1 = new Razer("Electric", "Philips", "Stainless Steel", 1500.0);
        Razer r2 = new Razer("Manual", "Gillette", "Steel", 200.0);
        Razer r3 = new Razer("Manual", "Gillette", "Steel", 200.0);
        boolean razerMatch = r2.equals(r3);
        boolean razerNotMatch = r1.equals(r3);
        System.out.println("Razer match: " + razerMatch);
        System.out.println("Razer not match: " + razerNotMatch);
        System.out.println("-----------------------------------------------");

        Spring s1 = new Spring("Coil", "Steel", "Mechanical", 12.5);
        Spring s2 = new Spring("Leaf", "Iron", "Automotive", 20.0);
        Spring s3 = new Spring("Leaf", "Iron", "Automotive", 20.0);
        boolean springMatch = s2.equals(s3);
        boolean springNotMatch = s1.equals(s3);
        System.out.println("Spring match: " + springMatch);
        System.out.println("Spring not match: " + springNotMatch);
        System.out.println("-----------------------------------------------");

        Glob g1 = new Glob("Leather", "Medium", "Nike", 1499.0);
        Glob g2 = new Glob("Rubber", "Large", "Adidas", 999.0);
        Glob g3 = new Glob("Rubber", "Large", "Adidas", 999.0);
        boolean globMatch = g2.equals(g3);
        boolean globNotMatch = g1.equals(g3);
        System.out.println("Glob match: " + globMatch);
        System.out.println("Glob not match: " + globNotMatch);
        System.out.println("-----------------------------------------------");

        Pork p1 = new Pork("Loin", 1.5, "Vacuum Sealed", 450.0);
        Pork p2 = new Pork("Belly", 2.0, "Plastic Wrap", 600.0);
        Pork p3 = new Pork("Belly", 2.0, "Plastic Wrap", 600.0);
        boolean porkMatch = p2.equals(p3);
        boolean porkNotMatch = p1.equals(p3);
        System.out.println("Pork match: " + porkMatch);
        System.out.println("Pork not match: " + porkNotMatch);
        System.out.println("-----------------------------------------------");

        Botton b1 = new Botton("Black", "Plastic", "Medium", 10.0);
        Botton b2 = new Botton("White", "Metal", "Large", 15.0);
        Botton b3 = new Botton("White", "Metal", "Large", 15.0);
        boolean bottonMatch = b2.equals(b3);
        boolean bottonNotMatch = b1.equals(b3);
        System.out.println("Botton match: " + bottonMatch);
        System.out.println("Botton not match: " + bottonNotMatch);
        System.out.println("-----------------------------------------------");

        Bolt boltOne = new Bolt("Steel", "M10", "Hex", 25.0);
        Bolt boltTwo = new Bolt("Aluminum", "M12", "Carriage", 30.0);
        Bolt boltThree = new Bolt("Aluminum", "M12", "Carriage", 30.0);
        boolean boltMatch = boltTwo.equals(boltThree);
        boolean boltNotMatch = boltOne.equals(boltThree);
        System.out.println("Bolt match: " + boltMatch);
        System.out.println("Bolt not match: " + boltNotMatch);
        System.out.println("-----------------------------------------------");

        Towel towelOne = new Towel("Blue", "Cotton", "Large", 299.0);
        Towel towelTwo = new Towel("White", "Polyester", "Medium", 199.0);
        Towel towelThree = new Towel("White", "Polyester", "Medium", 199.0);
        boolean towelMatch = towelTwo.equals(towelThree);
        boolean towelNotMatch = towelOne.equals(towelThree);
        System.out.println("Towel match: " + towelMatch);
        System.out.println("Towel not match: " + towelNotMatch);
        System.out.println("-----------------------------------------------");

        Mask mask1 = new Mask("Cloth", "Blue", "Medium", 100.0);
        Mask mask2 = new Mask("Cloth", "Blue", "Medium", 100.0);
        Mask mask3 = new Mask("Leather", "Black", "Large", 150.0);
        System.out.println("Mask match: " + mask1.equals(mask2));
        System.out.println("Mask not match: " + mask1.equals(mask3));
        System.out.println("-----------------------------------------------");


        Statue statue1 = new Statue("Bronze", "Human", 5.5, 2000.0);
        Statue statue2 = new Statue("Bronze", "Human", 5.5, 2000.0);
        Statue statue3 = new Statue("Marble", "Animal", 3.0, 1500.0);
        System.out.println("Statue match: " + statue1.equals(statue2));
        System.out.println("Statue not match: " + statue1.equals(statue3));
        System.out.println("-----------------------------------------------");


        Robot robot1 = new Robot("RoboX", "Silver", "Assist", 2500.0);
        Robot robot2 = new Robot("RoboX", "Silver", "Assist", 2500.0);
        Robot robot3 = new Robot("MechBot", "Blue", "Fight", 3000.0);
        System.out.println("Robot match: " + robot1.equals(robot2));
        System.out.println("Robot not match: " + robot1.equals(robot3));
        System.out.println("-----------------------------------------------");

        Dice dice1 = new Dice("Red", 6, "Plastic", 20.0);
        Dice dice2 = new Dice("Red", 6, "Plastic", 20.0);
        Dice dice3 = new Dice("Blue", 6, "Wood", 25.0);
        System.out.println("Dice match: " + dice1.equals(dice2));
        System.out.println("Dice not match: " + dice1.equals(dice3));
        System.out.println("-----------------------------------------------");

        Butterfly butterfly1 = new Butterfly("Monarch", "Orange", 3.0, 15.0);
        Butterfly butterfly2 = new Butterfly("Monarch", "Orange", 3.0, 15.0);
        Butterfly butterfly3 = new Butterfly("Swallowtail", "Yellow", 4.0, 20.0);
        System.out.println("Butterfly match: " + butterfly1.equals(butterfly2));
        System.out.println("Butterfly not match: " + butterfly1.equals(butterfly3));
        System.out.println("-----------------------------------------------");


        Hairband hairband1 = new Hairband();
        hairband1.setMaterial("Cotton");
        hairband1.setColor("Black");
        hairband1.setPrice(150.0);
        hairband1.setSize("Medium");
        Hairband hairband2 = new Hairband();
        hairband2.setMaterial("Silk");
        hairband2.setColor("Red");
        hairband2.setPrice(200.0);
        hairband2.setSize("Large");
        Hairband hairband3 = new Hairband();
        hairband3.setMaterial("Silk");
        hairband3.setColor("Red");
        hairband3.setPrice(200.0);
        hairband3.setSize("Large");
        boolean match1 = hairband1.equals(hairband2);
        boolean notMatch1 = hairband3.equals(hairband2);
        System.out.println("Hairband match: " + match);
        System.out.println("Hairband not match: " + notMatch);
        System.out.println("-----------------------------------------------");


                Whole wholeA = new Whole();
                wholeA.setMaterial("Plastic");
                wholeA.setPrice(100);
                wholeA.setSize("L");
                wholeA.setColor("Blue");
                Whole wholeB = new Whole();
                wholeB.setMaterial("Plastic");
                wholeB.setPrice(100);
                wholeB.setSize("L");
                wholeB.setColor("Blue");
                Whole wholeC = new Whole();
                wholeC.setMaterial("Metal");
                wholeC.setPrice(150);
                wholeC.setSize("M");
                wholeC.setColor("Silver");
                System.out.println("Whole Match: " + wholeA.equals(wholeB));
                System.out.println("Whole Not Match: " + wholeA.equals(wholeC));
                System.out.println("--------------------------------------------");

                Bat bat1 = new Bat();
                bat1.setType("Cricket");
                bat1.setColor("Brown");
                bat1.setWeight(1.2);
                bat1.setMaterial("Wood");
                Bat bat2 = new Bat();
                bat2.setType("Cricket");
                bat2.setColor("Brown");
                bat2.setWeight(1.2);
                bat2.setMaterial("Wood");
                Bat bat3 = new Bat();
                bat3.setType("Baseball");
                bat3.setColor("Black");
                bat3.setWeight(1.5);
                bat3.setMaterial("Aluminum");
                System.out.println("Bat Match: " + bat1.equals(bat2));
                System.out.println("Bat Not Match: " + bat1.equals(bat3));
                System.out.println("--------------------------------------------");

                Owl owl1 = new Owl();
                owl1.setSpecies("Barn Owl");
                owl1.setColor("White");
                owl1.setAge(4);
                owl1.setHabitat("Forest");
                Owl owl2 = new Owl();
                owl2.setSpecies("Barn Owl");
                owl2.setColor("White");
                owl2.setAge(4);
                owl2.setHabitat("Forest");
                Owl owl3 = new Owl();
                owl3.setSpecies("Snowy Owl");
                owl3.setColor("Gray");
                owl3.setAge(3);
                owl3.setHabitat("Tundra");
                System.out.println("Owl Match: " + owl1.equals(owl2));
                System.out.println("Owl Not Match: " + owl1.equals(owl3));
                System.out.println("--------------------------------------------");

                Fiber fiber1 = new Fiber();
                fiber1.setType("Nylon");
                fiber1.setColor("White");
                fiber1.setLength(10);
                fiber1.setPrice(200);
                Fiber fiber2 = new Fiber();
                fiber2.setType("Nylon");
                fiber2.setColor("White");
                fiber2.setLength(10);
                fiber2.setPrice(200);
                Fiber fiber3 = new Fiber();
                fiber3.setType("Polyester");
                fiber3.setColor("Black");
                fiber3.setLength(8);
                fiber3.setPrice(180);
                System.out.println("Fiber Match: " + fiber1.equals(fiber2));
                System.out.println("Fiber Not Match: " + fiber1.equals(fiber3));
                System.out.println("--------------------------------------------");

                Pottery pot1 = new Pottery();
                pot1.setMaterial("Clay");
                pot1.setColor("Red");
                pot1.setPrice(120);
                pot1.setType("Vase");
                Pottery pot2 = new Pottery();
                pot2.setMaterial("Clay");
                pot2.setColor("Red");
                pot2.setPrice(120);
                pot2.setType("Vase");
                Pottery pot3 = new Pottery();
                pot3.setMaterial("Porcelain");
                pot3.setColor("White");
                pot3.setPrice(140);
                pot3.setType("Bowl");
                System.out.println("Pottery Match: " + pot1.equals(pot2));
                System.out.println("Pottery Not Match: " + pot1.equals(pot3));
                System.out.println("--------------------------------------------");

        Gate gate1 = new Gate();
        gate1.setMaterial("Wood");
        gate1.setColor("Brown");
        gate1.setType("Swing");
        gate1.setHeight(6.5);
        Gate gate2 = new Gate();
        gate2.setMaterial("Wood");
        gate2.setColor("Brown");
        gate2.setType("Swing");
        gate2.setHeight(6.5);
        Gate gate3 = new Gate();
        gate3.setMaterial("Metal");
        gate3.setColor("Black");
        gate3.setType("Sliding");
        gate3.setHeight(7.0);
        System.out.println("Gate Match: " + gate1.equals(gate2)); // Should return true
        System.out.println("Gate Not Match: " + gate1.equals(gate3)); // Should return false
        System.out.println("--------------------------------------------");

        Grater grater1 = new Grater();
        grater1.setBrand("BrandA");
        grater1.setMaterial("Steel");
        grater1.setShape("Box");
        grater1.setCost(15.99);
        Grater grater2 = new Grater();
        grater2.setBrand("BrandA");
        grater2.setMaterial("Steel");
        grater2.setShape("Box");
        grater2.setCost(15.99);
        Grater grater3 = new Grater();
        grater3.setBrand("BrandB");
        grater3.setMaterial("Plastic");
        grater3.setShape("Circle");
        grater3.setCost(10.99);
        System.out.println("Grater Match: " + grater1.equals(grater2)); // Should return true
        System.out.println("Grater Not Match: " + grater1.equals(grater3)); // Should return false
        System.out.println("--------------------------------------------");

        Dryer dryer1 = new Dryer();
        dryer1.setBrand("Dyson");
        dryer1.setType("Handheld");
        dryer1.setColor("White");
        dryer1.setCost(199.99);
        Dryer dryer2 = new Dryer();
        dryer2.setBrand("Dyson");
        dryer2.setType("Handheld");
        dryer2.setColor("White");
        dryer2.setCost(199.99);
        Dryer dryer3 = new Dryer();
        dryer3.setBrand("Philips");
        dryer3.setType("Stand");
        dryer3.setColor("Black");
        dryer3.setCost(129.99);
        System.out.println("Dryer Match: " + dryer1.equals(dryer2)); // Should return true
        System.out.println("Dryer Not Match: " + dryer1.equals(dryer3)); // Should return false
        System.out.println("--------------------------------------------");

        Garbage garbage1 = new Garbage();
        garbage1.setMaterial("Plastic");
        garbage1.setType("Recyclable");
        garbage1.setLocation("Street");
        garbage1.setWeight(15.5);
        Garbage garbage2 = new Garbage();
        garbage2.setMaterial("Plastic");
        garbage2.setType("Recyclable");
        garbage2.setLocation("Street");
        garbage2.setWeight(15.5);
        Garbage garbage3 = new Garbage();
        garbage3.setMaterial("Glass");
        garbage3.setType("Non-Recyclable");
        garbage3.setLocation("Landfill");
        garbage3.setWeight(30.0);
        System.out.println("Garbage Match: " + garbage1.equals(garbage2)); // Should return true
        System.out.println("Garbage Not Match: " + garbage1.equals(garbage3)); // Should return false
        System.out.println("--------------------------------------------");

        Hammer hammer1 = new Hammer();
        hammer1.setBrand("Bosch");
        hammer1.setType("Claw");
        hammer1.setHandleMaterial("Wood");
        hammer1.setWeight(1.5);
        Hammer hammer2 = new Hammer();
        hammer2.setBrand("Bosch");
        hammer2.setType("Claw");
        hammer2.setHandleMaterial("Wood");
        hammer2.setWeight(1.5);
        Hammer hammer3 = new Hammer();
        hammer3.setBrand("DeWalt");
        hammer3.setType("Sledge");
        hammer3.setHandleMaterial("Fiberglass");
        hammer3.setWeight(3.0);
        System.out.println("Hammer Match: " + hammer1.equals(hammer2)); // Should return true
        System.out.println("Hammer Not Match: " + hammer1.equals(hammer3)); // Should return false
        System.out.println("--------------------------------------------");


        Hose hose1 = new Hose();
        hose1.setLength("50 meters");
        hose1.setDiameter("3 inches");
        hose1.setMaterial("Rubber");
        hose1.setPrice(30.0);
        Hose hose2 = new Hose();
        hose2.setLength("50 meters");
        hose2.setDiameter("3 inches");
        hose2.setMaterial("Rubber");
        hose2.setPrice(30.0);
        Hose hose3 = new Hose();
        hose3.setLength("30 meters");
        hose3.setDiameter("2 inches");
        hose3.setMaterial("PVC");
        hose3.setPrice(20.0);
        System.out.println("Hose Match: " + hose1.equals(hose2)); // Should return true
        System.out.println("Hose Not Match: " + hose1.equals(hose3)); // Should return false
        System.out.println("--------------------------------------------");

        ICEcream iceCream1 = new ICEcream();
        iceCream1.setFlavor("Vanilla");
        iceCream1.setBrand("BrandA");
        iceCream1.setType("Cone");
        iceCream1.setCost(5.0);
        ICEcream iceCream2 = new ICEcream();
        iceCream2.setFlavor("Vanilla");
        iceCream2.setBrand("BrandA");
        iceCream2.setType("Cone");
        iceCream2.setCost(5.0);
        ICEcream iceCream3 = new ICEcream();
        iceCream3.setFlavor("Chocolate");
        iceCream3.setBrand("BrandB");
        iceCream3.setType("Cup");
        iceCream3.setCost(4.5);
        System.out.println("ICE Cream Match: " + iceCream1.equals(iceCream2)); // Should return true
        System.out.println("ICE Cream Not Match: " + iceCream1.equals(iceCream3)); // Should return false
        System.out.println("--------------------------------------------");

        Lamp lamp1 = new Lamp();
        lamp1.setBrand("Philips");
        lamp1.setColor("White");
        lamp1.setType("LED");
        lamp1.setPrice(150.0);
        Lamp lamp2 = new Lamp();
        lamp2.setBrand("Philips");
        lamp2.setColor("White");
        lamp2.setType("LED");
        lamp2.setPrice(150.0);
        Lamp lamp3 = new Lamp();
        lamp3.setBrand("Wipro");
        lamp3.setColor("Yellow");
        lamp3.setType("CFL");
        lamp3.setPrice(120.0);
        System.out.println("Lamp Match: " + lamp1.equals(lamp2)); // Should return true
        System.out.println("Lamp Not Match: " + lamp1.equals(lamp3)); // Should return false
        System.out.println("--------------------------------------------");

        Pencil pencil1 = new Pencil();
        pencil1.setBrand("Doms");
        pencil1.setColor("Yellow");
        pencil1.setHardness("HB");
        pencil1.setPrice(5.0);
        Pencil pencil2 = new Pencil();
        pencil2.setBrand("Doms");
        pencil2.setColor("Yellow");
        pencil2.setHardness("HB");
        pencil2.setPrice(5.0);
        Pencil pencil3 = new Pencil();
        pencil3.setBrand("Faber-Castell");
        pencil3.setColor("Green");
        pencil3.setHardness("2B");
        pencil3.setPrice(10.0);
        System.out.println("Pencil Match: " + pencil1.equals(pencil2)); // Should return true
        System.out.println("Pencil Not Match: " + pencil1.equals(pencil3)); // Should return false
        System.out.println("--------------------------------------------");


        Nursery nursery1 = new Nursery();
        nursery1.setName("Greenery Nursery");
        nursery1.setLocation("Downtown");
        nursery1.setPlantsAvailable(500);
        nursery1.setArea(200.5);
        Nursery nursery2 = new Nursery();
        nursery2.setName("Greenery Nursery");
        nursery2.setLocation("Downtown");
        nursery2.setPlantsAvailable(500);
        nursery2.setArea(200.5);
        Nursery nursery3 = new Nursery();
        nursery3.setName("Blossoms Nursery");
        nursery3.setLocation("Uptown");
        nursery3.setPlantsAvailable(300);
        nursery3.setArea(150.0);
        System.out.println("Nursery Match: " + nursery1.equals(nursery2)); // Should return true
        System.out.println("Nursery Not Match: " + nursery1.equals(nursery3)); // Should return false
        System.out.println("--------------------------------------------");

        Lock lock1 = new Lock();
        lock1.setType("Padlock");
        lock1.setMaterial("Steel");
        lock1.setSecurityLevel(5);
        lock1.setPrice(250.0);
        Lock lock2 = new Lock();
        lock2.setType("Padlock");
        lock2.setMaterial("Steel");
        lock2.setSecurityLevel(5);
        lock2.setPrice(250.0);
        Lock lock3 = new Lock();
        lock3.setType("Deadbolt");
        lock3.setMaterial("Brass");
        lock3.setSecurityLevel(8);
        lock3.setPrice(300.0);
        System.out.println("Lock Match: " + lock1.equals(lock2)); // Should return true
        System.out.println("Lock Not Match: " + lock1.equals(lock3)); // Should return false
        System.out.println("--------------------------------------------");

        Magnets magnet1 = new Magnets();
        magnet1.setShape("Round");
        magnet1.setMaterial("Neodymium");
        magnet1.setStrength(10);
        magnet1.setPrice(50.0);
        Magnets magnet2 = new Magnets();
        magnet2.setShape("Round");
        magnet2.setMaterial("Neodymium");
        magnet2.setStrength(10);
        magnet2.setPrice(50.0);
        Magnets magnet3 = new Magnets();
        magnet3.setShape("Square");
        magnet3.setMaterial("Ferrite");
        magnet3.setStrength(5);
        magnet3.setPrice(30.0);
        System.out.println("Magnet Match: " + magnet1.equals(magnet2)); // Should return true
        System.out.println("Magnet Not Match: " + magnet1.equals(magnet3)); // Should return false
        System.out.println("--------------------------------------------");

        Juicer juicer1 = new Juicer();
        juicer1.setBrand("Philips");
        juicer1.setType("Centrifugal");
        juicer1.setPower(800);
        juicer1.setPrice(120.0);
        Juicer juicer2 = new Juicer();
        juicer2.setBrand("Philips");
        juicer2.setType("Centrifugal");
        juicer2.setPower(800);
        juicer2.setPrice(120.0);
        Juicer juicer3 = new Juicer();
        juicer3.setBrand("Prestige");
        juicer3.setType("Masticating");
        juicer3.setPower(1000);
        juicer3.setPrice(150.0);
        System.out.println("Juicer Match: " + juicer1.equals(juicer2)); // Should return true
        System.out.println("Juicer Not Match: " + juicer1.equals(juicer3)); // Should return false
        System.out.println("--------------------------------------------");


        Hook hook1 = new Hook();
        hook1.setMaterial("Steel");
        hook1.setSize("Medium");
        hook1.setLoadCapacity(500);
        hook1.setPrice(70.0);
        Hook hook2 = new Hook();
        hook2.setMaterial("Steel");
        hook2.setSize("Medium");
        hook2.setLoadCapacity(500);
        hook2.setPrice(70.0);
        Hook hook3 = new Hook();
        hook3.setMaterial("Aluminum");
        hook3.setSize("Large");
        hook3.setLoadCapacity(1000);
        hook3.setPrice(100.0);
        System.out.println("Hook Match: " + hook1.equals(hook2)); // Should return true
        System.out.println("Hook Not Match: " + hook1.equals(hook3)); // Should return false
        System.out.println("--------------------------------------------");


        Hearth hearth1 = new Hearth();
        hearth1.setMaterial("Stone");
        hearth1.setType("Traditional");
        hearth1.setSize(5);
        hearth1.setPrice(1500.0);
        Hearth hearth2 = new Hearth();
        hearth2.setMaterial("Stone");
        hearth2.setType("Traditional");
        hearth2.setSize(5);
        hearth2.setPrice(1500.0);
        Hearth hearth3 = new Hearth();
        hearth3.setMaterial("Brick");
        hearth3.setType("Modern");
        hearth3.setSize(6);
        hearth3.setPrice(2000.0);
        System.out.println("Hearth Match: " + hearth1.equals(hearth2)); // Should return true
        System.out.println("Hearth Not Match: " + hearth1.equals(hearth3)); // Should return false
        System.out.println("--------------------------------------------");

        Rail rail1 = new Rail();
        rail1.setMaterial("Steel");
        rail1.setType("Heavy Duty");
        rail1.setLength(10);
        rail1.setWeight(500.0);
        Rail rail2 = new Rail();
        rail2.setMaterial("Steel");
        rail2.setType("Heavy Duty");
        rail2.setLength(10);
        rail2.setWeight(500.0);
        Rail rail3 = new Rail();
        rail3.setMaterial("Aluminum");
        rail3.setType("Lightweight");
        rail3.setLength(12);
        rail3.setWeight(300.0);
        System.out.println("Rail Match: " + rail1.equals(rail2)); // Should return true
        System.out.println("Rail Not Match: " + rail1.equals(rail3)); // Should return false
        System.out.println("--------------------------------------------");


        Rainbow rainbow1 = new Rainbow();
        rainbow1.setColor("Red");
        rainbow1.setSeason("Spring");
        rainbow1.setArcLength(180);
        rainbow1.setBrightness(0.8);
        Rainbow rainbow2 = new Rainbow();
        rainbow2.setColor("Red");
        rainbow2.setSeason("Spring");
        rainbow2.setArcLength(180);
        rainbow2.setBrightness(0.8);
        Rainbow rainbow3 = new Rainbow();
        rainbow3.setColor("Blue");
        rainbow3.setSeason("Winter");
        rainbow3.setArcLength(150);
        rainbow3.setBrightness(0.5);
        System.out.println("Rainbow Match: " + rainbow1.equals(rainbow2)); // Should return true
        System.out.println("Rainbow Not Match: " + rainbow1.equals(rainbow3)); // Should return false
        System.out.println("--------------------------------------------");

        Guitar guitar1 = new Guitar();
        guitar1.setBrand("Fender");
        guitar1.setType("Electric");
        guitar1.setStrings(6);
        guitar1.setPrice(800.0);
        Guitar guitar2 = new Guitar();
        guitar2.setBrand("Fender");
        guitar2.setType("Electric");
        guitar2.setStrings(6);
        guitar2.setPrice(800.0);
        Guitar guitar3 = new Guitar();
        guitar3.setBrand("Gibson");
        guitar3.setType("Acoustic");
        guitar3.setStrings(6);
        guitar3.setPrice(1000.0);
        System.out.println("Guitar Match: " + guitar1.equals(guitar2)); // Should return true
        System.out.println("Guitar Not Match: " + guitar1.equals(guitar3)); // Should return false
        System.out.println("--------------------------------------------");


        Resistor resistor1 = new Resistor();
        resistor1.setMaterial("Copper");
        resistor1.setResistance(220);
        resistor1.setTolerance("5%");
        resistor1.setPower(0.5);
        Resistor resistor2 = new Resistor();
        resistor2.setMaterial("Copper");
        resistor2.setResistance(220);
        resistor2.setTolerance("5%");
        resistor2.setPower(0.5);
        Resistor resistor3 = new Resistor();
        resistor3.setMaterial("Aluminum");
        resistor3.setResistance(330);
        resistor3.setTolerance("10%");
        resistor3.setPower(1.0);
        System.out.println("Resistor Match: " + resistor1.equals(resistor2)); // Should return true
        System.out.println("Resistor Not Match: " + resistor1.equals(resistor3)); // Should return false
        System.out.println("--------------------------------------------");
            }
        }













