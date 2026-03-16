/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.expresionesregulares;
import java.util.*;
import java.util.regex.*;
/**
 *
 * @author AluDAM
 */
public class ExpresionesRegulares {

    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Introduce el patron a buscar");
        
        String patronBusqueda = prompt.nextLine();
        Pattern patron = Pattern.compile(patronBusqueda);
        
        // Ejemplo: \d{8} \w dni 8 digitos seguidos de una letra
        // Ejemplo: \d{1,8}[A-Z] dni de 1 a 8 digitos seguidos de una letra mayor
        
        System.out.println("Introduce el texto donde quieres buscar el patron");
        String texto = prompt.nextLine();
        Matcher encaja = patron.matcher(texto);
        
        if (encaja.matches()){
            System.out.println("Encaja el patron");
        }
        else{
            System.out.println("No encaja el patron");
        }
    }
}
