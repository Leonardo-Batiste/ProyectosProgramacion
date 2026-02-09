/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebahashmap;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author AluDAM
 */
public class PruebaHashMap {

    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap <String, String>();
        String palabra, respuesta;
        Scanner prompt = new Scanner(System.in); //Cambiar esto por scanner
        
        diccionario.put("Hola", "Hello");
        diccionario.put("Adios", "Bye");
        diccionario.put("Buenos dias", "Good morning");
        diccionario.put("Buenas tardes", "Good afternoon");
        diccionario.put("Buenas noches", "Good night");
        diccionario.put("Mermelada", "Jam");
        diccionario.put("Atasco", "Jam");
        
        System.out.println("Mini-diccionario Español-Ingles");
        do {
            palabra = prompt.nextLine("Dime una frase en español");
            if (diccionario.containsKey(palabra)){
                System.out.println(palabra + " se dice en ingles: "+diccionario.get(palabra));
            }
            else{
                System.out.println(palabra+" no se encuentra en el diccionario");
            }
            respuesta = prompt.leerString("Quieres buscar otra palabra (S/N): ");
        } while (respuesta.equalsIgnoreCase("S"));
    }
}
