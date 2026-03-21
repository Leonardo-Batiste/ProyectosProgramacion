package View;

import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal {
    
    public VentanaPrincipal(){
        
        initComponents();
        
    }
    
    private JFrame mainFrame;
    
    private JPanel mainPanel;
    
    private JButton altaCocheBtn;
    
    private JButton finBtn;
    
    private void initComponents(){
        
        mainFrame = new JFrame("Alta Coche");
        
        mainPanel = new JPanel(new FlowLayout());
        
        altaCocheBtn = new JButton("Alta coche");
        
        finBtn = new JButton("Fin");
        
        mainPanel.add(altaCocheBtn);
        
        mainPanel.add(finBtn);
        
        mainFrame.add(mainPanel);
        
        mainFrame.pack();
        
        mainFrame.setLocationRelativeTo(null);
        
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }

    public JButton getAltaCocheBtn() {
        return altaCocheBtn;
    }

    public JButton getFinBtn() {
        return finBtn;
    }
    
    public void showFrame(){
        
        mainFrame.setVisible(true);
        
    }
    
    public void hideFrame(){
        
        mainFrame.setVisible(false);
        
    }
    
}
