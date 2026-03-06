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
    private List<Float> notas = new LinkedList<>();

    /**
     * @param id String.Código de 4 caracteres. Debe empezar por una letra (no número).
     * @param nombre String.Entre 1 y 20 caracteres.
     * @param numeroPracticas Rango(1-14)
     * @param notas LinkedList<Float>, Rango(1.0-10.0)
     */
    public AsignaturaPresencial(String id, String nombre, int numeroPracticas, LinkedList<Float> notas)
            throws NombreInvalidoException, IdInvalidoException,
            NumeroPracticasException, NotasInvalidasException {

        super(id, nombre);

        if (numeroPracticas < 1 || numeroPracticas > 14) {
            throw new NumeroPracticasException("El número de prácticas introducido tiene que estar en un rango de 1-14");
        }
        this.numeroPracticas = numeroPracticas;

        // Validar que las notas estén en el rango permitido (1-10) y no sean null
        if (!notasEnRangoValido(notas)) {
            throw new NotasInvalidasException("Las notas deben estar en el rango 1-10 y no contener valores null");
        }
        this.notas = new LinkedList<>(notas);
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
}