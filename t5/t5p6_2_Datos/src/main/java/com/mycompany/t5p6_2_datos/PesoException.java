package com.mycompany.t5p6_2_datos;

public class PesoException extends Exception {
	public PesoException() {
		super("Error. Peso tiene que estar entre 12 y 25 o nulo.");
	}
}