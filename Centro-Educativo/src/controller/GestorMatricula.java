package controller;
import model.*;
import view.*;

import javax.swing.*;
import java.util.*;

public class GestorMatricula {
    protected ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    /**
     * Solicita datos personales y abre un submenú para añadir asignaturas
     * (Presencial, Empresa o Finalizar). Por lo menos tendrá que estar matriculado en una
     * asignatura
     */
    public void altaAlumno(){
        VistaAlumno vistaAlumno = new VistaAlumno();

        String nombreAlumno = vistaAlumno.pedirNombreAlumno();

        TreeSet<Asignatura> asignaturasAlumno = vistaAlumno.pedirAsignaturasAlumno();


        Alumno alumno = new Alumno(nombreAlumno, asignaturasAlumno);
        listaAlumnos.add(alumno);
    }

}
