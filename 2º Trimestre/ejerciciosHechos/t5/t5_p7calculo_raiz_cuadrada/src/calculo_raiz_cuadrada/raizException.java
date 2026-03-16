package calculo_raiz_cuadrada;

public class raizException extends Exception {
	public raizException() {
		super("Error. Numero es negativo.");
	}
}