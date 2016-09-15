package ua.goit.java.database.dao;

import ua.goit.java.model.Task;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dao {

    final String JDBC_Driver = "com.mysql.jdbc.Driver";
    final String DATABASE_URL = "jdbc:mysql://localhost:3306/todo";
    static final String USER = "root";
    static final String PASSWORD = "111";

    public void addTask(Task task) throws SQLException, ClassNotFoundException {

        System.out.println("Creating DataBase Connection...");
//        Connection connection = getConnection();
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

        System.out.println("Executing statement");

        PreparedStatement ps = connection.prepareStatement("insert into todolist(id, name, category, complete) values (?,?, ?, ?)");
        ps.setInt(1, task.getId());
        ps.setString(2, task.getName());
        ps.setString(3, task.getCategory());
        ps.setString(4, task.getComplete());

        ps.execute();
        System.out.println("Record was added.");

    }

    public static List<Task> getAll() {
        List<Task> list = new ArrayList<>();

        try {
            System.out.println("Creating DataBase Connection...");
//        Connection connection = getConnection();
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/todo", USER, PASSWORD);

            System.out.println("Executing statement");
            PreparedStatement ps = connection.prepareStatement("select * from todolist");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Task task = new Task(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                list.add(task);
            }
        }catch (ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }

        return list;
    }

    public static List<Task> getTaskById(int id) {
        List<Task> list = new ArrayList<>();

        try {
            System.out.println("Creating DataBase Connection...");
//        Connection connection = getConnection();
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/todo", USER, PASSWORD);

            System.out.println("Executing statement");
            PreparedStatement ps = connection.prepareStatement("select * from todolist where id=" + id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Task task = new Task(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                list.add(task);
            }
        }catch (ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }

        return list;
    }
    public void edit(int id, String name, String category, String complete) throws SQLException, ClassNotFoundException {

        System.out.println("Creating DataBase Connection...");
//        Connection connection = getConnection();
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

        System.out.println("Executing statement");

        PreparedStatement ps = connection.prepareStatement("update todolist set name=?, category=?, complete=?" + "where id = ?");
        ps.setString(1, name);
        ps.setString(2, category);
        ps.setString(3, complete);
        ps.setInt(4, id);

        ps.executeUpdate();
        System.out.println("Record was edited.");

    }

    public void delete(int id)  {

        try {
            System.out.println("Creating DataBase Connection...");
//        Connection connection = getConnection();
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

            System.out.println("Executing statement");

            PreparedStatement ps = connection.prepareStatement("delete from todolist where id =?");
            System.out.println("Start statement delete");
            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println("Record was deleted.");
        }catch (SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        }

    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
    }
}
