/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploarraylist;

import java.util.*;

/**
 *
 * @author AluDAM
 */
public class EjemploArrayList {

    public static void main(String[] args) {
        
        /**
         * Manera de crear un arraylist de tipo de una clase
         * Empieza en la posicion cero
         */
        ArrayList<Persona> personas = new ArrayList<Persona>;
        
        /**
         * Si no se concreta el tipo el defecto es de objetos, y admite todo
         * Empieza en la posicion cero
         */
        ArrayList numeros=new ArrayList();
        
        /**
         * Metodos que tienen todas las colecciones de Collection
         */
        
        /**
         * Cuantos elmentos tiene el arraylist
         */
        System.out.println(numeros.size());
        
        /**
         * Añadir 1 elemento <1>
         */
        numeros.add(1);
        
        /**
         * Comprobar que contiene <1>
         * Devuelve un booleano
         */
        System.out.println(numeros.contains(1));
        
        /**
         * Como no se ha concretado tipo, se puede añadir lo que sea, como un String
         */
        numeros.add("Hola");
        
        /**
         * Sacar arraylist por pantalla
         */
        System.out.println(numeros);
        
        /**
         * Borrar elmento
         * Si se elimina un elemento que esta entre 2, el array se compactara
         */
        numeros.remove("Hola");
        
        /**
         * Metodos propios de Arraylist
         */
        
        /**
         * Mirar posicion en la que esta el <1>
         */
        System.out.println(numeros.indexOf(1)+"");
        
        /**
         * Añademe en la posicion <1> un <20>
         */
        numeros.add(1,20);
        
        System.out.println(numeros);
        
        /**
         * No se puede añadir elementos a indices que no son el siguiente
         * Por ejemplo:
         * Esto añadiria en la posicion 10, un 100, pero como el anterior 
         * elemento esta en la posicion 1, no se puede
         */
        numeros.add(10,100);
        
        /**
         * Devuelve elemento que esta en la posicion <3>
         */
        numeros.get(3);
        
        
        
    }
}
