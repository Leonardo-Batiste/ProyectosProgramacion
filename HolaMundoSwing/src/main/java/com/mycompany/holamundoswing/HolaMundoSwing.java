package com.mycompany.holamundoswing;

import javax.swing.*; //Importa la libreria de Swing

public class HolaMundoSwing {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana hola mundo"); //Es una ventana de aplicacion
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //
        
        JLabel label = new JLabel ("Hola Mundo"); //
        
        frame.add(label); //
        
        frame.pack(); //
        
        frame.setLocationRelativeTo(null); //
        
        frame.setVisible(true); //
        
        
        
        
    }
}