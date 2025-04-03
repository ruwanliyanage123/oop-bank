package designpatterns.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryExample {
    public static void main(String[] args) throws SQLException {
        Logger logger = LoggerFactory.getLogger(FactoryExample.class);
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
    }
}
