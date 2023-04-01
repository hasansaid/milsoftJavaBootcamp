package work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresqlConnection {

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
        	String url = "jdbc:postgresql://localhost/godoroDb";
        	String user ="postgres";
        	String password ="123";
        	String driver ="org.postgresql.Driver";
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
            connection = null;
        }
    }
}