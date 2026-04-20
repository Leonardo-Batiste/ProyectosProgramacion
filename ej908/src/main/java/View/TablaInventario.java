package View;

import java.awt.FlowLayout;
import java.io.*;
import javax.swing.*;

public class TablaInventario {
    public TablaInventario(){
        initComponents();
    }
    
    private JFrame mainFrame;
    private JPanel mainPanel;
    
    private void initComponents(){
        mainFrame = new JFrame();
        
        mainPanel = new JPanel(new FlowLayout());
        
        mainFrame.add(mainPanel);
        
        mainFrame.pack();
        
        mainFrame.setLocationRelativeTo(null);
        
        mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
    }
    
    public void showFrame(){
        mainFrame.setVisible(true);
    }
    
    public void hideFrame(){
        mainFrame.setVisible(false);
    }
}
