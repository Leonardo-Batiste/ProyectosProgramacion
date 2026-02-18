/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t7p04;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author AluDAM
 */
public class T7p04 {

    public static boolean esPalindromo(Stack<Character> pila){
        boolean es=false;
        
        for (int i=0;i<pila.size();i++){
            
            if (pila.get(i)==(' ')){
                continue;
            }
            
            if (pila.get(i)==('.')){
                continue;
            } 
            
            if (pila.get(i) == pila.get(pila.size()-i-1)){
                es=true;
            }
        }
        
        return es;
    }
    
    public static void main(String[] args) {
        Scanner prompt=new Scanner(System.in);
        
        System.out.println("Escribe: ");
        String lineaTexto=prompt.nextLine();
        
        Stack<Character> pila=new Stack<Character>();
        
        for (int i=0;i<lineaTexto.length();i++){
            char caracter=lineaTexto.charAt(i);
            
            pila.add(Character.valueOf(caracter));
            
        }
        
        System.out.println("Pila: "+pila+"\n"+"Total pila: "+pila.size());
        
        if (esPalindromo(pila)){
            System.out.println("Es palindromo.");
        }
        else{
            System.out.println("No es palindromo.");
        }
        
    }
}
