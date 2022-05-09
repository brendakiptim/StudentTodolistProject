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
public class dbConnection {

    public Connection con;

    public Connection getConnection() {
        //Use try {...}catch(Exception e){} to test for any DB connection errors
        try {
            //STEP 1: Load the mysql driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //STEP 2: Create the connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/TODOLIST", "root", "");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Database connection failed. See error below.");
            System.out.println(e);
            return null;
        }
    }

}
