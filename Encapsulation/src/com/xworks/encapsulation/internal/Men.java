package com.xworks.encapsulation.internal;

public class Men {
    public Men() {
        System.out.println("running inside the Xmen");
    }

    public void team() {
        Mutant mutant = new Mutant();
        System.out.println("Mutant type: " + mutant.getType());
        System.out.println("Level: " + mutant.getLevel());
        System.out.println("Ability: " + mutant.getAbility());
        System.out.println("Active: " + mutant.isActive());
        System.out.println("Energy: " + mutant.getEnergy());

        mutant.setType("Alpha");
        mutant.setLevel(10);
        mutant.setAbility("Teleportation");
        mutant.setActive(false);
        mutant.setEnergy(76.2);

        System.out.println("Mutant type: " + mutant.getType());
        System.out.println("Level: " + mutant.getLevel());
        System.out.println("Ability: " + mutant.getAbility());
        System.out.println("Active: " + mutant.isActive());
        System.out.println("Energy: " + mutant.getEnergy());
    }
}
