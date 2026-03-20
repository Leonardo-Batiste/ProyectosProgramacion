package View;

import java.awt.*;
import javax.swing.*;

public class AltaCoche {
    
    public AltaCoche(){
        
        initComponents();
        
    }
    
    
    private JFrame altaCocheFrame;
    private JPanel altaCochePanel;
    
    private void initComponents(){
        
        altaCocheFrame = new JFrame("Alta Coche");
        
        altaCochePanel = new JPanel(new BorderLayout());
        
        
        altaCocheFrame.add(altaCochePanel);
        
        altaCocheFrame.pack();
        
        altaCocheFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    
    public void showFrame(){
        
        altaCocheFrame.setVisible(true);
        
    }
    
    public void hideFrame(){
        
        altaCocheFrame.setVisible(false);
        
    }
    
}
