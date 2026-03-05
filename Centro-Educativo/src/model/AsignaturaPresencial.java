package model;
import exceptions.*;
import java.util.*;

public class AsignaturaPresencial extends Asignatura {
    /**
     * Rango: (1-14)
     */
    protected int numeroPracticas;


    /**
     * Rango(1.0-10.0)
     */
    List<Float> notas = new LinkedList<>();


    /**
     *
     * @param id Código de 4 caracteres. Debe empezar por una letra (no número).
     * @param nombre Entre 1 y 20 caracteres.
     * @param numeroPracticas Rango(1-14)
     * @param notas float, Rango(1.0-10.0)
     * Criterio aprobado Media de todas las prácticas >= 5 Y ninguna práctica inferior a 4.
     */
    public AsignaturaPresencial(String id, String nombre, int numeroPracticas, LinkedList<Float>notas) throws NombreInvalidoException,
                                                                                                    IdInvalidoException,
                                                                                                    numeroPracticasException,
                                                                                                    notasInvalidasException{
        super(id, nombre);

        if (numeroPracticas<1 || numeroPracticas>14){
            throw new numeroPracticasException("el numero de practicas introducido, tiene que ser en un rango de: 1-14");
        }
        else{
            this.numeroPracticas=numeroPracticas;
        }

        boolean notasEsCorrecto=true;
        for (Float nota : notas){
            if (nota<1 || nota>10 || nota==null){
                notasEsCorrecto=false;
                break;
            }
        }

        if (notasEsCorrecto){
            this.notas=notas;
        }
        else {
            throw new notasInvalidasException("en el rango de las notas, tiene que ser una nota de: 1-10");
        }
    }

    public void mediaAprobados(LinkedList<Float> notas){

    }

}
