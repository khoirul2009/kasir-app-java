/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import models.Pesanan_model;

/**
 *
 * @author khoir
 */
public interface Pesanan_interface {
    public List<Pesanan_model> getAll();
    public void insert(Pesanan_model pmod);
    
}
