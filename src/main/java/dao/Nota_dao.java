/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import config.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Nota_model;

/**
 *
 * @author khoir
 */
public class Nota_dao implements Nota_interface {
    public Connection conn;
    List<Nota_model> listNota;
    final String insert = "INSERT INTO nota (tanggal, total_bayar, kembalian) VALUES (?, ?, ?)";
    final String selectAll = "SELECT * FROM nota ";
    Nota_model nm = new Nota_model();
    
    public Nota_dao(){
        this.conn = Database.connection();
    }

    @Override
    public int insert(Nota_model notaModel) {
        PreparedStatement stmt = null;
        try {
            stmt = this.conn.prepareStatement(insert, stmt.RETURN_GENERATED_KEYS);
            stmt.setDate(1, notaModel.getTanggal());
            stmt.setDouble(2, notaModel.getTotal_bayar());
            stmt.setDouble(3, notaModel.getKembalian());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            while(rs.next()){
                nm.setId(rs.getInt(1));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nm.getId();
        
    }

    @Override
    public List<Nota_model> getAll() {
        List<Nota_model> listNota = null;
        try {
            listNota = new ArrayList<Nota_model>();
            Statement stmt = this.conn.createStatement();
            ResultSet result = stmt.executeQuery(selectAll);
            while(result.next()){
                Nota_model notaModel = new Nota_model();
                notaModel.setId(result.getInt("id"));
                notaModel.setTanggal(result.getDate("tanggal"));
                notaModel.setTotal_bayar(result.getDouble("total_bayar"));
                notaModel.setKembalian(result.getDouble("kembalian"));
                listNota.add(notaModel);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listNota;
    }
    
}
