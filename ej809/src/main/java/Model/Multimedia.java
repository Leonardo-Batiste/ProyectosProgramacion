package Model;

import javax.swing.JOptionPane;

public class Multimedia extends Ejemplar {
    
    protected String tipoEjemplar;
    
    public Multimedia(String codigoIntroducido, String tituloIntroducido, String tipoEjemplarIntroducido){
        
        super(codigoIntroducido, tituloIntroducido);
        
        if (comprobarMultimedia(tipoEjemplarIntroducido)){
            
            this.tipoEjemplar = tipoEjemplarIntroducido;
            
        }
        else{
            
            JOptionPane.showMessageDialog(null, "No se ha podido  crear multimedia, ha ocurrido un error:");
            
        }
        
    }
    
    private boolean comprobarMultimedia(String tipoEjemplarIntroducido){
        
        return comprobarTipoEjemplar(tipoEjemplarIntroducido);
        
    }
    
    private boolean comprobarTipoEjemplar(String tipoEjemplarIntroducido){
        
        String patron = "^video|cd|dvd$";
        
        return tipoEjemplarIntroducido != null 
                && tipoEjemplarIntroducido.matches(patron);
        
    }
    
    protected int getDiasPrestar(){
        
        return 10;
        
    }
    
    @Override
    public String toString(){
        String cadena = "Tipo ejemplar: " + tipoEjemplar;
        return "\n" + super.toString() + cadena;
    }
    
}
