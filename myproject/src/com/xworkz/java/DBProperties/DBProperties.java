package com.xworkz.java.DBProperties;

public enum DBProperties {
    URL("jdbc:mysql://localhost:3306/java"),
    USER_NAME("root"),
    SECRET("Meghna@8122002"),
    VERSION_8;

    private String prop;

    private  DBProperties(String prop)
    {
        this.prop=prop;
    }
    private DBProperties()
    {

    }

    public String getProp() {
        return prop;
    }
}
