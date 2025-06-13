package com.xworkz.java.handwash.repository;

import com.xworkz.java.handwash.dto.HandwashDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HandwashRepositoryImpl implements HandwashRepository {
    @Override
    public boolean parser(HandwashDto handwashDto) {
        System.out.println("running in the repository block");
        if (handwashDto != null) {
            String url = "jdbc:mysql://localhost:3306/java";
            String username = "root";
            String password = "Meghna@8122002";
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String time = dateTime.format(formatter);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, username, password);
                String sql = "INSERT INTO handwash VALUES (0, '" + handwashDto.getDate() + "', " + handwashDto.getCount() + ", " + handwashDto.isSoapUsed() + ", '" + handwashDto.getLocation() + "', " + handwashDto.getDuration() + ", '" + handwashDto.getRemarks() + "')";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
            return true;
        }
        return false;
    }
}
