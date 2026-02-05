public abstract class Ejemplar {
    protected int codigo; // Como el isbn supongo?

    protected String titulo;

    protected boolean estaPrestado;

    public Ejemplar(int codigo, String titulo) {
    	this.codigo=codigo;
    	this.titulo=titulo;
    	this.estaPrestado=false;
    }
    
    /**
     * Devuelve el numero de dias maximos de prestamo del ejemplar
     * @return int
     */
    public abstract int getDiasPrestamo();

    public String toString() {
    	return "Codigo ejemplar: "+this.codigo+
    			"Titulo ejemplar: "+this.titulo+
    			"Esta prestado?"+this.estaPrestado;
    }
    
    public void prestarEjemplar() {
    	this.estaPrestado = true;
    }
    
    public void devolverEjemplar() {
    	this.estaPrestado = false;
    }
    
    public boolean getEstaPrestado() {
    	return this.estaPrestado;
    }
    
}













