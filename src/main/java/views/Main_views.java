/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;


import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.JList;
import javax.swing.JTable;
import controllers.Menu_controller;
import controllers.Nota_controller;
import controllers.Pesanan_controller;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import models.Pesanan_model;



/**
 *
 * @author khoir
 */
public class Main_views extends javax.swing.JFrame {

    /**
     * Creates new form Main_views
     */
    Menu_controller menuController;
    Pesanan_controller pesananController;
    Nota_controller notaController;
    public Main_views() {
        initComponents();
        menuController = new Menu_controller(this);
        pesananController = new Pesanan_controller(this);
        notaController = new Nota_controller(this);
        menuController.isiList();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_pesanan = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        submitPesan = new javax.swing.JButton();
        tambah_menu = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_menu = new javax.swing.JList<>();
        in_jumlah = new javax.swing.JTextField();
        btn_pesan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        in_uang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalBayar = new javax.swing.JLabel();
        editMenu = new javax.swing.JButton();
        deleteMenu = new javax.swing.JButton();
        riwayatTransaksi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Kasir Warteg");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Kasir Warteg Sejahtera");

        table_pesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu", "Jenis", "Harga", "Jumlah"
            }
        ));
        jScrollPane1.setViewportView(table_pesanan);

        jLabel1.setText("Menu");

        jLabel4.setText("Pesanan");

        submitPesan.setText("Submit Pesanan");
        submitPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitPesanActionPerformed(evt);
            }
        });

        tambah_menu.setText("Tambah Menu");
        tambah_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_menuActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus Pesanan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        list_menu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_menuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list_menu);

        btn_pesan.setText("Pesan");
        btn_pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesanActionPerformed(evt);
            }
        });

        jLabel5.setText("Jumlah");

        jLabel6.setText("Uang ");

        jLabel7.setText("Total Bayar : ");

        totalBayar.setText("0");

        editMenu.setText("Edit Menu");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });

        deleteMenu.setText("Hapus Menu");
        deleteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuActionPerformed(evt);
            }
        });

        riwayatTransaksi.setText("Riwayat Transaksi");
        riwayatTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riwayatTransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(351, 351, 351))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(in_jumlah)
                                        .addComponent(btn_pesan, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel5))))
                            .addComponent(tambah_menu))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(in_uang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(submitPesan))
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(riwayatTransaksi))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(editMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deleteMenu)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(deleteMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah_menu)
                    .addComponent(jButton3)
                    .addComponent(riwayatTransaksi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitPesan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(in_uang)
                            .addComponent(totalBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(in_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pesan)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitPesanActionPerformed
        // TODO add your handling code here:
        int id_nota = notaController.saveNota();
        if(id_nota > 0){
            pesananController.savePesanan(id_nota);
            menuController.updateStok(pesananController.getListPesanan());
            pesananController.clearPesanan();            
            in_jumlah.setText("");
            in_uang.setText("");
            totalBayar.setText("");
            pesananController.initTable();
        }
        
    }//GEN-LAST:event_submitPesanActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        pesananController.removePesanan();
        pesananController.getTotalBayar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void list_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_menuMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_list_menuMouseClicked

    private void btn_pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesanActionPerformed
        // TODO add your handling code here:
        int index = list_menu.getSelectedIndex();
        if(index < 0){
            JOptionPane.showMessageDialog(null, "Mohon pilih menu");
            return; 
        }
        if("".equals(in_jumlah.getText())){
            JOptionPane.showMessageDialog(null, "Mohon masukkan jumlah pesanan");
            return;
        }
        int id = menuController.getIdAt(index);
        int jumlah = Integer.valueOf(in_jumlah.getText());
        pesananController.insertPesanan(id, jumlah);
        pesananController.getTotalBayar();
    }//GEN-LAST:event_btn_pesanActionPerformed

    private void tambah_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_menuActionPerformed
        // TODO add your handling code here:
        new TambahMenu_modal(Main_views.this, true).setVisible(true);
        
    }//GEN-LAST:event_tambah_menuActionPerformed

    private void deleteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuActionPerformed
        // TODO add your handling code here:
        int index = list_menu.getSelectedIndex();
        if(index < 0){
            JOptionPane.showMessageDialog(null, "Mohon pilih menu yang ingin dihapus");
            return;
        }
        int id = menuController.getIdAt(index);
        menuController.deleteMenu(id);
        menuController.isiList();
        
    }//GEN-LAST:event_deleteMenuActionPerformed

    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
        // TODO add your handling code here:
        int index = list_menu.getSelectedIndex();
        if(index < 0){
            JOptionPane.showMessageDialog(null, "Mohon pilih menu yang ingin diedit");
            return;
        }
        int id = menuController.getIdAt(index);
        menuController.editMenu(id);
        
    }//GEN-LAST:event_editMenuActionPerformed

    private void riwayatTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayatTransaksiActionPerformed
        // TODO add your handling code here:
        new RiwayatTransaksi_modal(Main_views.this, true).setVisible(true);
    }//GEN-LAST:event_riwayatTransaksiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        try {
        UIManager.setLookAndFeel(new FlatIntelliJLaf());
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_views().setVisible(true);
            }
        });
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main_views.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pesan;
    private javax.swing.JButton deleteMenu;
    private javax.swing.JButton editMenu;
    private javax.swing.JTextField in_jumlah;
    private javax.swing.JTextField in_uang;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> list_menu;
    private javax.swing.JButton riwayatTransaksi;
    private javax.swing.JButton submitPesan;
    private javax.swing.JTable table_pesanan;
    private javax.swing.JButton tambah_menu;
    private javax.swing.JLabel totalBayar;
    // End of variables declaration//GEN-END:variables

    public JList<String> getList_menu() {
        return list_menu;
    }

    public void setList_menu(JList<String> list_menu) {
        this.list_menu = list_menu;
    }

    public JTable getTable_pesanan() {
        return table_pesanan;
    }

    public void setTable_pesanan(JTable table_pesanan) {
        this.table_pesanan = table_pesanan;
    }

    public JLabel getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(JLabel totalBayar) {
        this.totalBayar = totalBayar;
    }

    public JTextField getIn_uang() {
        return in_uang;
    }

    public void setIn_uang(JTextField in_uang) {
        this.in_uang = in_uang;
    }

    
}
