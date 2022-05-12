/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolistfinal;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

/**
 *
 * @author kiptim
 */
public class Utils {

    //send query to db to fetch all existing tasks
    public ResultSet fetchTodos() {
        dbConnection connection = new dbConnection();
        connection.getConnection();
        //Create the statement object for executing queries
        try {
            Statement stmt = connection.con.createStatement();
            //Execute the statement
            ResultSet result = stmt.executeQuery("SELECT * FROM Task ORDER BY isCompleted, dueDate  ASC");

            return result;
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());

            return null;

        }
    }

    //send query to db to fetch all existing users
    public ResultSet fetchUsers() {
        dbConnection connection = new dbConnection();
        connection.getConnection();
        //Create the statement object for executing queries
        try {
            Statement stmt = connection.con.createStatement();
            //Execute the statement
            ResultSet result = stmt.executeQuery("SELECT * FROM users");

            return result;
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());

            return null;

        }
    }

    //add task to the database
    public ResultSet AddTodos(String name, String description, String dueDate) {
        dbConnection connection = new dbConnection();
        connection.getConnection();
        //Create the statement object for executing queries
        try {
            Statement stmt = connection.con.createStatement();
            //Execute the statement
            String command = String.format("INSERT INTO `Task` (`name`, `dueDate`, `description`) VALUES('%s','%s','%s')", name, dueDate, description);
            System.out.println(command);
            stmt.executeUpdate(command);
            ResultSet res = fetchTodos();
            return res;

        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());

            return null;

        }

    }

    //send query to db to fetch all existing tasks
    public int completeTodos(String idTask, int isCompleted) {
        dbConnection connection = new dbConnection();
        connection.getConnection();
        //Create the statement object for executing queries
        try {
            Statement stmt = connection.con.createStatement();
            //Execute the statement
            String command = String.format("UPDATE Task SET `isCompleted` = '%s' WHERE `Task`.`idTask` = %s", isCompleted, idTask);
            int resi = stmt.executeUpdate(command);

            return resi;
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());

            return 0;

        }
    }

    //send query to delete todos
    public int deleteTodos(String idTask) {
        dbConnection connection = new dbConnection();
        connection.getConnection();
        //Create the statement object for executing queries
        try {
            Statement stmt = connection.con.createStatement();
            //Execute the statement
            String command = String.format("DELETE FROM Task WHERE `Task`.`idTask` = %s", idTask);
            System.out.println("command" + command);
            int result = stmt.executeUpdate(command);

            return result;
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());

            return 0;

        }
    }

    public ResultSet createUser(String username, String password, String role) {
       

        dbConnection connection = new dbConnection();
        connection.getConnection();
        //Create the statement object for executing queries
        try {
            Statement stmt = connection.con.createStatement();
            //Execute the statement
            String command = String.format("INSERT INTO `users` (`username`, `password`, `role`) VALUES ('%s', '%s', '%s')", username, password, role);

            System.out.println(command);

            int res = stmt.executeUpdate(command);
            ResultSet result = fetchUsers();

            return result;
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());

            return null;

        }
    }

    public String encryptPass(String password) {
        try {
            //retrieve instance of the encryptor of SHA-256
            MessageDigest digestor = MessageDigest.getInstance("SHA-256");
            //retrieve bytes to encrypt
            byte[] encodedhash = digestor.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder encryptionValue = new StringBuilder(2 * encodedhash.length);
            //perform encryption
            for (int i = 0; i < encodedhash.length; i++) {
                String hexVal = Integer.toHexString(0xff & encodedhash[i]);
                if (hexVal.length() == 1) {
                    encryptionValue.append('0');
                }
                encryptionValue.append(hexVal);
            }
            //return encrypted value
            return encryptionValue.toString();
        } catch (NoSuchAlgorithmException ex) {
            return ex.getMessage();
        }
    }
}
