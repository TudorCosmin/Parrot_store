package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection;

    private static final String URL = "jdbc:postgresql://localhost:5432/parrotStoreDB";
    private static final String USER = "postgres";
    private static final String PASS = "admin1234";

    private DatabaseConnection() {

    }

    public static void main(String[] args) throws SQLException {
        DatabaseConnection.getInstance();
    }

    public static Connection getInstance() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(URL, USER, PASS);
        }

        return connection;
    }
}
