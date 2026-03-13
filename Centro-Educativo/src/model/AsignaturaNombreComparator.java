package model;
import java.util.*;

/**
 * Ordena alfabeticamente, pero si hay dos asignaturas con el mismo nombre, las ordena por su ID.
 * Que devuelve el comparator dependiendo del numero resultante, entre 2 numeros (01, 02):
 * <ul>
 *     <li>-1 --> 01 < 02 </li>
 *     <li>0 --> 01 == 02 </li>
 *     <li>1 --> 01 > 02 </li>
 * </ul>
 */
public class AsignaturaNombreComparator implements Comparator<Asignatura>{
    @Override
    public int compare(Asignatura a1, Asignatura a2){
       int resultadoComparacion = a1.getNombre().compareTo(a2.getNombre());

       if (resultadoComparacion==0){
            return a1.getID().compareTo(a2.getID());
       }

       return resultadoComparacion;
    }
}
