package com.xworkz.java.handwash.repository;

import com.xworkz.java.handwash.dto.HandwashDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class HandwashRepositoryImpl implements HandwashRepository {

    private static final String URL = "jdbc:mysql://localhost:3306/java";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Meghna@8122002";

    @Override
    public boolean persist(HandwashDto handwashDto) {
        System.out.println("Running in the repository block");

        if (handwashDto == null) {
            System.out.println("Details not saved");
            return false;
        }

        String sql = "INSERT INTO handwash (date, count, soapUsed, location, duration, remarks, insertedTime) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        LocalDateTime dateTime = LocalDateTime.now();
        String time = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            Class.forName("com.mysql.cj.jdbc.Driver");

            statement.setString(1, handwashDto.getDate());
            statement.setInt(2, handwashDto.getCount());
            statement.setBoolean(3, handwashDto.isSoapUsed());
            statement.setString(4, handwashDto.getLocation());
            statement.setInt(5, handwashDto.getDuration());
            statement.setString(6, handwashDto.getRemarks());
            statement.setString(7, time);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // log properly in real apps
        }

        return false;
    }

    @Override
    public Optional<HandwashDto> findById(int handwashId) {
        System.out.println("findById method in Handwash Repository implementation");
        return HandwashRepository.super.findById(handwashId);
    }
}
