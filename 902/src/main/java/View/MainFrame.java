package View;

import java.awt.*;
import javax.swing.*;

public class MainFrame {
    public MainFrame(){
        initComponents();
    }
    
    private JFrame mainFrame;
    private JPanel mainPanel;
    
    private void initComponents(){
        mainFrame = new JFrame("FICHEROS");
        
        mainPanel = new JPanel(new BorderLayout());
        
        initNorth();
        
        initCenter();
        
        mainFrame.add(mainPanel);
        
        mainFrame.pack();
        
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        mainFrame.setLocationRelativeTo(null);
    }
    
    private JLabel header;
    private JPanel north;
    
    private void initNorth(){
        north = new JPanel(new GridLayout(1,1));
        
        header = new JLabel("FICHEROS");
        
        north.add(header);
        
        mainPanel.add(north, BorderLayout.NORTH);
    }
    
    private JPanel center;
    private JTextField cajaTexto;
    private JLabel espacioBlanco;
    private JCheckBox existeFichero;
    private JLabel existeFicheroL;
    private JCheckBox permisoEscritura;
    private JLabel permisoEscrituraL;
    private JCheckBox permisoLectura;
    private JLabel permisoLecturaL;
    
    private void initCenter(){
        center = new JPanel(new GridLayout(8,2));
        
        cajaTexto = new JTextField();
        
        espacioBlanco = new JLabel("");
        
        existeFichero = new JCheckBox();
        
        existeFicheroL = new JLabel("Existe");
        
        permisoEscritura = new JCheckBox();
        
        permisoEscrituraL = new JLabel("Permisos escritura");
        
        permisoLectura = new JCheckBox();
        
        permisoLecturaL = new JLabel("Permisos de lectura");
        
        center.add(cajaTexto);
        
        center.add(espacioBlanco);
        
        center.add(existeFichero);
        
        center.add(existeFicheroL);
        
        center.add(permisoEscritura);
        
        center.add(permisoEscrituraL);
        
        center.add(permisoLectura);
        
        center.add(permisoLecturaL);
        
        //TODO Añadir, si es directorio, mostrar cuantos archivos tiene, y si es fichero, cuanto ocupa
        
        mainPanel.add(center, BorderLayout.CENTER);
    }
    
    public void showFrame(){
        mainFrame.setVisible(true);
    }
    
    public void hideFrame(){
        mainFrame.setVisible(false);
    }
}
