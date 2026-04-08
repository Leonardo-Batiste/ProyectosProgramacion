package Controller;

import View.*;
import java.awt.event.*;
import java.io.File;
import static java.lang.Math.floor;
import javax.swing.*;

public class MainController {
    public MainController(){
        start();
    }
    
    MainFrame mainFrame;
    
    private void start(){
        try {
            mainFrame = new MainFrame();
        
            añadirKeyBindings();
            
            añadirListenersLimpiar();
            
            mainFrame.showFrame();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al start()");
        }
        
    }
    
    private void añadirKeyBindings(){
        try {
            Action anAction = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                ajustarCheckBoxes();
            }
            };

            mainFrame.getCajaTexto().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ENTER"),
                                "doSomething");
            mainFrame.getCajaTexto().getActionMap().put("doSomething",
                                 anAction);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "AJfgpiowAGWA");
        }
        
    }
    
    File fichero;
    
    private void ajustarCheckBoxes(){
        try {
            String cajaTexto = mainFrame.getCajaTexto().getText();
        
            fichero = new File(cajaTexto);

            mainFrame.getExisteFichero().setSelected(fichero.exists());

            mainFrame.getPermisoEscritura().setSelected(fichero.canWrite());

            mainFrame.getPermisoLectura().setSelected(fichero.canRead());

            if (fichero.isDirectory()){
                Integer cantidadArchivos = fichero.listFiles().length;
                mainFrame.crearEsDirectorio(cantidadArchivos);
            }
            else if (fichero.isFile()){
                String tamañoFichero = fichero.length() + "";
                mainFrame.crearEsFichero(tamañoFichero);
            }
            
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al ajustarCheckBoxes()");
        }
    }
    
    private void añadirListenersLimpiar(){
        mainFrame.getLimpiar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                mainFrame.limpiarFormulario();
            }
        });
    }
}
