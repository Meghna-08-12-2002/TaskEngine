package com.xworkz.Override.external;

import com.xworkz.Override.internal.Frog;
import com.xworkz.Override.internal.TreeFrog;

public class TreeFrogAnimal {
    public TreeFrogAnimal() {
        System.out.println("No argument constructor in TreeFrogHandler");
    }

    public void handle(Frog frog) {
        if (frog != null) {
            frog.jump();
            if (frog instanceof TreeFrog) {
                TreeFrog tf = (TreeFrog) frog;
                tf.croak();
            } else {
                System.out.println("Not a tree frog");
            }
        } else {
            System.out.println("Frog is null");
        }
    }
}
