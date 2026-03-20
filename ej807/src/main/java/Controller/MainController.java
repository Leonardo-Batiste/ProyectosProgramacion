package Controller;

import View.*;

public class MainController {
    
    private VentanaPrincipal view;
    
    private AltaCoche AltaCocheVentana;
    
    public MainController(){
        
        view = new VentanaPrincipal();
        
        view.getAltaCocheBtn().addActionListener(e -> onAltaCoche());
        
        view.getFinBtn().addActionListener(e -> onFin());
        
        
        view.show();
        
    }
    
    private void onAltaCoche(){
        
        AltaCocheVentana = new AltaCoche();
        
        AltaCocheVentana.showFrame();
        
    }
    
    private void onFin(){
        
        System.exit(0);
        
    }
    
}
