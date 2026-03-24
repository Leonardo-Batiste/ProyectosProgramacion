package View;

import java.awt.FlowLayout;
import javax.swing.*;

public class VentanaPrincipal {
    
    public VentanaPrincipal(){
        
        initComponents();
        
    }
    
    private JFrame mainFrame;
    private JPanel panelPrincipal;
    private JButton altaLibro;
    private JButton altaMultimedia;
    private JButton fin;
    
    private void initComponents(){
        
        mainFrame = new JFrame("Bibloteca");
        
        panelPrincipal = new JPanel(new FlowLayout());
        
        altaLibro = new JButton("Alta libro");
        
        altaMultimedia = new JButton("Alta multimedia");
        
        fin = new JButton("Fin");
        
        panelPrincipal.add(altaLibro);
        
        panelPrincipal.add(altaMultimedia);
        
        panelPrincipal.add(fin);
        
        mainFrame.add(panelPrincipal);
        
        mainFrame.pack();
        
        mainFrame.setLocationRelativeTo(null);
        
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    
    public void showFrame(){
        
        mainFrame.setVisible(true);
        
    }
    
    public void hideFrame(){
        
        mainFrame.setVisible(false);
        
    }

    public JButton getAltaLibro() {
        return altaLibro;
    }

    public void setAltaLibro(JButton altaLibro) {
        this.altaLibro = altaLibro;
    }

    public JButton getAltaMultimedia() {
        return altaMultimedia;
    }

    public void setAltaMultimedia(JButton altaMultimedia) {
        this.altaMultimedia = altaMultimedia;
    }

    public JButton getFin() {
        return fin;
    }

    public void setFin(JButton fin) {
        this.fin = fin;
    }
    
    
    
}
