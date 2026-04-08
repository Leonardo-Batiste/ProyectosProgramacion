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
    private JTextField cajaTexto;
    
    private void initNorth(){
        north = new JPanel(new GridLayout(0,1));
        
        header = new JLabel("FICHEROS");
        
        cajaTexto = new JTextField();
        
        north.add(header);
        
        north.add(cajaTexto);
        
        mainPanel.add(north, BorderLayout.NORTH);
    }
    
    private JPanel center;
    private JCheckBox existeFichero;
    private JLabel existeFicheroL;
    private JCheckBox permisoEscritura;
    private JLabel permisoEscrituraL;
    private JCheckBox permisoLectura;
    private JLabel permisoLecturaL;
    
    private void initCenter(){
        center = new JPanel(new GridLayout(0,2));
        
        existeFichero = new JCheckBox();
        
        existeFicheroL = new JLabel("Existe");
        
        permisoEscritura = new JCheckBox();
        
        permisoEscrituraL = new JLabel("Permisos escritura");
        
        permisoLectura = new JCheckBox();
        
        permisoLecturaL = new JLabel("Permisos de lectura");
        
        center.add(existeFichero);
        
        center.add(existeFicheroL);
        
        center.add(permisoEscritura);
        
        center.add(permisoEscrituraL);
        
        center.add(permisoLectura);
        
        center.add(permisoLecturaL);
        
        mainPanel.add(center, BorderLayout.CENTER);
    }
    
    public void showFrame(){
        mainFrame.setVisible(true);
    }
    
    public void hideFrame(){
        mainFrame.setVisible(false);
    }

    private JLabel esDirectorio;
    private JLabel numeroArchivos;
    
    public void crearEsDirectorio(Integer numeroArchivosIntroducido){
        //FIXME Falta algo, para que no se cree mas de una vez cuando se pulse enter
        
        esDirectorio = new JLabel("Es un Directorio");
        
        numeroArchivos = new JLabel("Tiene " + numeroArchivosIntroducido + " archivos");
        
        center.add(esDirectorio);
        
        center.revalidate();
        
        center.repaint();
    }
    
    private JLabel esFichero;
    private JLabel espacio;
    
    public void crearEsFichero(String espacioOcupado){
        //FIXME Falta algo, para que no se cree mas de una vez cuando se pulse enter
        
        esFichero = new JLabel("Es un FICHERO");
        
        espacio = new JLabel("Ocupa " + espacioOcupado);
        
        center.add(esFichero);
        
        center.add(espacio);
        
        center.revalidate();
        
        center.repaint();
    }

    public JTextField getCajaTexto() {
        return cajaTexto;
    }

    public JCheckBox getExisteFichero() {
        return existeFichero;
    }

    public JCheckBox getPermisoEscritura() {
        return permisoEscritura;
    }

    public JCheckBox getPermisoLectura() {
        return permisoLectura;
    }
    
    
}
