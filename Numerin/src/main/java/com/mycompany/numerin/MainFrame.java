package com.mycompany.numerin;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class MainFrame {
    public MainFrame(){
        initComponents();
    }
    
    private JFrame mainFrame;
    private JPanel mainPanel;
    Integer filas;
    Integer columnas;
    
    int numeritoGanador = 0;
    
    
    private void initComponents(){
        mainFrame = new JFrame("Numerito");

        crearPanel();
        
        crearBotones();
        
        generarNumeroAleatorio();
        
        //TODO Falta hacer que el usuario pueda repetir
        
        mainFrame.pack();
        
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        mainFrame.setLocationRelativeTo(null);
        
        mainFrame.setVisible(true);
    }
    
    private void crearPanel(){
        int dificultad = Integer.parseInt(JOptionPane.showInputDialog("Selecciona la dificultad: " + "\n"
                + "Facil (1)" + "\n"
                + "Normal (2)" + "\n"
                + "Dificil (3)" + "\n"
                + "Imposible (4)"));
        
        switch (dificultad) {
            case 1:
                filas = 2;
                columnas = 5;
                break;
            case 2:
                filas = 5;
                columnas = 5;
                break;
            case 3:
                filas = 10;
                columnas = 5;
                break;
            case 4:
                filas = 10;
                columnas = 10;
                break;
        }
        
        mainPanel = new JPanel(new GridLayout(filas, columnas));
        
        mainFrame.add(mainPanel);
    }
    
    private void crearBotones(){
        for (int i=1;i<(filas * columnas) + 1;i++){
            JButton boton = new JButton(i + "");
            
            crearListenersBotones(boton);
            
            mainPanel.add(boton);
        }
    }
    
    private void crearListenersBotones(JButton boton){
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String numeroBoton = boton.getText();
                
                if (numeroBoton.equals(numeritoGanador + "")){
                    boton.setBackground(Color.green);
                    JOptionPane.showMessageDialog(null, "Has ganado, has acertado! El numero era: " + numeritoGanador);
                    System.exit(0);
                }
                else{
                    boton.setBackground(Color.red);
                }
            }
        });
    }
    
    private void generarNumeroAleatorio(){
        Random rand = new Random();
        
        numeritoGanador = rand.nextInt(1, (filas * columnas) + 1);
    }
    
    
}
