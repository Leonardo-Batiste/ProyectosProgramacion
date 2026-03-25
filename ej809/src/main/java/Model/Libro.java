package Model;

public class Libro extends Ejemplar {
    
    /**
     * Not null
     */
    protected String editorial;
    
    /**
     * Minimo 1 pagina
     */
    protected int numeroPaginas;
    
    public Libro(String codigoIntroducido, String tituloIntroducido, String editorialIntroducida, Integer numeroPaginasIntroducido){
        
        super(codigoIntroducido, tituloIntroducido);
        
         if (comprobarLibro(editorialIntroducida, numeroPaginasIntroducido)){
             
             this.editorial = editorialIntroducida;
             
             this.numeroPaginas = numeroPaginasIntroducido;
             
         }
         else{
             
             //!!!Mostrar un mensaje con JDialog de error.
             
         }
        
    }
    
    private boolean comprobarLibro(String editorialIntroducida, int numeroPaginasIntroducido){
        
        return comprobarEditorialIntroducida(editorialIntroducida) 
                && comprobarNumeroPaginasIntroducido(numeroPaginasIntroducido);
        
    }
    
    private boolean comprobarEditorialIntroducida(String editorialIntroducida){
        
        return editorialIntroducida != null;

    }
    
    private boolean comprobarNumeroPaginasIntroducido(int numeroPaginasIntroducido){
        
        return numeroPaginasIntroducido > 0;
        
    }
    
    @Override
    protected int getDiasPrestar(){
        
        return 15;
        
    }
    
    @Override
    public String toString(){
        String cadena = "Editorial: " + editorial + "\n"
                + "numero de paginas: " + numeroPaginas;
        return "\n" + super.toString() + cadena;
    }
    
}
