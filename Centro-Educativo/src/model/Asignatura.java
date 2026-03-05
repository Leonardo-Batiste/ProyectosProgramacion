package model;

import exceptions.*;

public class Asignatura {
    /**
     * Código de 4 caracteres. Debe empezar por una letra (no número).
     */
    protected String id;
    private final String validarID = "^[A-Za-z]\\w{3}$";

    /**
     * Entre 1 y 20 caracteres.
     */
    protected String nombre;
    private final String validarNombre = "^.{1,20}$";


    public Asignatura (String id, String nombre) throws IdInvalidoException, NombreInvalidoException {
        if (id.matches(validarID)){
            this.id=id;
        }
        else {
            throw new IdInvalidoException("el id, debe tener 4 caracteres, y empezar por 1 letra (no numero).");
        }

        if (nombre.matches(validarNombre)){
            this.nombre=nombre;
        }
        else{
            throw new NombreInvalidoException("el nombre, debe tener entre 1 y 20 caracteres.");
        }
    }
}
