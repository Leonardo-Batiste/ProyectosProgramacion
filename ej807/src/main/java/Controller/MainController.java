package Controller;

import View.*;

public class MainController {
    
    private VentanaPrincipal view;

    public MainController(){
        
        view = new VentanaPrincipal();
        
        view.getAltaCocheBtn().addActionListener(e -> onAltaCoche());
        
        view.getFinBtn().addActionListener(e -> onFin());
        
        view.showFrame();
        
    }
    
    private AltaCoche altaCocheVentana;
    
    private void onAltaCoche(){
        
        altaCocheVentana = new AltaCoche();
        
        altaCocheVentana.getAltaBoton().addActionListener(e -> onAlta());
        
        altaCocheVentana.getLimpiarFormularioBoton().addActionListener(e -> onLimpiar());
        
        altaCocheVentana.getVolverBoton().addActionListener(e -> onVolver());
        
        altaCocheVentana.showFrame();
        
    }
    
    private void onAlta(){
        
        
        
    }
    
    private void onLimpiar(){
        
        
        
    }
    
    private void onVolver(){
        
        
        
    }
    
    private void onFin(){
        
        System.exit(0);
        
    }
    
}
