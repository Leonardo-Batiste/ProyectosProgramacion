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
        
        return "Matricula del coche: "+this.matricula+"\n"
                + "Precio del coche: "+this.precio;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setaLaVenta(boolean aLaVenta) {
        this.aLaVenta = aLaVenta;
    }

    public double getIva() {
        return iva;
    }
    
    
    
    
    
}
