package com.xworkz.Override.internal;

public class FlashSundisk extends Sundisk {
    public FlashSundisk() {
        System.out.println("No argument constructor in FlashSundisk");
    }

    @Override
    public void storeData() {
        System.out.println("Storing data in FlashSundisk");
    }

    public void fastReadWrite() {
        System.out.println("FlashSundisk allows fast read and write operations");
    }
}
