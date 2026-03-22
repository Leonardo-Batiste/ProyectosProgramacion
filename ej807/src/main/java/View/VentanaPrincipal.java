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
    private JButton listar;
    private JButton modificar;
    
    private void initComponents(){
        
        mainFrame = new JFrame("Alta Coche");
        
        mainPanel = new JPanel(new FlowLayout());
        
        altaCocheBtn = new JButton("Alta coche");
        
        finBtn = new JButton("Fin");
        
        listar = new JButton("Listar coches");
        
        modificar = new JButton("Modificar coche");
        
        mainPanel.add(altaCocheBtn);
        
        mainPanel.add(finBtn);
        
        mainPanel.add(listar);
        
        mainPanel.add(modificar);
        
        
        mainFrame.add(mainPanel);
        
        mainFrame.pack();
        
        mainFrame.setLocationRelativeTo(null);
        
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }

    public JButton getAltaCocheBtn() {
        return this.altaCocheBtn;
    }

    public JButton getFinBtn() {
        return this.finBtn;
    }
    
    public JButton getListarBtn(){
        
        return this.listar;
        
    }
    
    public JButton getModificarBtn(){
        
        return this.modificar;
        
    }
    
    public void showFrame(){
        
        mainFrame.setVisible(true);
        
    }
    
    public void hideFrame(){
        
        mainFrame.setVisible(false);
        
    }
    
}
