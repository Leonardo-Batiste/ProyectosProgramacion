package exceptions;

public class notasInvalidasException extends Exception {
    public notasInvalidasException(String message) {

        super("Error: "+message);
    }
}
