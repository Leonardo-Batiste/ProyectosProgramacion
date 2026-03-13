package exceptions;

public class NombreAlumnoException extends Exception {
    public NombreAlumnoException(String message) {
        super("Error: "+message);
    }
}
