package ua.goit.java.database.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {


    static final String USER = "root";
    static final String PASSWORD = "111";


    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException {
        final String JDBC_Driver = "com.mysql.jdbc.Driver";
        final String DATABASE_URL = "jdbc:mysql://localhost:3306/todo";
        final String USER = "root";
        final String PASSWORD = "111";

        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

        PreparedStatement ps = null;

        return ps;
    }



}
