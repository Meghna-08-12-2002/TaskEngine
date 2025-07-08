package com.xworkz.Override.external;

import com.xworkz.Override.internal.GreenLeaf;
import com.xworkz.Override.internal.Leaf;

public class Botanist {
    public Botanist() {
        System.out.println("No argument constructor in Botanist");
    }

    public void observe(Leaf leaf) {
        if (leaf != null) {
            leaf.fall();
            if (leaf instanceof GreenLeaf) {
                GreenLeaf green = (GreenLeaf) leaf;
                green.photosynthesis();
            } else {
                System.out.println("This is not a green leaf");
            }
        } else {
            System.out.println("No leaf to observe");
        }
    }
}
