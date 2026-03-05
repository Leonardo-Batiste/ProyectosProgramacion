package exceptions;

public class nombreAlumnoException extends Exception {
    public nombreAlumnoException(String message) {
        super("Error: "+message);
    }
}
