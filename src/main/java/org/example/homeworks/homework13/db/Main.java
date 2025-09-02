package org.example.homeworks.homework13.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static String url = "jdbc:postgresql://localhost:5432/postgres";
    private static String username = "postgres";
    private static String password = "password";

    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {
        try {
            connect();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            statement.execute("INSERT INTO my_friends (name, surname, age) VALUES ('Sergey', 'Markushov', 33)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            closeConnect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void connect() throws ClassNotFoundException, SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement();
    }

    private static void closeConnect() throws SQLException {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
