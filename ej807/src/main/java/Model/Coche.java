package Model;

public class Coche {
    
    protected static int incrementativo = 0;
    
    protected String codigo;
    
    protected String matricula;
    
    protected String modelo;
    
    /**
     * !!!atributo precio es con impuestos incluidos?
     */
    protected double precio;
    
    protected boolean aLaVenta;
   
    protected final double iva = 0.20;
    
    public Coche(String matriculaCoche, String modeloCoche, double precioCocheSinImpuestos){
        
        this.codigo = "2021-" + ++incrementativo;
        
        this.matricula = matriculaCoche;
        
        this.modelo = modeloCoche;
        
        this.precio += precioCocheSinImpuestos * this.iva;
        
        this.aLaVenta = true;
        
    }
    
    
}
