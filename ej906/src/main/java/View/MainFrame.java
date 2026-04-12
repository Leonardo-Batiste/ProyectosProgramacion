package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowStateListener;
import javax.swing.*;

public class MainFrame {
    public MainFrame (){
        initComponents();
    }
    
    private JFrame mainFrame;
    private JPanel mainPanel;
    
    private void initComponents(){
        mainFrame = new JFrame("Copia archivos");
        mainPanel = new JPanel(new BorderLayout());
        
        initCenter();
        
        initSouth();
        
        mainFrame.add(mainPanel);
        
        mainFrame.pack();
        
        mainFrame.setLocationRelativeTo(null);
        
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    private JPanel center;
    private JLabel origenL;
    private JTextField origen;
    private JLabel destinoL;
    private JTextField destino;
    
    private void initCenter(){
        center = new JPanel(new GridLayout(0,2));
        
        origenL = new JLabel("Origen");
        origen = new JTextField();
        destinoL = new JLabel("Destino");
        destino = new JTextField();
        
        center.add(origenL);
        center.add(origen);
        center.add(destinoL);
        center.add(destino);
        
        mainPanel.add(center, BorderLayout.CENTER);
    }
    
    private JPanel south;
    private JButton confirmar;
    
    private void initSouth(){
        south = new JPanel(new GridLayout(0,1));
        confirmar = new JButton("Crear copia");
        
        south.add(confirmar);
        
        mainPanel.add(south, BorderLayout.SOUTH);
    }
    
    public void showFrame(){
        mainFrame.setVisible(true);
    }
    
    public void hideFrame(){
        mainFrame.setVisible(false);
    }

    public JTextField getOrigen() {
        return origen;
    }

    public JTextField getDestino() {
        return destino;
    }

    public JButton getConfirmar() {
        return confirmar;
    }
    
    
    
}
