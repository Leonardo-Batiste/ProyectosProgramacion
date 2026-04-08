package View;

import java.awt.*;
import java.io.File;
import javax.swing.*;

public class MainFrame {
    public MainFrame(){
        initComponents();
    }
    
    private JFrame mainFrame;
    private JPanel mainPanel;
    
    private void initComponents(){
        mainFrame = new JFrame();
        
        mainPanel = new JPanel(new BorderLayout());
        
        initNorth();
        
        mainFrame.add(mainPanel);
        
        mainFrame.pack();
        
        mainFrame.setLocationRelativeTo(null);
        
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    private JPanel north;
    private JTextField campo;
    private JButton mostrarListado;
    
    private void initNorth(){
        north = new JPanel(new GridLayout(1,2));
        
        campo = new JTextField();
        
        mostrarListado = new JButton("Mostrar listado");
        
        north.add(campo);
        
        north.add(mostrarListado);
        
        mainPanel.add(north, BorderLayout.NORTH);
    }
    
    public void mostrarListado(String[] listado){
        
        JOptionPane.showMessageDialog(null, listado);
    }
    
    public void showFrame(){
        mainFrame.setVisible(true);
    }
    
    public void hideFrame(){
        mainFrame.setVisible(false);
    }

    public JButton getMostrarListado() {
        return mostrarListado;
    }

    public JTextField getCampo() {
        return campo;
    }
    
    
}
