/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolistfinal;

import java.sql.*;

/**
 *
 * @author kiptim
 */
public class NewDbConnection {

    enum RoleInput {
        student, teacher, admin
    }

    enum commandType {
        update, query
    }

    // function to create a new user
    static void createRow(String name, RoleInput role, String password) {
        String command = String.format("insert into users(username, role, password) values('%s','%s','%s')", name,
                password, role);
        System.out.println(command);
        getConnection(command, commandType.update);

    }

    // function to updateuser
    static void updateRow(String field, String newValue, int id) {

        String command = String.format("UPDATE users SET %s = '%s' WHERE id = %s;", field, newValue, id);
        System.out.println(command);
        getConnection(command, commandType.update);

    }

    // function to select row
    static void selectRow(int id) {

        String command = String.format("SELECT username, role from  users WHERE id = %s;", id);
        System.out.println(command);
        getConnection(command, commandType.query);

    }

    // function to updateuser
    static void deleteRow(int id) {

        String command = String.format("DELETE FROM users WHERE id = %s;", id);
        System.out.println(command);
        getConnection(command, commandType.update);

    }
    static Connection con;

    static Connection getConnection(String query, commandType type) {

        try {
            // Step one; Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // System.out.println("Driver Loaded Successfully");
            // step two get the connection

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TODOLIST", "root", "");
            if (con != null) {
                System.out.println("Connection Successful");
                // step 3 query data from the database
                Statement command = con.createStatement();
                // step 4 output the results
                if (type == commandType.query) {
                    ResultSet results = command.executeQuery(query);
                    while (results.next()) {
                        System.out.println("username is " + results.getString("username") + " role is "
                                + results.getString("role"));
                    }

                } else if (type == commandType.update) {
                    int update = command.executeUpdate(query);
                    System.out.println(update + "rows were affected");
                    ResultSet fetchAll = command.executeQuery("select * from users;");
                    while (fetchAll.next()) {
                        System.out.println("username is " + fetchAll.getString("username") + " role is "
                                + fetchAll.getString("role"));
                    }

                }

            } else {
                System.out.println("Error connecting to database");
            }

        } catch (Exception e) {

            System.out.println("Error" + e.getMessage());
        }
        return con;
    }

    // main function
    public static void main(String[] args) {

        // createRow("CodeTest", RoleInput.student, "myPassword");
        // updateRow("role", "teacher", 1);
        // selectRow(3);
        deleteRow(4);
    }
}
