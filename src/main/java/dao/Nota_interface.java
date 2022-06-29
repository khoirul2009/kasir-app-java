/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import models.Nota_model;

/**
 *
 * @author khoir
 */
public interface Nota_interface {
    public int insert(Nota_model notaModel);
    public List<Nota_model> getAll();
}
