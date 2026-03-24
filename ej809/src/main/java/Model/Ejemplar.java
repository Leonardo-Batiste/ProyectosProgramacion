package Model;

import java.util.*;

public abstract class Ejemplar {
    
    /**
     * No repetible
     * 1 letra y 4 numeros
     */
    protected String codigo;
    
    protected static ArrayList<String> listaCodigos = new ArrayList<>();
    
    /**
     * Maximo 30 caracteres
     */
    protected String titulo;
    
    protected int diasPrestar;
    
    protected boolean estaPrestado;
    
    protected static ArrayList<Ejemplar> listaEjemplares = new ArrayList<>();
    
    public Ejemplar(String codigoIntroducido, String tituloIntroducido){
        
        if (comprobarEjemplar(codigoIntroducido, tituloIntroducido)){
            
            this.codigo = codigoIntroducido;
            listaCodigos.add(codigoIntroducido);
            
            this.titulo = tituloIntroducido;
            
            this.diasPrestar = getDiasPrestar();
            
            this.estaPrestado = false;
            
            listaEjemplares.add(this);
            
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
    
    protected abstract int getDiasPrestar();
    
}
