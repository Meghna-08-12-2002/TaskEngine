package com.xworkz.java.weather.repository;

import com.xworkz.java.weather.dto.WeatherDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WeatherRepositoryImpl implements WeatherRepository {
    @Override
    public boolean parser(WeatherDto weatherDto) {
        System.out.println("running in the repository block");
        if (weatherDto != null) {
            String url = "jdbc:mysql://localhost:3306/java";
            String username = "root";
            String password = "Xworkzodc@123";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, username, password);
                String sql = "insert into booking values(0,'"+weatherDto.getLocation()+"','"+weatherDto.getWeather()+"',"+weatherDto.getMaxtemp()+","+weatherDto.getMintemp()+","+ weatherDto.getHumidity()+",0"+weatherDto.getCloud()+","+weatherDto.getRain()+","+weatherDto.getWind()+",'"+weatherDto.getSunrise()+"','"+weatherDto.getSunset()+"','"+weatherDto.getMoonrise()+"','"+weatherDto.getMoonrise()+"','"+weatherDto.getMoonset()+"','"+weatherDto.getRainstart()+"','"+weatherDto.getRainstop()+"',"+weatherDto.getPrecipitation()+")";
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
