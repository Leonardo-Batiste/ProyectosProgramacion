package com.mycompany.t7p202;

import java.util.*;

/**
 *
 * @author AluDAM
 */
public class T7p202 {

    /**
     * Crea un programa que:
     * <ul>
     * <li>[X]Lea por teclado una cantidad de cadenas de caracteres a insertar.</li>
     * <li>[X]Genera dicha cantidad de cadenas de caracteres aleatorias a partir de un vector de palabras dado, las inserta en una colección de la clase ArrayList (lista vector) y las inserta también en un colección de la clase LinkedList (lista enlazada). Cada cadena de caracteres a insertar se deberá seleccionar de forma aleatoria a partir de la siguientes palabras: secuencial, aleatorio, letra, número, frío, calor, alto, bajo, dibujo, redacción, grande, pequeño, montaña, rio</li>
     * <li>Recorra los elementos de la lista vector de cadenas con un iterador y los visualice en consola.</li>
     * <li>Recorra los elementos de la lista vector de cadenas por posición y los visualice en consola</li>
     * <li>Visualice en consola la lista enlazada de cadenas usando el método toString.</li>
     * <li>Visualice en consola la lista vector de cadenas usando el método toString.</li>
     * <li>Recorra los elementos de la lista enlazada de cadenas con un iterador y los visualice en consola.</li>
     * <li>Recorra los elementos de la lista enlazada de cadenas por posición y los visualice en consola</li>
     * </ul>
     * @param args 
     */
    public static void main(String[] args) {
        Scanner prompt=new Scanner(System.in);
        ArrayList<String> cadenasOriginales=new ArrayList<>();
        ArrayList<String> cadenasElegidas=new ArrayList<>();
        LinkedList<String> cadenasEnlazadas=new LinkedList<>();
        
        Random rand=new Random();
        
        //LLenamos el array de las posibles palabras
        Collections.addAll(cadenasOriginales, "secuencial", "aleatorio", "letra", "número", "frío", "calor",
                            "alto", "bajo", "dibujo", "redacción", "grande", "pequeño", "montaña", "rio");
        
        int tamañoArrayOriginal=cadenasOriginales.size();
        
        
        //Insertar esa cantidad de palabras aleatorias en las dos colecciones
        System.out.print("Cuantas palabras quieres generar?: ");
        int cantidadCadenas=prompt.nextInt();
        
        for (int i=0;i<cantidadCadenas;i++){   
            cadenasElegidas.add(cadenasOriginales.get(rand.nextInt(0,tamañoArrayOriginal)));
            cadenasEnlazadas.add(cadenasOriginales.get(rand.nextInt(0,tamañoArrayOriginal)));
        }
        
        //Recorrer ArrayList cadenasElegidas mediante iterador
        System.out.println("-----Recorrer ArrayList cadenasElegidas mediante iterador-----");
        for (String s: cadenasElegidas){
            System.out.print(s+" ");
        }
        System.out.println("\n");
        
        //Recorrer arraylist cadenasElegidas por indice
        System.out.println("-----Recorrer arraylist cadenasElegidas por indice-----");
        for (int i=0;i<cadenasElegidas.size();i++){
            System.out.print(i+" "+cadenasElegidas.get(i)+" ");
        }
        System.out.println("\n");
        
        //imprimir arraylist mediante toString()
        System.out.println("-----imprimir arraylist mediante toString()-----");
        System.out.print(cadenasElegidas);
        
        System.out.print("\n"+"\n");
        
        //Imprimir linkedlists
        for (String s:cadenasEnlazadas){
            System.out.print(s+" ");
        }
        
        System.out.println("\n");
        
        for (int i=0;i<cadenasEnlazadas.size();i++){
            System.out.print(cadenasEnlazadas.get(i));
        }
        
        System.out.println("\n");
        
        System.out.print(cadenasEnlazadas);
        
    }
}
