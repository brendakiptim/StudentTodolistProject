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
public class Utils {

    public ResultSet fetchTodos() {
        dbConnection connection = new dbConnection();
        connection.getConnection();
        //Create the statement object for executing queries
        try {
            Statement stmt = connection.con.createStatement();
            //Execute the statement
            ResultSet result = stmt.executeQuery("SELECT * FROM Task");
            return result;
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
            return null;

        }
    }

}
