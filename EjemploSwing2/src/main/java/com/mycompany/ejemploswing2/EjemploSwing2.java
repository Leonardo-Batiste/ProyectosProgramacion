/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploswing2;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author AluDAM
 */
public class EjemploSwing2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana hola mundo");
        
        JPanel panel = new JPanel(new BorderLayout());
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        JLabel label1 = new JLabel ("Etiqueta 1");
        
        JLabel label2 = new JLabel ("Etiqueta 2");
        
        JLabel label3 = new JLabel ("Etiqueta 3");
        
        panel.add("south",label1);
        
        panel.add("north",label2);
        
        panel.add("east",label3);
        
        frame.add(panel);
        
        frame.pack();
        
        frame.setLocationRelativeTo(null);
        
        frame.setVisible(true);
        
    }
}
