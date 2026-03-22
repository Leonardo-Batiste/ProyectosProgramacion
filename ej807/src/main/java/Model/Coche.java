package Model;

import java.util.*;

public class Coche {
    
    protected static int incrementativo = 0;
    
    protected String codigo;
    
    protected String matricula;
    
    protected String modelo;
    
    protected static ArrayList<Coche> listaCoches = new ArrayList<>();
    
    /**
     * !!!atributo precio es con impuestos incluidos?
     */
    protected Double precio;
    
    protected boolean aLaVenta;
   
    protected final double iva = 0.20;
    
    public Coche(String matriculaCoche, String modeloCoche, Double precioCocheSinImpuestos){
        
        this.codigo = generarCodigo();
        
        this.matricula = matriculaCoche;
        
        this.modelo = modeloCoche;
        
        this.precio = precioCocheSinImpuestos + (precioCocheSinImpuestos * this.iva);
        
        this.aLaVenta = true;
        
        
        
    }
    
    private String generarCodigo(){
        
        String codigo = "2021-" + incrementativo++;
        
        return codigo;
        
    }

    public static ArrayList<Coche> getListaCoches() {
        return listaCoches;
    }

    public static void añadirCoche(Coche cocheParaAñadir){
        
        listaCoches.add(cocheParaAñadir);
        
    }
    
    public static String getProximoCodigo(){
        
        return "2021-" + incrementativo;
        
    }
    
    public String toString(){
        
        return this.matricula; //!!!Aqui no se que hay que devolver la verdad
        
    }
    
}
