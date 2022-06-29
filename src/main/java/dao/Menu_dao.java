/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import models.Menu_model;
import config.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.Pesanan_model;

/**
 *
 * @author khoir
 */
public class Menu_dao implements Menu_interface {
    public Connection conn;
    List<Menu_model> listMenu;
    final String menu = "SELECT id, menu FROM menu";
    final String menuByid = "SELECT * FROM menu WHERE id=?";
    final String insert = "INSERT INTO menu (menu, jenis, stok, harga) VALUES (?,?,?,?)";
    final String delete = "DELETE FROM menu WHERE id=?";
    final String update = "UPDATE menu SET menu=?, jenis=?, stok=?, harga=? WHERE id=?";
    final String updateStok = "UPDATE menu SET stok=stok-? WHERE id=?";
    Menu_model mM = new Menu_model();
    
    public Menu_dao(){
        conn = Database.connection();
    }
    @Override
    public List<Menu_model> getAll() {
        List<Menu_model> listMenu = null;
        
        try {
            listMenu = new ArrayList<Menu_model>();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(menu);
            
            while(result.next()){
                Menu_model mM = new Menu_model();
                mM.setId(result.getInt("id"));
                mM.setMenu(result.getString("menu"));
                listMenu.add(mM);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return listMenu;
    }

    @Override
    public List<Menu_model> getById(int id, int jumlah) {
        List<Menu_model> listMenu = null;
        PreparedStatement stmt = null;
        try {
            listMenu = new ArrayList<Menu_model>();
            stmt = this.conn.prepareStatement(menuByid, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            while(result.next()){
                Menu_model mM = new Menu_model();
                mM.setId(result.getInt("id"));
                mM.setMenu(result.getString("menu"));
                mM.setJenis(result.getString("jenis"));
                mM.setHarga(result.getDouble("harga"));
                mM.setJumlah(jumlah);
                listMenu.add(mM);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return listMenu;
    }
    @Override
    public Menu_model getById(int id){
        PreparedStatement stmt = null;
        Menu_model menuModel = new Menu_model();
        try {           
            stmt = this.conn.prepareStatement(menuByid, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            while(result.next()){
                menuModel.setId(result.getInt("id"));
                menuModel.setMenu(result.getString("menu"));
                menuModel.setJenis(result.getString("jenis"));
                menuModel.setStok(result.getInt("stok"));
                menuModel.setHarga(result.getDouble("harga"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return menuModel;
    }

    @Override
    public void insert(Menu_model menuModel) {
       
        PreparedStatement  stmt = null;
        try {
            
            stmt = this.conn.prepareStatement(insert, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1,menuModel.getMenu());
            stmt.setString(2, menuModel.getJenis());
            stmt.setInt(3, menuModel.getStok());
            stmt.setDouble(4, menuModel.getHarga());
            stmt.executeUpdate();
            ResultSet result = stmt.getGeneratedKeys();
            while(result.next()){
                mM.setId(result.getInt(1));
            }
        } catch (Exception e) {
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
        }
     }
    @Override
    public void delete(int id){
        PreparedStatement stmt = null;
        try {
            stmt = this.conn.prepareStatement(delete);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(int id, Menu_model menuModel) {
        
        PreparedStatement  stmt = null;
        try {
            
            stmt = this.conn.prepareStatement(update, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1,menuModel.getMenu());
            stmt.setString(2, menuModel.getJenis());
            stmt.setInt(3, menuModel.getStok());
            stmt.setDouble(4, menuModel.getHarga());
            stmt.setInt(5, id);
            stmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
        }
    }
    @Override
    public void updateStok(Menu_model pesananModel){
        PreparedStatement stmt = null;
        try {
            stmt = this.conn.prepareStatement(updateStok);
            stmt.setInt(1, pesananModel.getJumlah());
            stmt.setInt(2, pesananModel.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
        }
    }
    
}
