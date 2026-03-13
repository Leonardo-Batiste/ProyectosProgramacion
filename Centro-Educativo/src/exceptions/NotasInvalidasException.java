package exceptions;

public class NotasInvalidasException extends Exception {
    public NotasInvalidasException(String message) {

        super("Error: "+message);
    }
}
