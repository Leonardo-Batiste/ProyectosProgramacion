package Model;

public class Multimedia extends Ejemplar {
    
    protected String tipoEjemplar;
    
    public Multimedia(String codigoIntroducido, String tituloIntroducido, String tipoEjemplarIntroducido){
        
        super(codigoIntroducido, tituloIntroducido);
        
        if (comprobarMultimedia(tipoEjemplarIntroducido)){
            
            this.tipoEjemplar = tipoEjemplarIntroducido;
            
        }
        else{
            
            //!!!Mostrar un mensaje con JDialog de error.
            
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
