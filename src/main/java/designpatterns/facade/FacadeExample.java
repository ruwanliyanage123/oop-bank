package designpatterns.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FacadeExample {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER_NAME = "user";
    private static final String PASSWORD = "password";
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
    }
}
