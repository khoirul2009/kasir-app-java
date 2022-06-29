/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author khoir
 */
public class TablePesanan_model extends AbstractTableModel {
    List<Menu_model> listMenuModel;
    
    
    private final String[] tableHeaders = { "Menu", "Jenis", "Harga Satuan", "Jumlah"};


    
    public TablePesanan_model(List<Menu_model> listMenuModel){
        this.listMenuModel = listMenuModel;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return tableHeaders[columnIndex];
    }
    
    @Override
    public int getRowCount() {
        return this.listMenuModel.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> listMenuModel.get(rowIndex).getMenu();
            case 1 -> listMenuModel.get(rowIndex).getJenis();
            case 2 -> listMenuModel.get(rowIndex).getHarga();
            case 3 -> listMenuModel.get(rowIndex).getJumlah();
            default -> null;
        };
    }
    
}
