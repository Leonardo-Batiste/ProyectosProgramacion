package com.mycompany.t5p6_2_datos;

public class CantidadInferiorCeroException extends Exception {
	public CantidadInferiorCeroException() {
		super("Cantidad es igual o inferior a cero");
	}
}