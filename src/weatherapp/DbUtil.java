/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Madhav
 */
public class DbUtil {
     private final String url = "jdbc:mysql://database-1.colhykawpmvw.us-west-2.rds.amazonaws.com:3306/user";
     private final String user = "admin";
     private final String password = "madhav123";
     Connection conn = null;
     public Connection connect() {
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the SQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
