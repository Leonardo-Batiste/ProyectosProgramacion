package com.mycompany.t5p6_2_datos;

public class PalabraNumeroCaracteresException extends PalabraException {
	public PalabraNumeroCaracteresException() {
		super("tiene que tener menos de 10 caracteres y mas de 2");
	}
}