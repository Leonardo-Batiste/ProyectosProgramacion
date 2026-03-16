package com.mycompany.t5p6_2_datos;

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
	public Dato(int cantidad, String palabra, float peso) throws CantidadException {
            if (cantidad<0) {
                throw new CantidadInferiorCeroException("La cantidad da error porque es inferior a 0.");
            }
            
            this.cantidad=cantidad;
            this.palabra=palabra;
            this.peso=peso;
            
	}
}