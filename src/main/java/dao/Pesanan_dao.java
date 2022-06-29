/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import config.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import models.Pesanan_model;

/**
 *
 * @author khoir
 */
public class Pesanan_dao implements Pesanan_interface {
    public Connection conn;
    final String select = "SELECT * FROM pesanan WHERE";
    final String insert = "INSERT INTO pesanan VALUES (?, ?, ?)";
   
    
    public Pesanan_dao(){
        this.conn = Database.connection();
    }
    @Override
    public List<Pesanan_model> getAll() {
        return null;
    }
    
    @Override
    public void insert(Pesanan_model pmod ){
        PreparedStatement stmt = null;
        try {
            stmt = this.conn.prepareStatement(insert);
            stmt.setInt(1, pmod.getId_nota());
            stmt.setInt(2, pmod.getId_menu());
            stmt.setInt(3, pmod.getJumlah());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
        }
    }
    
}
