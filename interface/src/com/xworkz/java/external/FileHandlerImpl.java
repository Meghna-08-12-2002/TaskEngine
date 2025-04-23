package com.xworkz.java.external;

import com.xworkz.java.internal.FileHandler;

public class FileHandlerImpl implements FileHandler{
    public void open() {
        System.out.println("FileHandlerImpl: open");
    }
    public void read() {
        System.out.println("FileHandlerImpl: read");
    }
    public void write() {
        System.out.println("FileHandlerImpl: write");
    }
    public void close() {
        System.out.println("FileHandlerImpl: close");
    }
    public void delete() {
        System.out.println("FileHandlerImpl: delete");
    }

}
