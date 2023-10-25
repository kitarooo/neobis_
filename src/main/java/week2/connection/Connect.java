package week2.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private static final String URL = "jdbc:postgresql://localhost:5433/DBshop";
    private static final String USER = "postgres";
    private static final String PASSWORD = "TyBaranina01";
    private static Connection connection;

    public static Connection connection(){
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
        return connection;
    }
}
