package com.xworkz.Override.external;

import com.xworkz.Override.internal.DoorHandle;
import com.xworkz.Override.internal.Handle;

public class HandleHandler {
    public HandleHandler() {
        System.out.println("No argument constructor in HandleHandler");
    }

    public void manageHandle(Handle handle) {
        if (handle != null) {
            handle.turn();
            if (handle instanceof DoorHandle) {
                DoorHandle door = (DoorHandle) handle;
                door.install();
            } else {
                System.out.println("This is a generic handle");
            }
        } else {
            System.out.println("Handle is null");
        }
    }
}
