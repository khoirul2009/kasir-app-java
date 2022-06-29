/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.App to edit this template
 */
package main;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import views.Main_views;

/**
 *
 * @author khoir
 */
public class App {
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
}
