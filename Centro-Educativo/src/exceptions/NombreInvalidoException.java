package exceptions;

public class NombreInvalidoException extends Exception {
    public NombreInvalidoException(String message) {
        super("Error: "+message);
    }
}
