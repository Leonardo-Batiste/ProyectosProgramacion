package com.mycompany.t5p6_2_datos;

public class PalabraCaracterEspecialException extends PalabraException {
	public PalabraCaracterEspecialException() {
		super("la palabra no puede contener el caracter '$' ");
	}
}