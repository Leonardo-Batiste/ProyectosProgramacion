package t5p6;

public class PalabraNumeroCaracteresException extends Exception {
	public PalabraNumeroCaracteresException() {
		super("Error. Tiene que tener menos de 10 caracteres y mas de 2");
	}
}
