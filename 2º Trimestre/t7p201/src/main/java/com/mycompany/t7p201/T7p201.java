/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t7p201;

import java.util.*;

/**
 *
 * @author AluDAM
 */
public class T7p201 {

    public static void main(String[] args) {
        Scanner prompt=new Scanner(System.in);
        ArrayList<Integer> array=new ArrayList<>();
        Random rand = new Random();
        LinkedList<Integer> arrayLinked= new LinkedList<>();
        
        
        //Scanner a cuantos numeros generar
        System.out.println("Inserta X numeros: ");
        int cantidadNumerosInsertar= prompt.nextInt();
        prompt.nextLine();
        
        //Si tiene tamaño corrceto
        System.out.println("Tamaño arrayList; "+array.size());
        
        //Rellenar las colecciones
        for (int i=0;i<cantidadNumerosInsertar;i++){
            int numeroGenerado=rand.nextInt(10,21);
            
            array.add(numeroGenerado);
            arrayLinked.add(numeroGenerado);
        }
        
        //Creamos el iterator despues de rellenar el array, porque si no, no funciona
        Iterator<Integer> it = array.iterator();
        
        //Mostramos el contenido del arraylist con el iterator
        System.out.println("Usado el iterator: ");
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        
        //Mostramos el contenido del arraylist(otra vez?) mediante posicion
        System.out.println("\n"+"Usado por posicion: ");
        for (int i=0;i<cantidadNumerosInsertar;i++){
            System.out.print(array.get(i)+" ");
        }
        
        //Visualizamos arrayList con el metodo toString()
        System.out.println("\n"+"Metodo toString: \n"+array);
        
        //Recorrer linkedlist con iterator
        System.out.println("Recorrer linkedlist con iterator");
        Iterator<Integer> itLinked =arrayLinked.iterator();
        while (itLinked.hasNext()){
            System.out.print(itLinked.next()+" ");
        }
        
        //Recorrer linkedlist con posiciones
        System.out.println("\nRecorrer linkedlist con posiciones");
        
        for (int i=0;i<cantidadNumerosInsertar;i++){
            System.out.print(arrayLinked.get(i)+" ");
            
        }
        
        //Linkedlist metodo toString
        System.out.println("\nLinkedlist toString");
        System.out.println(arrayLinked);
    }
}
