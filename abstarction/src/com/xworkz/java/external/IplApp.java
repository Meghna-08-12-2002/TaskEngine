package com.xworkz.java.external;

import com.xworkz.java.internal.JDBC;

public class IplApp {
    private JDBC jdbc;

    public IplApp(JDBC jdbc) {

        this.jdbc = jdbc;
    }

    public void SaveTeamInfo() {
        System.out.println("running SaveTeamInfo in IplApp");

        if (this.jdbc != null) {
            this.jdbc.save();
        } else {
            System.out.println("jdbc is null");
        }
    }
}
