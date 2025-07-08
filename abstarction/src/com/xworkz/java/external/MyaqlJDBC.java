package com.xworkz.java.external;

import com.xworkz.java.internal.JDBC;

public class MyaqlJDBC implements JDBC {
    @Override
    public void save() {
     System.out.println("running Mysql in jdbc");
    }
}
