package exceptions;

public class numeroPracticasException extends Exception {
    public numeroPracticasException(String message) {
        super("Error: "+message);
    }
}
