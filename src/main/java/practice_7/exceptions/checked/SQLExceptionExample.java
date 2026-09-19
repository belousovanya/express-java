package practice_7.exceptions.checked;

import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "username", "password");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            while (resultSet.next()) {
                System.out.println("User: " + resultSet.getString("username"));
            }
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Error Closing Connection: " + e.getMessage());
            }
        }
    }
}
