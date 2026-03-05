package exceptions;

public class notaFinalException extends Exception {
    public notaFinalException(String message) {

        super("Error: "+message);
    }
}
