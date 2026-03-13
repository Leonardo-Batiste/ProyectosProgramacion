package controller;
import exceptions.AsignaturasException;
import exceptions.NombreAlumnoException;
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
        try {
            VistaAlumno vistaAlumno = new VistaAlumno();

            String nombreAlumno = vistaAlumno.pedirNombreAlumno();

            TreeSet<Asignatura> asignaturasAlumno = vistaAlumno.pedirAsignaturasAlumno();


            Alumno alumno = new Alumno(nombreAlumno, asignaturasAlumno);
            listaAlumnos.add(alumno);
        }
        catch (NombreAlumnoException | AsignaturasException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void ponerNotasAlumno(){
        //!!! a lo mejor esto iria en la clase vistaAlumno?
        int numeroExpedienteABuscar = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del expediente del alumno deseado"));

        String expedienteABuscar = "ENLACES_"+numeroExpedienteABuscar;

        Iterator<Alumno> it = listaAlumnos.iterator();

        while (it.hasNext()){
            Alumno al = it.next();

            String expedienteAlumno = al.getExpediente();

            if (expedienteAlumno.equals(expedienteABuscar)){
                for (Asignatura as : al.getAsignaturas()) {
                    if (as instanceof AsignaturaEmpresa ae) {
                        Float notaFinalAsignar = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota final para la asignatura llamada " + as.getNombre()));
                        ae.setNotaFinal(notaFinalAsignar);
                    }
                    else if (as instanceof AsignaturaPresencial ap) {
                        int numeroTotalPracticas = ap.getNumeroPracticas();
                        for (int i = 0; i < numeroTotalPracticas; i++) {
                            Float nota = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota para la practica " + i + ", de la asignatura " + ap.getNombre()));

                            ap.añadirNota(nota);
                        }
                    }
                }
                break;
            }
        }

        //!!!Aqui faltaria un if por si no se ha encontrado al alumno con ese expediente
    }
}
