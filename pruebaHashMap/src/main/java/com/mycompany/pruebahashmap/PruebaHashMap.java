package com.mycompany.pruebahashmap;

import java.util.HashMap;
import java.util.Scanner;

public class PruebaHashMap {

    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>();
        String palabra, respuesta;
        Scanner prompt = new Scanner(System.in); 
        
        diccionario.put("Hola", "Hello");
        diccionario.put("Adios", "Bye");
        diccionario.put("Buenos dias", "Good morning");
        diccionario.put("Buenas tardes", "Good afternoon");
        diccionario.put("Buenas noches", "Good night");
        diccionario.put("Mermelada", "Jam");
        diccionario.put("Atasco", "Jam");
        
        System.out.println("--- Mini-diccionario Español-Ingles ---");
        
        do {
            System.out.print("\nDime una palabra en español: ");
            palabra = prompt.nextLine(); // Leemos la palabra
            
            if (diccionario.containsKey(palabra)) {
                System.out.println(palabra + " se dice en ingles: " + diccionario.get(palabra));
            } else {
                System.out.println(palabra + " no se encuentra en el diccionario.");
            }
            
            System.out.print("¿Quieres buscar otra palabra? (S/N): ");
            respuesta = prompt.nextLine(); // Leemos la respuesta (S o N)
            
        } while (respuesta.equalsIgnoreCase("S"));
        
        System.out.println("¡Programa finalizado!");
        prompt.close(); // Cerramos el scanner
    }
}