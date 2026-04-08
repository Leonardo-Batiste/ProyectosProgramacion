package main;

import java.io.File;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        
        System.out.println("Escribe:");
        
        String cadena = prompt.nextLine();
        
        File fichero = new File(cadena);
        
        mostrarContenido(fichero);
        
    }
    
    public static void mostrarContenido(File fichero){
        if (!fichero.isDirectory()){
            return;
        }
        for (File f : fichero.listFiles()){
            System.out.println(f);
            mostrarContenido(f);
        }
    }

}
