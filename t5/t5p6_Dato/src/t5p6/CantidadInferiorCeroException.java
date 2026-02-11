package t5p6;

public class CantidadInferiorCeroException extends Exception {
	public CantidadInferiorCeroException() {
		super("Cantidad es igual o inferior a cero");
	}
}
