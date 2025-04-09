package com.xworks.encapsulation.external;

import com.xworks.encapsulation.internal.Mutant;

public class Hero {

        public void heroPower() {
            Mutant mutant = new Mutant();
            System.out.println("Mutant type: " + mutant.getType());
            System.out.println("Level: " + mutant.getLevel());
            System.out.println("Ability: " + mutant.getAbility());
            System.out.println("Active: " + mutant.isActive());
            System.out.println("Energy: " + mutant.getEnergy());
        }
    }


