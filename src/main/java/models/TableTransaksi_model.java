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
public class TableTransaksi_model extends AbstractTableModel {
    List<Nota_model> listTransaksi;
    private final String[] tableHeaders = {"Tanggal", "Total Bayar", "Kembalian"};
    
    public TableTransaksi_model(List<Nota_model> listTransaksi){
        this.listTransaksi = listTransaksi;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return tableHeaders[columnIndex];
    }
    
    @Override
    public int getRowCount() {
        return listTransaksi.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       return switch (columnIndex) {
            case 0 -> listTransaksi.get(rowIndex).getTanggal();
            case 1 -> listTransaksi.get(rowIndex).getTotal_bayar();
            case 2 -> listTransaksi.get(rowIndex).getKembalian();
            default -> null;
        };
    }
    
}
