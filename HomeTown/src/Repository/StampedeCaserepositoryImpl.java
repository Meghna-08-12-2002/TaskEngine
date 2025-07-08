package Repository;

import Dto.StampedeCaseDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StampedeCaserepositoryImpl implements StampedeCaseRepository{
    public StampedeCaserepositoryImpl()
    {
        System.out.println("StampedeCase Repository Implementation constructor");
    }
    @Override
    public boolean persist(StampedeCaseDto stampedeCaseDto) {
        System.out.println("persist method in StampedeCase Repository Implementation");
        System.out.println("should save into DB...");
        if (stampedeCaseDto != null) {
            String url="jdbc:mysql://localhost:3306/xwork";
            String username="root";
            String password="Xworkzodc@123";
                        try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection= DriverManager.getConnection(url,username,password);

                String sql="insert into stampede_case values(0,'"+stampedeCaseDto.getEvent()+"','"+stampedeCaseDto.getLocation()+"',"+stampedeCaseDto.getDeaths()+","+stampedeCaseDto.getInjuries()+")";
                Statement statement=connection.createStatement();

                statement.executeUpdate(sql);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }

            return true;
        }
       return false;

            }
}
