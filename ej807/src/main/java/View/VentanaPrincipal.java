package View;

import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal {
    
    public VentanaPrincipal(){
        
        initComponents();
        
    }
    
    JFrame mainFrame;
    
    JPanel mainPanel;
    
    JButton altaCocheBtn;
    
    JButton finBtn;
    
    private void initComponents(){
        
        mainFrame = new JFrame("Alta Coche");
        
        mainPanel = new JPanel(new FlowLayout());
        
        altaCocheBtn.setText("Alta coche");
        
        finBtn.setText("Fin");
        
        mainPanel.add(altaCocheBtn);
        
        mainPanel.add(finBtn);
        
        mainFrame.add(mainPanel);
        
        mainFrame.pack();
        
        mainFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        
        mainFrame.setVisible(true);
        
    }
    
}
