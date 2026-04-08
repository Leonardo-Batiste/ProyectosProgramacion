package Controller;

import View.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.JOptionPane;

public class MainController {
    public MainController(){
        start();
    }
    
    MainFrame mf;
    
    private void start(){
        mf = new MainFrame();
        
        crearListenersNorth();
        
        mf.showFrame();
    }
    
    File fichero;
    
    private void crearListenersNorth(){
        mf.getMostrarListado().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                mf.hideFrame();
                fichero = new File(mf.getCampo().getText());
                if (fichero.isDirectory()){
                    mf.mostrarListado(fichero.list());
                }
                else{
                    JOptionPane.showMessageDialog(null, "El fichero seleccionado, no es un directorio o carpeta");
                }
                mf.showFrame();
            }
        });
    }
}
