package exceptions;

public class nombreEmpresaException extends Exception {
    public nombreEmpresaException(String message) {

        super("Error: "+message);
    }
}
