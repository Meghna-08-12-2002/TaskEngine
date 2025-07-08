package com.xworkz.Override.external;

import com.xworkz.Override.internal.Container;
import com.xworkz.Override.internal.PlasticContainer;

public class StorageManager {
    public StorageManager() {
        System.out.println("No argument constructor in StorageManager");
    }

    public void manageStorage(Container container) {
        if (container != null) {
            container.store();
            if (container instanceof PlasticContainer) {
                PlasticContainer plasticContainer = (PlasticContainer) container;
                plasticContainer.seal();
            } else {
                System.out.println("This is not a plastic container.");
            }
        } else {
            System.out.println("No container to store items.");
        }
    }
}
