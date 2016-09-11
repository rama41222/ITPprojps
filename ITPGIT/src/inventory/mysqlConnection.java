/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.sql.*;
import javax.swing.*;

public class mysqlConnection {
    
    private static Connection conn = null;
    private static final String JDBC_Driver = "com.mysql.jdbc.Driver";
    private static final String DB_URL="jdbc:mysql://localhost:3306/powersteelserp";
    
    private static final String USER = "root";
    
    public static Connection connDb(){
        
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...........");
            conn=DriverManager.getConnection(DB_URL,USER,"" );
            return conn;
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        System.exit(0);
        return null;
        }
  
        
        
    }
}
