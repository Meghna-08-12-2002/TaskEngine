package com.xworkz.casting.runner;

import com.xworkz.casting.internal.Generator;
import com.xworkz.casting.internal.Inverter;

public class Runner {
    public static void main(String[] args) {
        Generator generator=new Generator();
        generator.Generate();
        System.out.println("---------------------------------------");
        Generator generator1=new Inverter();
        generator1.Generate();
        System.out.println("---------------------------------------");
        Inverter inverter1=(Inverter)generator1;
        inverter1.backup();
        System.out.println("---------------------------------------");
        Inverter inverter =new Inverter();
        inverter.Generate();
        inverter.backup();
        System.out.println("=========================================");
    }
}
