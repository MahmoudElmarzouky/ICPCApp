/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpcapp.Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ncm
 */
public class DatabaseConnection {
private Connection con;
private String url="jdbc:mysql://localhost/icpc";
 public Connection open(){ 
     try{   
     Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");        
       return con;  
     } catch (Exception ex) {
            ex.printStackTrace();
        return con;
     }
}
 public void close() throws SQLException{
 con.close();
 }
}