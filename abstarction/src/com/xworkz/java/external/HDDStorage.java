package com.xworkz.java.external;

import com.xworkz.java.internal.Storage;

public class HDDStorage implements Storage {
    @Override
    public void store() {
        System.out.println("Storing data in HDD");
    }
}
