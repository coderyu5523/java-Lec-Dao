package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getInstance(){
        String username = "root";
        String password = "1234";
        String url = "jdbc:mariadb://localhost:3306/usertest1";

        try {
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("db connect success");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null ;
    }

}
