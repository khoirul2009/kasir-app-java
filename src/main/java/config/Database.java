/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author khoir
 */
public class Database {
    
    public static Connection conn;
    
    public static Connection connection(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warteg", "root", "");
            System.out.println("Koneksi Database sukses");
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        return conn;
    }
    
}
