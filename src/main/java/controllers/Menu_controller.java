/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.ListMenu_model;
import dao.Menu_dao;
import dao.Menu_interface;
import java.util.List;
import javax.swing.JOptionPane;
import models.Menu_model;
import views.EditMenu_modal;
import views.Main_views;
import views.TambahMenu_modal;

/**
 *
 * @author khoir
 */
public class Menu_controller {
    
    private List<Menu_model> listMenu;
    private Main_views mainView;
    private TambahMenu_modal tambahMenuModal;
    private EditMenu_modal editMenuModal;
    private Menu_interface menuIntf;
    
    public Menu_controller(Main_views mainView){
       this.mainView = mainView;
       menuIntf = new Menu_dao();
       listMenu = menuIntf.getAll();
       
    }    
    public Menu_controller(TambahMenu_modal tambahMenuModal, Main_views mainView){
        this.tambahMenuModal = tambahMenuModal;
        this.mainView = mainView;
        menuIntf = new Menu_dao();

    }
    public Menu_controller(EditMenu_modal editMenuModal, Main_views mainView){
        this.editMenuModal = editMenuModal;
        this.mainView = mainView;
        menuIntf = new Menu_dao();
       
    }
    
    public void isiList(){
       listMenu = menuIntf.getAll();
       ListMenu_model listMenuModel = new ListMenu_model(listMenu);
       mainView.getList_menu().setModel(listMenuModel);
    }
    public int getIdAt(int index){
        listMenu = menuIntf.getAll();
        ListMenu_model id = new ListMenu_model(listMenu);
        return id.getIdAt(index);
    }
    public void resetInputMenu(){
        tambahMenuModal.getIn_menu().setText("");
        tambahMenuModal.getIn_harga().setText("");
        tambahMenuModal.getIn_jenis().setText("");
        tambahMenuModal.getIn_stok().setText("");
    }
    public void resetUpdateMenu(){
        editMenuModal.getIn_menu().setText("");
        editMenuModal.getIn_harga().setText("");
        editMenuModal.getIn_jenis().setText("");
        editMenuModal.getIn_stok().setText("");
    }
    
    public boolean insertMenu(){
        Menu_model menuModel = new Menu_model();
        String menu = tambahMenuModal.getIn_menu().getText();
        String jenis = tambahMenuModal.getIn_jenis().getText();
        int stok = Integer.valueOf(tambahMenuModal.getIn_stok().getText());
        double harga = Double.valueOf(tambahMenuModal.getIn_harga().getText());
        
        if("".equals(menu)){
           JOptionPane.showMessageDialog(null, "Menu tidak boleh kosong");
           return false;
        }
        if("".equals(jenis)){
           JOptionPane.showMessageDialog(null, "Jenis tidak boleh kosong");
           return false;
        }
        
        menuModel.setMenu(menu);
        menuModel.setJenis(jenis);
        menuModel.setStok(stok);
        menuModel.setHarga(harga);
        
        menuIntf.insert(menuModel);
        
        return true;
    }
    public void deleteMenu(int id){
        menuIntf.delete(id);
        JOptionPane.showMessageDialog(null, "Menu berhasil dihapus");
    }
    public void editMenu(int id){
        editMenuModal = new EditMenu_modal(mainView,true);
        editMenuModal.getId_menu().setText(String.valueOf(menuIntf.getById(id).getId()));
        editMenuModal.getIn_menu().setText(menuIntf.getById(id).getMenu());
        editMenuModal.getIn_jenis().setText(menuIntf.getById(id).getJenis());
        editMenuModal.getIn_stok().setText(String.valueOf(menuIntf.getById(id).getStok()));
        editMenuModal.getIn_harga().setText(String.valueOf(menuIntf.getById(id).getHarga()));
        editMenuModal.setVisible(true);
    }
    public boolean updateMenu(){
        Menu_model menuModel = new Menu_model();
        int id = Integer.valueOf(editMenuModal.getId_menu().getText());
        String menu = editMenuModal.getIn_menu().getText();
        String jenis = editMenuModal.getIn_jenis().getText();
        int stok = Integer.valueOf(editMenuModal.getIn_stok().getText());
        double harga = Double.valueOf(editMenuModal.getIn_harga().getText());
        
        if("".equals(menu)){
           JOptionPane.showMessageDialog(null, "Menu tidak boleh kosong");
           return false;
        }
        if("".equals(jenis)){
           JOptionPane.showMessageDialog(null, "Jenis tidak boleh kosong");
           return false;
        }
        
        menuModel.setMenu(menu);
        menuModel.setJenis(jenis);
        menuModel.setStok(stok);
        menuModel.setHarga(harga);
        
        menuIntf.update(id, menuModel);
        
        return true;
    }
    public void updateStok(List<Menu_model> listPesanan){
        
        for(int i=0; i < listPesanan.size(); i++){
            menuIntf.updateStok(listPesanan.get(i));            
        }
    }
    
}
