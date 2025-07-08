package com.xworkz.java.external;

import com.xworkz.java.internal.Storage;

public class DataCenterApp {
    private Storage storage;
    public DataCenterApp(Storage storage) {
        this.storage = storage;
    }
    public void backupData() {
        System.out.println("Initiating backup in DataCenterApp");
        if (storage != null) {
            storage.store();
        } else {
            System.out.println("Storage is null");
        }
    }
}
