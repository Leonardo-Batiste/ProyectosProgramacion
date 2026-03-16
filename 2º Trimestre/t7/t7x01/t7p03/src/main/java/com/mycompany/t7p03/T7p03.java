/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t7p03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author AluDAM
 */
public class T7p03 {

    // Método recursivo para invertir una cadena
    public static String reverseString(String fraseRecursiva) {
        if (fraseRecursiva == null) {
            return null; // o lanzar excepción si lo prefieres
        }
        // caso base: cadena vacía
        if (fraseRecursiva.isEmpty()) {
            System.out.println("La frase esta vacia.");
            return fraseRecursiva;
        }
        // paso recursivo: invertir substring(1..) y añadir el primer carácter al final
        return reverseString(fraseRecursiva.substring(1)) + fraseRecursiva.charAt(0);
    }
    
    public static void main(String[] args) {
        ArrayList<Character> array =new ArrayList<Character>();
        Scanner prompt=new Scanner(System.in);
        
        System.out.print("Introduce una frase: ");
        String frase=prompt.nextLine();
        
        for (int i=0;i<frase.length();i++){
            char caracter=frase.charAt(i);
            array.add(Character.valueOf(caracter));
        }
        
        Collections.reverse(array);
        
        System.out.println("Pila: "+"\n"+array);
        
        System.out.println("Tamaño arrayList: "+array.size());
        
        System.out.println(reverseString(frase));
        
    }
}
