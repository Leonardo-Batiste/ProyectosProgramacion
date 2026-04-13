package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class MainFrame {
    public MainFrame(){
        initComponents();
    }
    
    private JFrame mainFrame;
    private JPanel mainPanel;
    
    private void initComponents(){
        mainFrame = new JFrame("LOS ENLACES");
        mainPanel = new JPanel(new BorderLayout());
        
        initNorth();
        initCenter();
        initSouth();
        
        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
    }
    
    private JPanel north;
    private JLabel headerL;
    
    private void initNorth(){
        north = new JPanel(new GridLayout(0,1));
        headerL = new JLabel("ALMACENES ACME");
        
        north.add(headerL);
        mainPanel.add(north, BorderLayout.NORTH);
    }
    
    private JPanel center;
    private JLabel codigoL;
    private JTextField codigo;
    private JLabel cantidadL;
    private JTextField cantidad;
    
    private void initCenter(){
        center = new JPanel(new GridLayout(0,2));
        codigoL = new JLabel("CODIGO");
        codigo = new JTextField();
        cantidadL = new JLabel("CANTIDAD");
        cantidad = new JTextField();
        
        center.add(codigoL);
        center.add(codigo);
        center.add(cantidadL);
        center.add(cantidad);
        mainPanel.add(center, BorderLayout.CENTER);
    }
    
    private JPanel south;
    private JButton servirMaterial;
    private JButton fin;
    
    private void initSouth(){
        south = new JPanel();
        servirMaterial = new JButton("SERVIR MATERIAL");
        fin = new JButton("FIN");
        
        south.add(servirMaterial);
        south.add(fin);
        mainPanel.add(south, BorderLayout.SOUTH);
    }
    
    public void showFrame(){
        mainFrame.setVisible(true);
    }
    
    public void hideFrame(){
        mainFrame.setVisible(false);
    }

    public JButton getServirMaterial() {
        return servirMaterial;
    }

    public JButton getFin() {
        return fin;
    }
    
    
}
