package com.mycompany.ej804;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainWindow {
    
    private JFrame mainFrame;
    
    private JPanel buttonPanel;
    
    private JLabel ammountL;
    
    private JTextField ammount;
    
    private JLabel TotalL;
    
    private JLabel finalConversionL;
    
    public MainWindow(){
        initComponents();
    }
    
    private void initComponents(){
        
        mainFrame = new JFrame();
        
        buttonPanel = new JPanel(new GridLayout(3,2));
        
        addButton("Euros", e -> onEurosClicked());
        
        addButton("Dolares", e -> onDolaresClicked());
        
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
        
        
    }
    
    private void onDolaresClicked(){
        
        
        
    }
    
    
    
}
