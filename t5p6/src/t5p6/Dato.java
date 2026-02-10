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
	public Dato(int cantidad, String palabra, float peso) throws CantidadInferiorCeroException, 
																	PesoNoEsCorrectoException, 
																	PalabraNulaException,
																	PalabraNumeroCaracteresException,
																	PalabraCaracterEspecialException{
		if (cantidad<=0) {
			throw new CantidadInferiorCeroException();
		}
		
		if (peso<12 || peso >25) {
			throw new PesoNoEsCorrectoException();
		}
		
		if (palabra == null) {
			throw new PalabraNulaException();
		}
		
		if (palabra.length()>10 || palabra.length()<2) {
			throw new PalabraNumeroCaracteresException();
		}
		
		for (int i=0;i<palabra.length();i++) {
			char caracter=palabra.charAt(i);
			if (caracter=='$') {
				throw new PalabraCaracterEspecialException();
			}
		}
		
		this.cantidad=cantidad;
		this.palabra=palabra;
		this.peso=peso;
	}
	
	
	
	
}
