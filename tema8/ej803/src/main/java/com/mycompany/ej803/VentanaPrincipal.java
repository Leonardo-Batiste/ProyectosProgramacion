package com.mycompany.ej803;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class VentanaPrincipal {
    
    private JFrame frame;
    private JPanel buttonPanel;
    private JLabel actualColor;
    
    
    private int redTotalClicks;
    private JLabel redTotalCounter;
    
    private int greenTotalClicks;
    private JLabel greenTotalCounter;
    
    private int blueTotalClicks;
    private JLabel blueTotalCounter;
    
    private int yellowTotalClicks;
    private JLabel yellowTotalCounter;
    
    
    public VentanaPrincipal(){
        initComponents();
    }
    
    private void initComponents(){
        frame = new JFrame();
    
        buttonPanel = new JPanel(new GridLayout(5,2));
        
        addColorButton("Red", e -> onRedClicked());
        redTotalClicks = 0;
        redTotalCounter = new JLabel("" + redTotalClicks);
        buttonPanel.add(redTotalCounter);
        
        
        addColorButton("Green", e -> onGreenClicked());
        greenTotalClicks = 0;
        greenTotalCounter = new JLabel("" + greenTotalClicks);
        buttonPanel.add(greenTotalCounter);
        
        addColorButton("Blue", e -> onBlueClicked());
        blueTotalClicks = 0;
        blueTotalCounter = new JLabel("" + blueTotalClicks);
        buttonPanel.add(blueTotalCounter);
        
        addColorButton("Yellow", e -> onYellowClicked());
        yellowTotalClicks = 0;
        yellowTotalCounter = new JLabel("" + yellowTotalClicks);
        buttonPanel.add(yellowTotalCounter);
        
        actualColor = new JLabel("Nothing");
        buttonPanel.add(actualColor);
        buttonPanel.add(new JLabel(""));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        frame.add(buttonPanel);
        
        frame.pack();
        
        frame.setVisible(true);
        
    }
    
    private void addColorButton(String nameButtonColor, ActionListener listener){
        JButton button = new JButton(nameButtonColor);
        
        button.addActionListener(listener);
        
        buttonPanel.add(button);
        
    }
    
    private void onRedClicked(){
        
        buttonPanel.setBackground(Color.red);
        
        actualColor.setText("Red");
        
        redTotalCounter.setText("" + ++redTotalClicks);
        
    }
    
    private void onGreenClicked(){
        
        buttonPanel.setBackground(Color.green);
        
        actualColor.setText("Green");
        
        greenTotalCounter.setText("" + ++greenTotalClicks);
        
    }
    
    private void onBlueClicked(){
        
        buttonPanel.setBackground(Color.blue);
        
        actualColor.setText("Blue");
        
        blueTotalCounter.setText("" + ++blueTotalClicks);
        
    }
    
    private void onYellowClicked(){
        
        buttonPanel.setBackground(Color.yellow);
        
        actualColor.setText("Yellow");
        
        yellowTotalCounter.setText("" + ++yellowTotalClicks);
        
    }
    
}
