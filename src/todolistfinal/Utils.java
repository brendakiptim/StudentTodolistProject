/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolistfinal;

import java.sql.*;
import static todolistfinal.NewDbConnection.getConnection;

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
            ResultSet result = stmt.executeQuery("SELECT * FROM Task ORDER BY isCompleted  ASC");

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
            System.out.println("command" + command);
            int resi = stmt.executeUpdate(command);
            System.out.println("resi" + resi);

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
            int resi = stmt.executeUpdate(command);
            System.out.println("resi" + resi);

            return resi;
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());

            return 0;

        }
    }

}
