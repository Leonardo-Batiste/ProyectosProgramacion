package Controller;

import View.*;
import Model.*;

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
        
        String matriculaCoche = altaCocheVentana.getMatricula().getText();
        
        String modeloCoche = altaCocheVentana.getModelo().getText();
        
        Double precioCoche = Double.parseDouble(altaCocheVentana.getPrecio().getText());
        
        Coche coche = new Coche(matriculaCoche, modeloCoche, precioCoche);
        
        Coche.añadirCoche(coche);
        
        altaCocheVentana.altaCorrecta(altaCocheVentana.getAltaCocheFrame());
        
        altaCocheVentana.limpiarFormulario();
        
    }
    
    private void onLimpiar(){
        
        altaCocheVentana.limpiarFormulario();
        
    }
    
    private void onVolver(){
        
        
        
    }
    
    private void onFin(){
        
        System.exit(0);
        
    }
    
}
