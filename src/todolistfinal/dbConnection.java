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

    static void getConnection() {

        try {
//            Step one; Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
//               step two get the connection

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/todolist", "root", "");
            if (con != null) {
                System.out.println("Connection Successful");
//                    step 3 query data from the database
                Statement command = con.createStatement();
//                    step 4 output the results
                ResultSet results = command.executeQuery("select * from users;");
                while (results.next()) {
                    System.out.println("username is " + results.getString(1) + " password is " + results.getString(2) + " role is " + results.getString(3));
                }

            } else {
                System.out.println("Error connecting to database");
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {

            System.out.println("Error" + e.getMessage());
        }
    }

    //main function
    public static void main(String[] args) {

        getConnection();
    }

}
