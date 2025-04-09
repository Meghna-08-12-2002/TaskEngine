package com.xworks.encapsulation;

import com.xworks.encapsulation.external.Hero;
import com.xworks.encapsulation.external1.BikeKey;
import com.xworks.encapsulation.external2.Fuel;
import com.xworks.encapsulation.external3.Miltary;
import com.xworks.encapsulation.external4.Normal;
import com.xworks.encapsulation.external5.Job;
import com.xworks.encapsulation.external6.USA;
import com.xworks.encapsulation.external7.Car;
import com.xworks.encapsulation.external8.Trainer;
import com.xworks.encapsulation.external9.Visitors;
import com.xworks.encapsulation.internal.Men;
import com.xworks.encapsulation.internal1.SpiderKey;
import com.xworks.encapsulation.internal2.Water;
import com.xworks.encapsulation.internal3.School;
import com.xworks.encapsulation.internal4.Speed;
import com.xworks.encapsulation.internal5.Business;
import com.xworks.encapsulation.internal6.Russian;
import com.xworks.encapsulation.internal7.Bike;
import com.xworks.encapsulation.internal8.Equipment;
import com.xworks.encapsulation.internal9.Resident;

public class AllRunner {
    public static void main(String[] args) {
        Men men = new Men();
        men.team();
        System.out.println("=================");
        Hero hero = new Hero();
        hero.heroPower();
        System.out.println("=================");

        SpiderKey spiderKey = new SpiderKey();
        spiderKey.spidy();
        System.out.println("==================");
        BikeKey bikeKey = new BikeKey();
        bikeKey.Bike();
        System.out.println("==================");

        Water water = new Water();
        water.wtr();
        System.out.println("====================");
        Fuel fuel = new Fuel();
        fuel.fuel();
        System.out.println("====================");

        School school = new School();
        school.scl();
        System.out.println("=====================");
        Miltary miltary = new Miltary();
        miltary.mil();
        System.out.println("=====================");

        Speed speed = new Speed();
        speed.spd();
        System.out.println("========================");
        Normal normal = new Normal();
        normal.nrml();
        System.out.println("========================");

        Business business = new Business();
        business.bns();
        System.out.println("=======================");
        Job job = new Job();
        job.jb();
        System.out.println("=======================");

        Russian russian = new Russian();
        russian.rsn();
        System.out.println("=======================");
        USA usa = new USA();
        usa.usa();
        System.out.println("=======================");

        Bike bike = new Bike();
        bike.bke();
        System.out.println("=============================");
        Car car = new Car();
        car.car();
        System.out.println("=============================");

        Equipment equipment = new Equipment();
        equipment.showDetails();
        System.out.println("=============================");
        Trainer trainer = new Trainer();
        trainer.trainerInfo();
        System.out.println("=============================");

        Resident resident = new Resident();
        resident.showApartmentInfo();
        System.out.println("=============================");
        Visitors visitors = new Visitors();
        visitors.viewApartmentDetails();
        System.out.println("=============================");
    }

}
