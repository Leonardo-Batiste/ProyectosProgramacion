package view;

import javax.swing.*;

import exceptions.*;
import model.*;
import java.util.*;

public class VistaAlumno {
    public String pedirNombreAlumno(){
        return JOptionPane.showInputDialog("Introduce el nombre del alumno.");

    }

    public TreeSet<Asignatura> pedirAsignaturasAlumno(){
        TreeSet<Asignatura> asignaturasAlumno = new TreeSet<>();

        boolean condicionWhile = true;
        do {
            String opcionMenu = JOptionPane.showInputDialog(null, "Elige que desea realizar:"+"\n" +
                                            "1-Añadir asignatura Presencial"+"\n" +
                                            "2-Añadir asignatura de Empresa"+"\n" +
                                            "3-Finalizar y no añadir mas asignaturas");

            switch (opcionMenu){
                case "1":
                    try {
                        String idAsignatura = JOptionPane.showInputDialog("Introduce el id de la asignatura");
                        String nombreAsignatura = JOptionPane.showInputDialog("Introduce el nombre de la asignatura");
                        int numeroPracticas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de practicas"));
                        LinkedList<Float> notasPracticas = new LinkedList<>();
                        JOptionPane.showMessageDialog(null, "Hay un total de "+numeroPracticas+" a asignar nota.");
                        for (int i=0;i<numeroPracticas;i++){
                            Float nota = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la practica " + (i+1)));
                            notasPracticas.add(nota);
                        }

                        Asignatura as = new AsignaturaPresencial(idAsignatura, nombreAsignatura, numeroPracticas, notasPracticas);
                        asignaturasAlumno.add(as);
                    }
                    catch (NombreInvalidoException | IdInvalidoException | NumeroPracticasException |
                           NotasInvalidasException e){

                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;

                case "2":
                    try {
                        String idAsignatura = JOptionPane.showInputDialog("Introduce el id de la asignatura");
                        String nombreAsignatura = JOptionPane.showInputDialog("Introduce el nombre de la asignatura");
                        String nombreEmpresa = JOptionPane.showInputDialog("Introduce el nombre de la empresa.");
                        Float notaFinal = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota final de las practicas en empresa."));

                        AsignaturaEmpresa as = new AsignaturaEmpresa(idAsignatura, nombreAsignatura, nombreEmpresa, notaFinal);
                        asignaturasAlumno.add(as);
                    }
                    catch (IdInvalidoException | NombreInvalidoException | NombreEmpresaException | NotaFinalException e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, "Ha elegido no añadir mas asignaturas al alumno.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Ha introducido una opcion erronea en el menu. Vuelve a intentarlo.");
                    continue;

            }

            if (asignaturasAlumno.size()==0){
                JOptionPane.showMessageDialog(null, "Tiene que añadir 1 asignatura como minimo. Vuelva a intentarlo.");
                continue;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ha añadido al usuario "+asignaturasAlumno.size()+" asignaturas");
                condicionWhile=false;
                return asignaturasAlumno;
            }

        } while (condicionWhile);

        JOptionPane.showMessageDialog(null, "Esto no tendria que salir en teoria.");
        return asignaturasAlumno;
    }

}
