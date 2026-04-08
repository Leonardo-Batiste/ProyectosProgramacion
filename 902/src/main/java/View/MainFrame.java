package View;

import java.awt.*;
import java.awt.event.*;
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
        
        initSouth();
        
        mainFrame.add(mainPanel);
        
        mainFrame.pack();
        
        crearCloseOperation();
        
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
        existeFichero.setEnabled(false);
        
        existeFicheroL = new JLabel("Existe");
        
        permisoEscritura = new JCheckBox();
        permisoEscritura.setEnabled(false);
        
        permisoEscrituraL = new JLabel("Permisos escritura");
        
        permisoLectura = new JCheckBox();
        permisoLectura.setEnabled(false);
        
        permisoLecturaL = new JLabel("Permisos de lectura");
        
        center.add(existeFichero);
        
        center.add(existeFicheroL);
        
        center.add(permisoEscritura);
        
        center.add(permisoEscrituraL);
        
        center.add(permisoLectura);
        
        center.add(permisoLecturaL);
        
        mainPanel.add(center, BorderLayout.CENTER);
    }
    
    private JPanel south;
    private JButton limpiar;
    
    private void initSouth(){
        south = new JPanel();
        
        limpiar = new JButton("Limpiar Formulario");
        
        south.add(limpiar);
        
        mainPanel.add(south, BorderLayout.SOUTH);
    }
    
    public void showFrame(){
        mainFrame.setVisible(true);
    }
    
    public void hideFrame(){
        mainFrame.setVisible(false);
    }
    
    private void crearCloseOperation(){

    WindowListener exitListener = new WindowAdapter() {

        @Override
        public void windowClosing(WindowEvent e) {
            int confirm = JOptionPane.showOptionDialog(
                 null, "Seguro de que quieres cerrar la aplicacion?", 
                 "Confirmar Salida", JOptionPane.YES_NO_OPTION, 
                 JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (confirm == 0) {
               System.exit(0);
            }
        }
    };
    
    mainFrame.addWindowListener(exitListener);

    }

    private JLabel esResultado;
    private JLabel esResultado2;
    
    public void crearEsDirectorio(Integer numeroArchivosIntroducido){
        if (esResultado != null){
            limpiarFormulario();
        }
        
        
        esResultado = new JLabel("Es un Directorio");
        
        esResultado2 = new JLabel("Tiene " + numeroArchivosIntroducido + " archivos");
        
        center.add(esResultado);
        
        center.add(esResultado2);
        
        center.revalidate();
        
        center.repaint();
    }
    
    public void crearEsFichero(String espacioOcupado){
        if (esResultado != null){
            limpiarFormulario();
        }
        
        esResultado = new JLabel("Es un FICHERO");
        
        esResultado2 = new JLabel("Ocupa " + espacioOcupado + " bytes");
        
        center.add(esResultado);
        
        center.add(esResultado2);
        
        center.revalidate();
        
        center.repaint();
    }
    
    public void limpiarFormulario(){
        cajaTexto.setText("");
        
        existeFichero.setSelected(false);
        
        permisoEscritura.setSelected(false);
        
        permisoLectura.setSelected(false);
        
        center.remove(esResultado);
        
        center.remove(esResultado2);
        
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

    public JButton getLimpiar() {
        return limpiar;
    }
    
    
}
