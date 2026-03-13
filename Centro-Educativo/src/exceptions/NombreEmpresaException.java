package exceptions;

public class NombreEmpresaException extends Exception {
    public NombreEmpresaException(String message) {

        super("Error: "+message);
    }
}
