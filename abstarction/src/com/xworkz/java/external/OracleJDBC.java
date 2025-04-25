package com.xworkz.java.external;

import com.xworkz.java.internal.JDBC;

public class OracleJDBC implements JDBC {

    @Override
    public void save() {
System.out.println("running Oracle in jdbc");
    }
}
