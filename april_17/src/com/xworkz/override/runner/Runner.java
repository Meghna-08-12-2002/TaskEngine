package com.xworkz.override.runner;

import com.xworkz.override.internal.*;

public class Runner {
        public static void main(String[] args) {
            Adopter adopter1 = new Adopter("Alice", 45);
            Adopter adopter2 = new Adopter("Bob", 80);
            adopter1.connect();
            adopter2.connect();
            System.out.println(adopter1);
            System.out.println(adopter2);
            System.out.println("---------------------------");

            Route route1 = new Route("Mountain Adventure", 120.5);
            Route route2 = new Route("City Tour", 45.0);
            route1.displayRouteInfo();
            route2.displayRouteInfo();
            System.out.println(route1);
            System.out.println(route2);
            System.out.println("---------------------------");

            Alovera alovera1 = new Alovera("Alovera Gel", 50);
            Alovera alovera2 = new Alovera("Alovera Juice", 30);
            alovera1.displayInfo();
            alovera2.displayInfo();
            System.out.println(alovera1);
            System.out.println(alovera2);
            System.out.println("---------------------------");

            Ant ant1=new Ant("Fire Ant",1000);
            Ant ant2=new Ant("Army Ant",2000);
            ant1.displayInfo();
            ant2.displayInfo();
            System.out.println(ant1);
            System.out.println(ant2);
            System.out.println("---------------------------");

            Foot barefoot1=new Foot("Leather", 42);
            Foot barefoot2=new Foot("Rubber", 45);
            barefoot1.walk();
            barefoot2.walk();
            System.out.println(barefoot1);
            System.out.println(barefoot2);
            System.out.println("---------------------------");

            Blanket blanket1=new Blanket("Blue", 200);
            Blanket blanket2=new Blanket("Red", 150);
            blanket1.spread();
            blanket2.spread();
            System.out.println(blanket1);
            System.out.println(blanket2);
            System.out.println("---------------------------");

            Blush blush1=new Blush("Pink", 10);
            Blush blush2=new Blush("Peach", 15);
            blush1.apply();
            blush2.apply();
            System.out.println(blush1);
            System.out.println(blush2);
            System.out.println("---------------------------");

            Campfire campfire1=new Campfire("Oak", 20);
            Campfire campfire2=new Campfire("Pine", 30);
            campfire1.ignite();
            campfire2.ignite();
            System.out.println(campfire1);
            System.out.println(campfire2);
            System.out.println("---------------------------");

            CampingTent tent1=new CampingTent("Polyester", 4);
            CampingTent tent2=new CampingTent("Canvas", 6);
            tent1.setUp();
            tent2.setUp();
            System.out.println(tent1);
            System.out.println(tent2);
            System.out.println("---------------------------");

            Candle candle1 = new Candle("Red", 15);
            Candle candle2 = new Candle("Blue", 20);
            candle1.burn();
            candle2.burn();
            System.out.println(candle1);
            System.out.println(candle2);
            System.out.println("---------------------------");

            Canister canister1 = new Canister("Plastic", 10);
            Canister canister2 = new Canister("Metal", 20);
            canister1.store();
            canister2.store();
            System.out.println(canister1);
            System.out.println(canister2);
            System.out.println("---------------------------");

            Cardamom cardamom1 = new Cardamom("India", 50);
            Cardamom cardamom2 = new Cardamom("Sri Lanka", 30);
            cardamom1.use();
            cardamom2.use();
            System.out.println(cardamom1);
            System.out.println(cardamom2);
            System.out.println("---------------------------");

            Cauldron cauldron1 = new Cauldron("Cast Iron", 20);
            Cauldron cauldron2 = new Cauldron("Copper", 15);
            cauldron1.heat();
            cauldron2.heat();
            System.out.println(cauldron1);
            System.out.println(cauldron2);
            System.out.println("---------------------------");

            Censer censer1 = new Censer("Brass", 30);
            Censer censer2 = new Censer("Wood", 25);
            censer1.burnIncense();
            censer2.burnIncense();
            System.out.println(censer1);
            System.out.println(censer2);
            System.out.println("---------------------------");

            Chandelier chandelier1 = new Chandelier("Modern", 10);
            Chandelier chandelier2 = new Chandelier("Vintage", 5);
            chandelier1.illuminate();
            chandelier2.illuminate();
            System.out.println(chandelier1);
            System.out.println(chandelier2);
            System.out.println("---------------------------");

            Charger charger1 = new Charger("Anker", 18);
            Charger charger2 = new Charger("Samsung", 25);
            charger1.chargeDevice();
            charger2.chargeDevice();
            System.out.println(charger1);
            System.out.println(charger2);
            System.out.println("---------------------------");

            ChiliSpice spice1 = new ChiliSpice("India", 8);
            ChiliSpice spice2 = new ChiliSpice("Mexico", 10);
            spice1.addSpice();
            spice2.addSpice();
            System.out.println(spice1);
            System.out.println(spice2);
            System.out.println("---------------------------");

            Chopper chopper1 = new Chopper("Heavy Duty", 25);
            Chopper chopper2 = new Chopper("Compact", 15);
            chopper1.chop();
            chopper2.chop();
            System.out.println(chopper1);
            System.out.println(chopper2);
            System.out.println("---------------------------");

            DrySkin drySkin1 = new DrySkin("AloeCare", 30);
            DrySkin drySkin2 = new DrySkin("HydraPlus", 50);
            drySkin1.connect();
            drySkin2.connect();
            System.out.println(drySkin1);
            System.out.println(drySkin2);
            System.out.println("---------------------------");

            CookingTong tong1 = new CookingTong("GrillMaster", 30);
            CookingTong tong2 = new CookingTong("ChefGrip", 25);
            tong1.connect();
            tong2.connect();
            System.out.println(tong1);
            System.out.println(tong2);
            System.out.println("---------------------------");

            Circle circle1 = new Circle("Roundy", 10);
            Circle circle2 = new Circle("Orbit", 15);
            circle1.connect();
            circle2.connect();
            System.out.println(circle1);
            System.out.println(circle2);
            System.out.println("---------------------------");

            Clock clock1 = new Clock("WallClock", 30);
            Clock clock2 = new Clock("AlarmClock", 15);
            clock1.connect();
            clock2.connect();
            System.out.println(clock1);
            System.out.println(clock2);
            System.out.println("---------------------------");

            Copper copper1 = new Copper("CopperWire", 15);
            Copper copper2 = new Copper("CopperSheet", 25);
            copper1.connect();
            copper2.connect();
            System.out.println(copper1);
            System.out.println(copper2);
            System.out.println("---------------------------");

            Cradle cradle1 = new Cradle("WoodenCradle", 70);
            Cradle cradle2 = new Cradle("MetalCradle", 85);
            cradle1.connect();
            cradle2.connect();
            System.out.println(cradle1);
            System.out.println(cradle2);
            System.out.println("---------------------------");

            Curd curd1 = new Curd("FreshCurd", 50);
            Curd curd2 = new Curd("GreekCurd", 60);
            curd1.connect();
            curd2.connect();
            System.out.println(curd1);
            System.out.println(curd2);
            System.out.println("---------------------------");

            Desert desert1 = new Desert("Sahara", 900000);
            Desert desert2 = new Desert("Gobi", 1300000);
            desert1.connect();
            desert2.connect();
            System.out.println(desert1);
            System.out.println(desert2);
            System.out.println("---------------------------");

            Doll doll1 = new Doll("Barbie", 30);
            Doll doll2 = new Doll("Ken", 25);
            doll1.connect();
            doll2.connect();
            System.out.println(doll1);
            System.out.println(doll2);
            System.out.println("---------------------------");

            Earrings earrings1 = new Earrings("Gold", 3);
            Earrings earrings2 = new Earrings("Silver", 2);
            earrings1.connect();
            earrings2.connect();
            System.out.println(earrings1);
            System.out.println(earrings2);
            System.out.println("---------------------------");

            Elevator elevator1 = new Elevator("Lift-1", 10);
            Elevator elevator2 = new Elevator("Lift-2", 12);
            elevator1.connect();
            elevator2.connect();
            System.out.println(elevator1);
            System.out.println(elevator2);
            System.out.println("---------------------------");

            Eyeliner eyeliner1 = new Eyeliner("Black", 10);
            Eyeliner eyeliner2 = new Eyeliner("Brown", 8);
            eyeliner1.connect();
            eyeliner2.connect();
            System.out.println(eyeliner1);
            System.out.println(eyeliner2);
            System.out.println("---------------------------");

            Fevikwik fevikwik1 = new Fevikwik("Super", 10);
            Fevikwik fevikwik2 = new Fevikwik("Quick", 5);
            fevikwik1.connect();
            fevikwik2.connect();
            System.out.println(fevikwik1);
            System.out.println(fevikwik2);
            System.out.println("---------------------------");

            Finger finger1 = new Finger("Thumb", 1);
            Finger finger2 = new Finger("Index", 2);
            finger1.connect();
            finger2.connect();
            System.out.println(finger1);
            System.out.println(finger2);
            System.out.println("---------------------------");

            Fire fire1 = new Fire("Campfire", 10);
            Fire fire2 = new Fire("Bonfire", 20);
            fire1.connect();
            fire2.connect();
            System.out.println(fire1);
            System.out.println(fire2);
            System.out.println("---------------------------");

            Flagon flagon1 = new Flagon("Silver", 2);
            Flagon flagon2 = new Flagon("Gold", 5);
            flagon1.connect();
            flagon2.connect();
            System.out.println(flagon1);
            System.out.println(flagon2);
            System.out.println("---------------------------");

            Flask flask1 = new Flask("Thermal", 100);
            Flask flask2 = new Flask("Standard", 50);
            flask1.connect();
            flask2.connect();
            System.out.println(flask1);
            System.out.println(flask2);
            System.out.println("---------------------------");

            Fog fog1 = new Fog("Morning", 5);
            Fog fog2 = new Fog("Evening", 10);
            fog1.connect();
            fog2.connect();
            System.out.println(fog1);
            System.out.println(fog2);
            System.out.println("---------------------------");

            Fork fork1 = new Fork("Dining", 3);
            Fork fork2 = new Fork("Dessert", 2);
            fork1.connect();
            fork2.connect();
            System.out.println(fork1);
            System.out.println(fork2);
            System.out.println("---------------------------");

            Frog frog1 = new Frog("Green", 3);
            Frog frog2 = new Frog("Blue", 4);
            frog1.connect();
            frog2.connect();
            System.out.println(frog1);
            System.out.println(frog2);
            System.out.println("---------------------------");

            Garden garden1 = new Garden("Flower", 500);
            Garden garden2 = new Garden("Vegetable", 200);
            garden1.connect();
            garden2.connect();
            System.out.println(garden1);
            System.out.println(garden2);
            System.out.println("---------------------------");

            Ginger ginger1 = new Ginger("Fresh", 5);
            Ginger ginger2 = new Ginger("Dried", 3);
            ginger1.connect();
            ginger2.connect();
            System.out.println(ginger1);
            System.out.println(ginger2);
            System.out.println("---------------------------");

            Hair hair1 = new Hair("Curly", 30);
            Hair hair2 = new Hair("Straight", 25);
            hair1.connect();
            hair2.connect();
            System.out.println(hair1);
            System.out.println(hair2);
            System.out.println("---------------------------");

            Handle handle1 = new Handle("Wooden", 15);
            Handle handle2 = new Handle("Metal", 20);
            handle1.connect();
            handle2.connect();
            System.out.println(handle1);
            System.out.println(handle2);
            System.out.println("---------------------------");

            IronRod rod1 = new IronRod("Round", 50);
            IronRod rod2 = new IronRod("Square", 40);
            rod1.connect();
            rod2.connect();
            System.out.println(rod1);
            System.out.println(rod2);
            System.out.println("---------------------------");

            Jar jar = new Jar("Ceramic", 7);
            Jar jar3 = new Jar("Glass", 10);
            jar.connect();
            jar3.connect();
            System.out.println(jar);
            System.out.println(jar3);
            System.out.println("---------------------------");

            JossStick stick1 = new JossStick("Sandalwood", 10);
            JossStick stick2 = new JossStick("Lavender", 12);
            stick1.connect();
            stick2.connect();
            System.out.println(stick1);
            System.out.println(stick2);
            System.out.println("---------------------------");

            Keyboard keyboard1 = new Keyboard("Mechanical", 105);
            Keyboard keyboard2 = new Keyboard("Membrane", 104);
            keyboard1.connect();
            keyboard2.connect();
            System.out.println(keyboard1);
            System.out.println(keyboard2);
            System.out.println("---------------------------");

            Kit kit1 = new Kit("First Aid", 10);
            Kit kit2 = new Kit("Tool", 20);
            kit1.connect();
            kit2.connect();
            System.out.println(kit1);
            System.out.println(kit2);
            System.out.println("---------------------------");


            Leaf leaf1 = new Leaf("Basil", 5);
            Leaf leaf2 = new Leaf("Mint", 4);
            leaf1.connect();
            leaf2.connect();
            System.out.println(leaf1);
            System.out.println(leaf2);
            System.out.println("---------------------------");

            Led led1 = new Led("RGB", 50);
            Led led2 = new Led("White", 30);
            led1.connect();
            led2.connect();
            System.out.println(led1);
            System.out.println(led2);
            System.out.println("---------------------------");

            Letter letter1 = new Letter("A", 5);
            Letter letter2 = new Letter("B", 6);
            letter1.connect();
            letter2.connect();
            System.out.println(letter1);
            System.out.println(letter2);
            System.out.println("---------------------------");
            






        }
    }
