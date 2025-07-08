package com.xworkz.java.repository;

import com.xworkz.java.DBProperties.DBProperties;
import com.xworkz.java.dto.HandwashDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class HandwashRepoImpl implements HandwashRepo{
    @Override
    public boolean persist(HandwashDto handwashDto) {
        System.out.println("running persist in HandwashRepoImpl");
        if (handwashDto != null) {
            String url = "jdbc:mysql://localhost:3306/java";
            String username = "root";
            String password = "Meghna@8122002";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager
                        .getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());

                String sql = "INSERT INTO handwash1 VALUES (0, '"
                        + handwashDto.getDate() + "', "
                        + handwashDto.getCount() + ", "
                        + handwashDto.isSoapUsed() + ", '"
                        + handwashDto.getLocation() + "', "
                        + handwashDto.getDuration() + ", '"
                        + handwashDto.getRemarks() + "');";

                Statement statement = connection.createStatement();

                statement.executeUpdate(sql);
            }
            catch (ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
            }
            return true;
        }
        return false;
    }

    @Override
    public Optional<HandwashDto> findById(int id) {
        System.out.println("running findById in dusterRepositoryImpl...");

        return HandwashRepo.super.findById(id);
    }
}
