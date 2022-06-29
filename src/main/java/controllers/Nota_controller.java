/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.Nota_dao;
import dao.Nota_interface;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import models.Nota_model;
import models.TableTransaksi_model;
import views.Main_views;
import views.RiwayatTransaksi_modal;

/**
 *
 * @author khoir
 */
public class Nota_controller {
    List<Nota_model> listNota;
    Nota_interface notaIntf;
    Main_views mainView;
    RiwayatTransaksi_modal riwayatTransaksi;
    
    public Nota_controller(Main_views mainView){
        notaIntf = new Nota_dao();
        this.mainView = mainView;
        
        
    }
    public Nota_controller(RiwayatTransaksi_modal riwayatTransaksi, Main_views mainView){
        notaIntf = new Nota_dao();
        
        this.riwayatTransaksi = riwayatTransaksi;
        this.mainView = mainView;
        
        
    }
    
    public void getAllTransaksi(){
        this.listNota = notaIntf.getAll();
    }
    
    public void initTable(){
        TableTransaksi_model tableTransaksi = new TableTransaksi_model(listNota);
        riwayatTransaksi.getTable_transaksi().setModel(tableTransaksi);
        
    }
    
    public int saveNota(){
        if("".equals(mainView.getIn_uang().getText())){
            JOptionPane.showMessageDialog(null, "Mohon masukkan uang");
            return 0;
        }
        Nota_model notaModel = new Nota_model();
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        notaModel.setTanggal(date);
        notaModel.setTotal_bayar(Integer.valueOf(mainView.getTotalBayar().getText()));
        notaModel.setKembalian(Integer.valueOf(mainView.getIn_uang().getText()) - Integer.valueOf(mainView.getTotalBayar().getText()));
        return notaIntf.insert(notaModel);
        
    }
}
