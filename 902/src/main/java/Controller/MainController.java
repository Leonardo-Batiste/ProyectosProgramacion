package Controller;

import View.*;
import java.io.File;
import javax.swing.JOptionPane;

public class MainController {
    public MainController(){
        start();
    }
    
    MainFrame mainFrame;
    
    private void start(){
        try {
            mainFrame = new MainFrame();
        
            //TODO inputMap de cuando se pulse enter, busque el directorio/fichero, y si funciona, haga ajustarCheckBoxes
            //añadirKeyListener();
            
            mainFrame.showFrame();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al start()");
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
                mainFrame.crearEsDirectorio();
            }
            else if (fichero.isFile()){
                mainFrame.crearEsFichero();
            }
            
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al ajustarCheckBoxes()");
        }
    }
}
