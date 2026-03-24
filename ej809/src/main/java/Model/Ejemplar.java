package Model;

import java.util.*;

public abstract class Ejemplar {
    
    /**
     * No repetible
     * 1 letra y 4 numeros
     */
    protected String codigo;
    
    protected static ArrayList<String> listaCodigos;
    
    /**
     * Maximo 30 caracteres
     */
    protected String titulo;
    
    public Ejemplar(String codigoIntroducido, String tituloIntroducido){
        
        if (comprobarEjemplar(codigoIntroducido, tituloIntroducido)){
            
            this.codigo = codigoIntroducido;
            listaCodigos.add(codigoIntroducido);
            
            this.titulo = tituloIntroducido;
            
        }
        else{
            
            //!!!Mostrar un mensaje con JDialog de error.
            
        }
        
    }
    
    private boolean comprobarEjemplar(String codigoIntroducido, String tituloIntroducido){
        
        return comprobarCodigoIntroducido(codigoIntroducido) 
                && comprobarTituloIntroducido(tituloIntroducido);
        
    }
    
    private boolean comprobarCodigoIntroducido(String codigoIntroducido){
        
        String patron = "^[a-zA-Z]+\\d{4}$";
        
        return codigoIntroducido != null 
                && codigoIntroducido.matches(patron) 
                && !listaCodigos.contains(codigoIntroducido);
        
    }
    
    private boolean comprobarTituloIntroducido(String tituloIntroducido){
        
        String patron = "^.{1,30}$";
        
        return tituloIntroducido != null && tituloIntroducido.matches(patron);
        
    }
    
}
