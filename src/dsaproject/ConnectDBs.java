/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaproject;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;

/**
 *
 * @author MyPC
 */
public class ConnectDBs {
    Connection conn = null;
    public static Connection ConnectDBs(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root","Minhle2610");
            return conn;
        }
        catch(Exception e)
        {   JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
}
}
