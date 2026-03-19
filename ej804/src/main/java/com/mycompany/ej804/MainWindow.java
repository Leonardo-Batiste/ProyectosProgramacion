package com.mycompany.ej804;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainWindow {
    
    private JFrame mainFrame;
    
    private JPanel buttonPanel;
    
    private JLabel ammountL;
    
    private JTextField ammount;
    
    private JLabel totalL;
    
    private JLabel finalConversionL;
    
    private double diferenciaDivisas = 0.6;
    
    public MainWindow(){
        initComponents();
    }
    
    private void initComponents(){
        
        mainFrame = new JFrame();
        
        buttonPanel = new JPanel(new GridLayout(3,2));
        
        //Fila 1
        ammountL = new JLabel("Cantidad");
        buttonPanel.add(ammountL);
        
        ammount = new JTextField();
        buttonPanel.add(ammount);
        
        //Fila 2
        addButton("Euros", e -> onEurosClicked());
        
        addButton("Dolares", e -> onDolaresClicked());
        
        //Fila 3
        totalL = new JLabel("Total");
        buttonPanel.add(totalL);
        
        finalConversionL = new JLabel();
        buttonPanel.add(finalConversionL);
        
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        mainFrame.add(buttonPanel);
        
        mainFrame.pack();
        
        mainFrame.setVisible(true);
        
    }
    
    private void addButton(String buttonName, ActionListener listener){
        
        JButton button = new JButton(buttonName);
        
        button.addActionListener(listener);
        
        buttonPanel.add(button);
        
    }
    
    private void onEurosClicked(){
        
        double cantidadFinal = Double.parseDouble(ammount.getText()) * diferenciaDivisas;
        
        finalConversionL.setText(String.valueOf(cantidadFinal));
        
    }
    
    private void onDolaresClicked(){
        
        double cantidadFinal = Double.parseDouble(ammount.getText()) / diferenciaDivisas;
        
        finalConversionL.setText(String.valueOf(cantidadFinal));
        
    }
    
    
    
}
