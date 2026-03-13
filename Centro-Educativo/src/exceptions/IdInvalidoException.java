package exceptions;

public class IdInvalidoException extends Exception {
    public IdInvalidoException(String message) {
        super("Error: "+message);
    }
}
