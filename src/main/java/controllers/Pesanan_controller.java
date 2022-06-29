/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.Menu_dao;
import dao.Menu_interface;
import dao.Pesanan_dao;
import dao.Pesanan_interface;
import java.util.List;
import javax.swing.JOptionPane;
import models.Pesanan_model;
import models.TablePesanan_model;
import views.Main_views;
import models.Menu_model;

/**
 *
 * @author khoir
 */
public class Pesanan_controller {
    List<Menu_model> listMenu;
    Main_views mainView;
    Menu_interface menuIntf;
    Pesanan_interface pesananIntf;
    
    
    public Pesanan_controller(Main_views mainView){
       this.mainView = mainView;
       menuIntf = new Menu_dao();
       pesananIntf = new Pesanan_dao();
       
       
    }
    
    public void insertPesanan(int idMenu, int jumlah){
        
       if(listMenu == null){
           listMenu = menuIntf.getById(idMenu,  jumlah);
       }else{           
           listMenu.addAll(menuIntf.getById(idMenu,  jumlah));
       }
       TablePesanan_model tableMenuModel = new TablePesanan_model(listMenu);
       mainView.getTable_pesanan().setModel(tableMenuModel);
       
    }
    public void initTable(){
       TablePesanan_model tableMenuModel = new TablePesanan_model(listMenu);
       mainView.getTable_pesanan().setModel(tableMenuModel);
    }
    
    public List<Menu_model> getListPesanan(){
        return listMenu;
    }
    
    public void removePesanan(){
        int a = mainView.getTable_pesanan().getSelectedRow();
        if (a == -1) {
            JOptionPane.showMessageDialog(null, "Silahkan Pilih baris yang ingin dihapus");
        } else {
            listMenu.remove(a);
        }
        initTable();
    }
    public void savePesanan(int id_nota){
        Pesanan_model pesananModel = new Pesanan_model();
        for(int i=0;i < listMenu.size(); i++){
            pesananModel.setId_nota(id_nota);
            pesananModel.setId_menu(listMenu.get(i).getId());
            pesananModel.setJumlah(listMenu.get(i).getJumlah());
            
            pesananIntf.insert(pesananModel);
        }
        JOptionPane.showMessageDialog(null, "Pesanan telah dibuat");
    }
    public void getTotalBayar(){
        int totalBayar = 0;
        for(int i=0; i< listMenu.size(); i++){
           totalBayar += listMenu.get(i).getHarga() * listMenu.get(i).getJumlah();
        }
        mainView.getTotalBayar().setText(String.valueOf(totalBayar));
    }
    public void clearPesanan(){
        listMenu.clear();
    }
    
}
