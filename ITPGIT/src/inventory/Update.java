/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class Update {
    
    private static PreparedStatement ps = null;
    private static Connection con = null;
    private static ResultSet rs = null;
    private static String query = null;
    private static JTable tbl_name = null;
    
    public static void updateTable(String q, JTable tname){
        query = q;
        tbl_name = tname;
        con = mysqlConnection.connDb();
        try{
            
        ps = con.prepareStatement(query);
        rs = ps.executeQuery();
        tbl_name.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{           
            try{
                rs.close();
                ps.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
}
