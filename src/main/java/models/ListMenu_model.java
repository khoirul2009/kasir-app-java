/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.List;
import javax.swing.AbstractListModel;
import models.Menu_model;
/**
 *
 * @author khoir
 */
public class ListMenu_model extends AbstractListModel {

    List<Menu_model> listMenu;
    
    public ListMenu_model(List<Menu_model> mM){
        this.listMenu = mM;
    }

    
    @Override
    public int getSize() {
        return listMenu.size();
    }

    @Override
    public Object getElementAt(int index) {
        return listMenu.get(index).getMenu();
    }
    public int getIdAt(int index){
        return listMenu.get(index).getId();
    }
    
    
}
