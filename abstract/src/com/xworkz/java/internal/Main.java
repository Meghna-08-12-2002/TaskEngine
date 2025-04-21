package com.xworkz.java.internal;

public class Main {
    public static void main(String[] args) {
        Dream d1 = new MusicDream();
        d1.imagine();
        d1.plan();
        d1.execute();
        d1.adapt();
        d1.succeed();

        Dream d2 = new BusinessDream();
        d2.imagine();
        d2.plan();
        d2.execute();
        d2.adapt();
        d2.succeed();

        Polygon p1 = new Rectangle();
        p1.defineShape();
        p1.calculateArea();
        p1.calculatePerimeter();
        p1.displayVertices();
        p1.describeAngles();

        Polygon p2 = new Pentagon();
        p2.defineShape();
        p2.calculateArea();
        p2.calculatePerimeter();
        p2.displayVertices();
        p2.describeAngles();

        Job j1 = new Engineer();
        j1.search();
        j1.apply();
        j1.interview();
        j1.perform();
        j1.getPromoted();

        Job j2 = new Chef();
        j2.search();
        j2.apply();
        j2.interview();
        j2.perform();
        j2.getPromoted();

        Road r1 = new RuralRoad();
        r1.survey();
        r1.design();
        r1.build();
        r1.maintain();
        r1.upgrade();

        Road r2 = new ExpressWay();
        r2.survey(); 
        r2.design();
        r2.build();
        r2.maintain();
        r2.upgrade();

        Project pr1 = new ResearchProject();
        pr1.initiate();
        pr1.plan();
        pr1.execute();
        pr1.monitor();
        pr1.close();

        Project pr2 = new EventProject();
        pr2.initiate();
        pr2.plan();
        pr2.execute();
        pr2.monitor();
        pr2.close();
    }

}
