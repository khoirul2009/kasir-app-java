/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import models.Menu_model;

/**
 *
 * @author khoir
 */
public interface Menu_interface {

    public List<Menu_model> getAll();
    public List<Menu_model> getById(int id, int jumlah);
    public void insert(Menu_model menuModel);
    public void update(int id, Menu_model menuModel);
    public void delete(int id);
    public Menu_model getById(int id);
    public void updateStok(Menu_model pesananModel);
    
}
