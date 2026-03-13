package exceptions;

public class NumeroPracticasException extends Exception {
    public NumeroPracticasException(String message) {
        super("Error: "+message);
    }
}
