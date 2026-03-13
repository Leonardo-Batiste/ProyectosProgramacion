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
     * !!!Esto a lo mejor seria un mapa? Ya que cada practica tiene una nota?
     */
    private LinkedList<Float> notas;

    /**
     * @param id String.Código de 4 caracteres. Debe empezar por una letra (no número).
     * @param nombre String.Entre 1 y 20 caracteres.
     * @param numeroPracticas Rango(1-14)
     */
    public AsignaturaPresencial(String id, String nombre, int numeroPracticas)
            throws NombreInvalidoException, IdInvalidoException,
            NumeroPracticasException, NotasInvalidasException {

        super(id, nombre);

        if (numeroPracticas < 1 || numeroPracticas > 14) {
            throw new NumeroPracticasException("El número de prácticas introducido tiene que estar en un rango de 1-14");
        }
        this.numeroPracticas = numeroPracticas;


        //!!!Mirar si LinkedList las ordena por insercion
        this.notas = new LinkedList<>();
    }

    /**
     * Comprueba que las notas individuales de la lista estén en el rango 1-10 y no sean null.
     * @param notas LinkedList<Float>
     * @return boolean
     */
    private boolean notasEnRangoValido(LinkedList<Float> notas) {
        for (Float nota : notas) {
            if (nota == null || nota < 1 || nota > 10) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calcula la nota media de la colección.
     * @return float con la nota media
     */
    public float getNotaMedia() {
        float sumaNotas = 0;
        for (Float nota : notas) {
            sumaNotas += nota;
        }
        return sumaNotas / notas.size();
    }

    /**
     * Comprueba si alguna nota es inferior a 4.
     * @return true si todas las notas son >= 4, false en caso contrario
     */
    private boolean todasLasNotasSuperanCuatro() {
        for (Float nota : notas) {
            if (nota < 4) {
                return false;
            }
        }
        return true;
    }

    /**
     * Criterio de aprobado: Media de todas las prácticas >= 5 Y ninguna práctica inferior a 4.
     * @return boolean
     */
    public boolean mediaHaAprobado() {
        float notaMedia = getNotaMedia();
        boolean sinNotasInferioresACuatro = todasLasNotasSuperanCuatro();
        return notaMedia >= 5 && sinNotasInferioresACuatro;
    }

    public void añadirNota(Float notaAñadir){
        this.notas.add(notaAñadir);
    }

    public int getNumeroPracticas(){
        return this.numeroPracticas;
    }
}