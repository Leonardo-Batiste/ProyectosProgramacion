package model;
import java.util.*;
import exceptions.*;

public class Alumno {
    /**
     * Autoincremental comenzando con 0. Formato: ENLACES_XXXXXX (ej.
     * ENLACES_000000, ENLACES_000001, ENLACES_000002 …..
     * ENLACES_004789).
     * !!!No lo he hecho porque no se usar printf o String lo que sea
     */
    protected String expediente;

    /**
     *
     */
    private static int numeroExpediente=0;

    /**
     * Entre 2 y 25 caracteres
     */
    protected String nombre;

    /**
     * Una colección de objetos Asignatura. Podrán mezclarse presenciales y no
     * presenciales. No se permiten duplicados (mismo ID).
     */
    protected TreeSet<Asignatura> asignaturas;

    /**
     *
     * @param nombreAlumno
     * @param asignaturasAlumno
     */
    public Alumno(String nombreAlumno, TreeSet<Asignatura>asignaturasAlumno)
        throws NombreAlumnoException, AsignaturasException
    {

        if (!nombreAlumnoValido(nombreAlumno)){
            throw new NombreAlumnoException("el nombre del alumno, tiene que estar en el rango permitido y no puede ser null");
        }
        this.nombre=nombreAlumno;

        if (!asignaturasValido(asignaturasAlumno)){
            throw new AsignaturasException("el treeSet de asignaturas no puede ser null.");
        }
        this.asignaturas = new TreeSet<>(new AsignaturaNombreComparator());
        for (Asignatura al : asignaturasAlumno){
            this.asignaturas.add(al);
        }


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

    /**
     * Se comprueba que tanto el set, como los indices de dentro no sean null
     * @param asignaturas TreeSet<Asignatura>
     * @return true, si no exsiten null
     */
    public boolean asignaturasValido(TreeSet<Asignatura> asignaturas){
        if (asignaturas==null){return false;}

        for (Asignatura as : asignaturas){
            if (as == null){
                return false;
            }
        }
        return true;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getExpediente(){
        return this.expediente;
    }

    public TreeSet<Asignatura> getAsignaturas(){
        return this.asignaturas;
    }

}
