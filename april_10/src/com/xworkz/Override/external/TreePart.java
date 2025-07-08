package com.xworkz.Override.external;

import com.xworkz.Override.internal.Root;
import com.xworkz.Override.internal.Tree;

public class TreePart {
    public TreePart() {
        System.out.println("No argument constructor in TreeHandler");
    }

    public void handle(Root root) {
        if (root != null) {
            root.grow();
            if (root instanceof Tree) {
                Tree tree = (Tree) root;
                tree.shade();
            } else {
                System.out.println("Not a tree");
            }
        } else {
            System.out.println("Root is null");
        }
    }
}
