package com.xworks.god.internal2;

public class Beach {
    public Beach() {
        System.out.println("Beach constructor called");
    }
    public static void prepareGear() {
        System.out.println("ScubaDrive: public prepareGear method");
    }

    void exploreDepths() {
        System.out.println("ScubaDrive: package-default exploreDepths method");
    }

    private void secretCave() {
        System.out.println("ScubaDrive: private secretCave method");
    }
}
