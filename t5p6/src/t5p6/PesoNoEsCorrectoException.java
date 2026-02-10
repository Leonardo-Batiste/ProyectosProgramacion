package t5p6;

public class PesoNoEsCorrectoException extends Exception {
	public PesoNoEsCorrectoException() {
		super("Error. Peso tiene que estar entre 12 y 25 o nulo.");
	}
}
