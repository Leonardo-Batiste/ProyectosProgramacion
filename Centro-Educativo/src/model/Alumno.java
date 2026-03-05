package model;
import java.util.*;
import exceptions.*;

public class Alumno {
    /**
     * Autoincremental comenzando con 0. Formato: ENLACES_XXXXXX (ej.
     * ENLACES_000000, ENLACES_000001, ENLACES_000002 …..
     * ENLACES_004789).
     */
    protected String expediente;

    /**
     *
     */
    private static int numeroExpediente=000000;

    /**
     * Entre 2 y 25 caracteres
     */
    protected String nombre;

    /**
     * Una colección de objetos Asignatura. Podrán mezclarse presenciales y no
     * presenciales. No se permiten duplicados (mismo ID).
     */
    protected Set<Asignatura> asignaturas = new TreeSet<>();

    /**
     *
     * @param nombreAlumno
     * @param asignaturasAlumno
     */
    public Alumno(String nombreAlumno, Set<Asignatura>asignaturasAlumno)
        throws nombreAlumnoException
    {

        if (!nombreAlumnoValido(nombreAlumno)){
            throw new nombreAlumnoException("el nombre del alumno, tiene que estar en el rango permitido y no puede ser null");
        }
        this.nombre=nombreAlumno;




        //Como este crea el autoincremental, lo dejo el ultimo por si los demas dan error, que este no se salte numeros
        this.expediente=crearExpedienteAlumno();
    }

    public String crearExpedienteAlumno(){
        String expedienteFinal = "Enlaces_"+numeroExpediente++;

        return expedienteFinal;
    }

    public boolean nombreAlumnoValido(String nombre){
        if (nombre==null){return false;}

        String patronNombre = "^.{2,25}$";

        return nombre.matches(patronNombre);
    }

}
