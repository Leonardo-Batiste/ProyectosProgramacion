package t5p6;

public class Dato {
	protected int cantidad;
	
	protected String palabra;
	
	protected float peso;
	
	/**
	 * Constructor de la clase
	 * @param cantidad
	 * @param palabra
	 * @param peso
	 */
	public Dato(int cantidad, String palabra, float peso) throws CantidadInferiorCeroException{
		
            
		
            this.cantidad=cantidad;
            this.palabra=palabra;
            this.peso=peso;
            
	}
}