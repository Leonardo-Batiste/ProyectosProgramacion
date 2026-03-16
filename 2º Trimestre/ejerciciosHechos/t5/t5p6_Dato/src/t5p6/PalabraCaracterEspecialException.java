package t5p6;

public class PalabraCaracterEspecialException extends Exception {
	public PalabraCaracterEspecialException() {
		super("Error. La palabra no puede contener el caracter '$' ");
	}
}
