/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t7ejer8;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class ComparadorNombre implements Comparator<Contacto>{
    @Override
    public int compare(Contacto c1, Contacto c2){
        return c1.nombre.compareTo(c2.nombre);
    }
}
