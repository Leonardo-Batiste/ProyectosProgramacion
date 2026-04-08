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

            if (!fichero.exists()){
                //TODO excepcion?
            }
            mainFrame.getExisteFichero().setSelected(true);

            if (!fichero.canWrite()){
                //TODO excepcion?
            }
            mainFrame.getPermisoEscritura().setSelected(true);

            if (!fichero.canRead()){
                //TODO excepcion?
            }
            mainFrame.getPermisoLectura().setSelected(true);

            //TODO Falta el si es directorio, o fichero y sus subcosas
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al ajustarCheckBoxes()");
        }
    }
}
