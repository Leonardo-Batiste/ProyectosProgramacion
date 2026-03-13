package exceptions;

public class AsignaturasException extends Exception {
    public AsignaturasException(String message) {

        super("Error: "+message);
    }
}
