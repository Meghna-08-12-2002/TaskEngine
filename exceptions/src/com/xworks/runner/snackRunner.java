package com.xworks.runner;

import com.xworkz.java.exceptions.NoSnackException;

public class snackRunner {
    public static void main(String[] args) throws NoSnackException {
        boolean hasSnack = false;
        if (!hasSnack) {
            throw new NoSnackException("No snack found! Grab something to eat.");
        } else {
            System.out.println("Snack is ready!");
        }
    }
}
