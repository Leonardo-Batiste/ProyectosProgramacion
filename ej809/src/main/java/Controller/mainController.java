package Controller;
import Model.*;
import View.*;
import java.awt.event.*;


public class mainController {
    
    public mainController(){
        
        start();
        
    }
    
    private void start(){
        
        VentanaPrincipal ventana = new VentanaPrincipal();
        
        ventana.getAltaLibro().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                botonAltaLibro();
                
            }
            
        });
        
        ventana.getAltaMultimedia().addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                botonAltaMultimedia();
                
            }
            
        });
        
        ventana.getFin().addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                botonFinPrograma();
                
            }
            
        });
        
        ventana.showFrame();
        
    }
    
    private void botonAltaLibro(){
        
        
        
    }
    
    private void botonAltaMultimedia(){
        
        
        
    }
    
    private void botonFinPrograma(){
        
        
        
    }
    
}
