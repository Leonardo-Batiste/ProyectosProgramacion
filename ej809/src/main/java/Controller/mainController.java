package Controller;
import Model.*;
import View.*;
import java.awt.event.*;


public class mainController {
    
    public mainController(){
        
        start();
        
    }
    
    VentanaPrincipal ventana;
    
    private void start(){
        
        ventana = new VentanaPrincipal();
        
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
    
    FrameAltaLibro frameAltaLibro;
    
    private void botonAltaLibro(){
        
        ventana.hideFrame();
        
        frameAltaLibro = new FrameAltaLibro();
        
        frameAltaLibro.getConfirmarAltaLibro().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
            }
        });
        
        frameAltaLibro.getSalirAltaLibro().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                ventana.showFrame();
                frameAltaLibro.hideFrame();
            }
        });
        
        frameAltaLibro.showFrame();
        
    }
    
    private void botonAltaMultimedia(){
        
        
        
    }
    
    private void botonFinPrograma(){
        
        
    }
    
    
    
}
