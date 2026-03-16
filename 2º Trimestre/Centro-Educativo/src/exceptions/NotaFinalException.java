package exceptions;

public class NotaFinalException extends Exception {
    public NotaFinalException(String message) {

        super("Error: "+message);
    }
}
