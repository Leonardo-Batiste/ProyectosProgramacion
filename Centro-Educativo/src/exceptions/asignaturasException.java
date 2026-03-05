package exceptions;

public class asignaturasException extends Exception {
    public asignaturasException(String message) {

        super("Error: "+message);
    }
}
